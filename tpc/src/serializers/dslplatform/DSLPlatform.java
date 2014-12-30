package serializers.dslplatform;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import serializers.SerClass;
import serializers.SerFeatures;
import serializers.SerFormat;
import serializers.SerGraph;
import serializers.Serializer;
import serializers.TestGroups;
import serializers.dslplatform.media.Image;
import serializers.dslplatform.media.Media;
import serializers.dslplatform.media.MediaContent;
import serializers.dslplatform.media.Player;
import serializers.dslplatform.media.Size;

import com.dslplatform.client.json.JsonReader;

import data.media.MediaTransformer;

/**
 * TODO: Docs
 * Copied from Protobuf and for now no changes done
 */
public class DSLPlatform {
       public static void register(final TestGroups groups) {
              groups.media.add(new DSLPlatformMediaTransformer(), new DSLPlatformSerializer(), new SerFeatures(
                            SerFormat.JSON,
                            SerGraph.FLAT_TREE, // TODO: see if
                            SerClass.CLASSES_KNOWN, ""));
       }

       // ------------------------------------------------------------
       // Serializers

       static final class DSLPlatformSerializer extends Serializer<MediaContent> {

              private static Charset utf8 = Charset.forName("UTF-8");

              @Override
              public String getName() {
                            return "dsl-platform";
              }

              @Override
              public MediaContent deserialize(final byte[] array) throws Exception {
                     return (MediaContent) MediaContent.deserialize(new JsonReader(array, null), null);
              }

              @Override
              public byte[] serialize(final MediaContent content) throws Exception {
                     final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                     final Writer osw = new OutputStreamWriter(baos, utf8);
                     content.serialize(osw, true);
                     osw.close();
                     return baos.toByteArray();
              }

              // TODO: See what deserializeItems exactly means, and if we support it
       }

       // ------------------------------------------------------------
       // Transformers

       static final class DSLPlatformMediaTransformer extends MediaTransformer<MediaContent> {
              @Override
              public MediaContent[] resultArray(final int size) {
                     return new MediaContent[size];
              }

              // ----------------------------------------------------------
              // Forward

              @Override
              public MediaContent forward(final data.media.MediaContent commonMediaContent) {

                     final MediaContent dslPlatformMediaContent = new MediaContent();

                     dslPlatformMediaContent.setMedia(forwardMedia(commonMediaContent.getMedia()));

                     for (final data.media.Image image : commonMediaContent.images) {
                            dslPlatformMediaContent.getImages().add(forwardImage(image));
                     }

                     return dslPlatformMediaContent;
              }

              private Media forwardMedia(final data.media.Media media) {

                     final Media dslPlatformMedia = new Media();

                     dslPlatformMedia.setUri(media.uri);
                     dslPlatformMedia.setTitle(media.title);
                     dslPlatformMedia.setWidth(media.width);
                     dslPlatformMedia.setHeight(media.height);
                     dslPlatformMedia.setFormat(media.format);
                     dslPlatformMedia.setDuration(media.duration);
                     dslPlatformMedia.setSize(media.size);
                     if (media.hasBitrate) dslPlatformMedia.setBitrate(media.bitrate);
                     for (final String person : media.persons) {
                            dslPlatformMedia.getPersons().add(person);
                     }
                     dslPlatformMedia.setPlayer(forwardPlayer(media.player));
                     if (media.copyright != null) dslPlatformMedia.setCopyright(media.copyright);

                     return dslPlatformMedia;
              }

              public Player forwardPlayer(final data.media.Media.Player player) {
                     switch (player) {
                            case JAVA:
                                   return Player.JAVA;
                            case FLASH:
                                   return Player.FLASH;
                            default:
                                   throw new AssertionError("invalid case: " + player);
                     }
              }

              private Image forwardImage(final data.media.Image image) {
                     final Image dslPlatformImage = new Image();
                     dslPlatformImage.setUri(image.uri);
                     if (image.title != null) dslPlatformImage.setTitle(image.title);
                     dslPlatformImage.setWidth(image.width);
                     dslPlatformImage.setHeight(image.height);
                     dslPlatformImage.setSize(forwardSize(image.size));
                     return dslPlatformImage;
              }

              public Size forwardSize(final data.media.Image.Size size) {
                     switch (size) {
                            case SMALL:
                                   return Size.SMALL;
                            case LARGE:
                                   return Size.LARGE;
                            default:
                                   throw new AssertionError("invalid case: " + size);
                     }
              }

              // ----------------------------------------------------------
              // Reverse

              @Override
              public data.media.MediaContent reverse(final MediaContent mc) {
                     final List<data.media.Image> images = new ArrayList<data.media.Image>(mc.getImages().size());

                     for (final Image image : mc.getImages()) {
                            images.add(reverseImage(image));
                     }

                     return new data.media.MediaContent(reverseMedia(mc.getMedia()), images);
              }

              private data.media.Media reverseMedia(final Media media) {
                     // Media
                     return new data.media.Media(
                                   media.getUri()
                                   , media.getTitle()
                                   , media.getWidth()
                                   , media.getHeight()
                                   , media.getFormat()
                                   , media.getDuration()
                                   , media.getSize()
                                   , media.getBitrate()
                                   , media.getBitrate() != 0
                                   , media.getPersons()
                                   , reversePlayer(media.getPlayer())
                                   , media.getCopyright());
              }

              public data.media.Media.Player reversePlayer(final Player player) {
                     switch (player) {
                            case JAVA:
                                   return data.media.Media.Player.JAVA;
                            case FLASH:
                                   return data.media.Media.Player.FLASH;
                            default:
                                   throw new AssertionError("invalid case: " + player);
                     }
              }

              private data.media.Image reverseImage(final Image image) {
                     return new data.media.Image(
                                   image.getUri()
                                   , image.getTitle()
                                   , image.getWidth()
                                   , image.getHeight()
                                   , reverseSize(image.getSize()));
              }

              public data.media.Image.Size reverseSize(final Size size) {
                     switch (size) {
                            case SMALL:
                                   return data.media.Image.Size.SMALL;
                            case LARGE:
                                   return data.media.Image.Size.LARGE;
                            default:
                                   throw new AssertionError("invalid case: " + size);
                     }
              }

              @Override
              public data.media.MediaContent shallowReverse(final MediaContent mc) {
                     return new data.media.MediaContent(
                                   reverseMedia(mc.getMedia())
                                   , Collections.<data.media.Image> emptyList());
              }
       }
}
