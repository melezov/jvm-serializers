package serializers.dslplatform.media;



public final class Media   implements java.io.Serializable, com.dslplatform.client.json.JsonObject {
	
	
	
	public Media(
			final String uri,
			final String title,
			final int width,
			final int height,
			final String format,
			final long duration,
			final long size,
			final int bitrate,
			final java.util.List<String> persons,
			final serializers.dslplatform.media.Player player,
			final String copyright) {
			
		setUri(uri);
		setTitle(title);
		setWidth(width);
		setHeight(height);
		setFormat(format);
		setDuration(duration);
		setSize(size);
		setBitrate(bitrate);
		setPersons(persons);
		setPlayer(player);
		setCopyright(copyright);
	}

	
	
	public Media() {
			
		this.uri = "";
		this.width = 0;
		this.height = 0;
		this.format = "";
		this.duration = 0L;
		this.size = 0L;
		this.bitrate = 0;
		this.persons = new java.util.ArrayList<String>();
		this.player = serializers.dslplatform.media.Player.JAVA;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + 730674406;
		result = prime * result + (this.uri.hashCode());
		result = prime * result + (this.title != null ? this.title.hashCode() : 0);
		result = prime * result + (this.width);
		result = prime * result + (this.height);
		result = prime * result + (this.format.hashCode());
		result = prime * result + ((int) (this.duration ^ (this.duration >>> 32)));
		result = prime * result + ((int) (this.size ^ (this.size >>> 32)));
		result = prime * result + (this.bitrate);
		result = prime * result + (this.player.hashCode());
		result = prime * result + (this.copyright != null ? this.copyright.hashCode() : 0);
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		if (!(obj instanceof Media))
			return false;
		final Media other = (Media) obj;
		
		if(!(this.uri.equals(other.uri)))
			return false;
		if(!(this.title == other.title || this.title != null && this.title.equals(other.title)))
			return false;
		if(!(this.width == other.width))
			return false;
		if(!(this.height == other.height))
			return false;
		if(!(this.format.equals(other.format)))
			return false;
		if(!(this.duration == other.duration))
			return false;
		if(!(this.size == other.size))
			return false;
		if(!(this.bitrate == other.bitrate))
			return false;
		if(!((this.persons == other.persons || this.persons != null && this.persons.equals(other.persons))))
			return false;
		if(!(this.player.equals(other.player)))
			return false;
		if(!(this.copyright == other.copyright || this.copyright != null && this.copyright.equals(other.copyright)))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Media(" + uri + ',' + title + ',' + width + ',' + height + ',' + format + ',' + duration + ',' + size + ',' + bitrate + ',' + persons + ',' + player + ',' + copyright + ')';
	}
	
	@com.fasterxml.jackson.annotation.JsonCreator private Media(
			@com.fasterxml.jackson.annotation.JsonProperty("_helper") final boolean _helper ,
			@com.fasterxml.jackson.annotation.JsonProperty("uri") final String uri,
			@com.fasterxml.jackson.annotation.JsonProperty("title") final String title,
			@com.fasterxml.jackson.annotation.JsonProperty("width") final int width,
			@com.fasterxml.jackson.annotation.JsonProperty("height") final int height,
			@com.fasterxml.jackson.annotation.JsonProperty("format") final String format,
			@com.fasterxml.jackson.annotation.JsonProperty("duration") final long duration,
			@com.fasterxml.jackson.annotation.JsonProperty("size") final long size,
			@com.fasterxml.jackson.annotation.JsonProperty("bitrate") final int bitrate,
			@com.fasterxml.jackson.annotation.JsonProperty("persons") final java.util.List<String> persons,
			@com.fasterxml.jackson.annotation.JsonProperty("player") final serializers.dslplatform.media.Player player,
			@com.fasterxml.jackson.annotation.JsonProperty("copyright") final String copyright) {
		
		this.uri = uri == null ? "" : uri;
		this.title = title;
		this.width = width;
		this.height = height;
		this.format = format == null ? "" : format;
		this.duration = duration;
		this.size = size;
		this.bitrate = bitrate;
		this.persons = persons == null ? new java.util.ArrayList<String>() : persons;
		this.player = player == null ? serializers.dslplatform.media.Player.JAVA : player;
		this.copyright = copyright;
	}

	
	private static final long serialVersionUID = 0x0097000a;
	
	private String uri;

	
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
	@com.fasterxml.jackson.annotation.JsonProperty("uri")
	public String getUri()  {
		
		return uri;
	}

	
	public Media setUri(final String value) {
		
		if(value == null) throw new IllegalArgumentException("Property \"uri\" cannot be null!");
		this.uri = value;
		
		return this;
	}

	
	private String title;

	
	@com.fasterxml.jackson.annotation.JsonProperty("title")
	public String getTitle()  {
		
		return title;
	}

	
	public Media setTitle(final String value) {
		
		this.title = value;
		
		return this;
	}

	
	private int width;

	
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
	@com.fasterxml.jackson.annotation.JsonProperty("width")
	public int getWidth()  {
		
		return width;
	}

	
	public Media setWidth(final int value) {
		
		this.width = value;
		
		return this;
	}

	
	private int height;

	
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
	@com.fasterxml.jackson.annotation.JsonProperty("height")
	public int getHeight()  {
		
		return height;
	}

	
	public Media setHeight(final int value) {
		
		this.height = value;
		
		return this;
	}

	
	private String format;

	
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
	@com.fasterxml.jackson.annotation.JsonProperty("format")
	public String getFormat()  {
		
		return format;
	}

	
	public Media setFormat(final String value) {
		
		if(value == null) throw new IllegalArgumentException("Property \"format\" cannot be null!");
		this.format = value;
		
		return this;
	}

	
	private long duration;

	
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
	@com.fasterxml.jackson.annotation.JsonProperty("duration")
	public long getDuration()  {
		
		return duration;
	}

	
	public Media setDuration(final long value) {
		
		this.duration = value;
		
		return this;
	}

	
	private long size;

	
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
	@com.fasterxml.jackson.annotation.JsonProperty("size")
	public long getSize()  {
		
		return size;
	}

	
	public Media setSize(final long value) {
		
		this.size = value;
		
		return this;
	}

	
	private int bitrate;

	
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
	@com.fasterxml.jackson.annotation.JsonProperty("bitrate")
	public int getBitrate()  {
		
		return bitrate;
	}

	
	public Media setBitrate(final int value) {
		
		this.bitrate = value;
		
		return this;
	}

	
	private java.util.List<String> persons;

	
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
	@com.fasterxml.jackson.annotation.JsonProperty("persons")
	public java.util.List<String> getPersons()  {
		
		return persons;
	}

	
	public Media setPersons(final java.util.List<String> value) {
		
		if(value == null) throw new IllegalArgumentException("Property \"persons\" cannot be null!");
		serializers.dslplatform.Guards.checkNulls(value);
		this.persons = value;
		
		return this;
	}

	
	private serializers.dslplatform.media.Player player;

	
	@com.fasterxml.jackson.annotation.JsonProperty("player")
	public serializers.dslplatform.media.Player getPlayer()  {
		
		return player;
	}

	
	public Media setPlayer(final serializers.dslplatform.media.Player value) {
		
		if(value == null) throw new IllegalArgumentException("Property \"player\" cannot be null!");
		this.player = value;
		
		return this;
	}

	
	private String copyright;

	
	@com.fasterxml.jackson.annotation.JsonProperty("copyright")
	public String getCopyright()  {
		
		return copyright;
	}

	
	public Media setCopyright(final String value) {
		
		this.copyright = value;
		
		return this;
	}

	
	public void serialize(final java.io.Writer sw, final boolean minimal) throws java.io.IOException {
		sw.write('{');
		__serializeJsonObject(sw, minimal, false);
		sw.write('}');
	}

	void __serializeJsonObject(java.io.Writer sw, boolean minimal, boolean hasWrittenProperty) throws java.io.IOException {
		
		
			if (this.uri != null && !(this.uri.length() == 0)) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"uri\":");
				com.dslplatform.client.json.StringConverter.serialize(this.uri, sw);
			}
			else if (!minimal) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"uri\":\"\"");
			}
		
			if (this.title != null) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"title\":");
				com.dslplatform.client.json.StringConverter.serializeNullable(this.title, sw);
			}
			else if (!minimal) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"title\":null");
			}
		
			if (this.width != 0) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"width\":");
				com.dslplatform.client.json.NumberConverter.serialize(this.width, sw);
			}
			else if (!minimal) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"width\":0");
			}
		
			if (this.height != 0) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"height\":");
				com.dslplatform.client.json.NumberConverter.serialize(this.height, sw);
			}
			else if (!minimal) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"height\":0");
			}
		
			if (this.format != null && !(this.format.length() == 0)) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"format\":");
				com.dslplatform.client.json.StringConverter.serialize(this.format, sw);
			}
			else if (!minimal) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"format\":\"\"");
			}
		
			if (this.duration != 0L) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"duration\":");
				com.dslplatform.client.json.NumberConverter.serialize(this.duration, sw);
			}
			else if (!minimal) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"duration\":0");
			}
		
			if (this.size != 0L) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"size\":");
				com.dslplatform.client.json.NumberConverter.serialize(this.size, sw);
			}
			else if (!minimal) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"size\":0");
			}
		
			if (this.bitrate != 0) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"bitrate\":");
				com.dslplatform.client.json.NumberConverter.serialize(this.bitrate, sw);
			}
			else if (!minimal) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"bitrate\":0");
			}
		
		if(this.persons.size() != 0) {
			if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"persons\":[");
			com.dslplatform.client.json.StringConverter.serialize(this.persons.get(0), sw);
			for(int i = 1; i < this.persons.size(); i++) {
				sw.write(',');	
				com.dslplatform.client.json.StringConverter.serialize(this.persons.get(i), sw);
			}
			sw.write(']');
		}
		else if (!minimal) {
			if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"persons\":[]");
		}
		
		if(this.player != serializers.dslplatform.media.Player.JAVA) {
			if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"player\":\"");
			sw.write(this.player.name());
			sw.write('"');
		} else if (!minimal) {
			if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"player\":\"JAVA\"");
		}
		
			if (this.copyright != null) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"copyright\":");
				com.dslplatform.client.json.StringConverter.serializeNullable(this.copyright, sw);
			}
			else if (!minimal) {
				if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"copyright\":null");
			}
	}

	public static com.dslplatform.client.json.JsonReader.ReadJsonObject<Media> JSON_READER = new com.dslplatform.client.json.JsonReader.ReadJsonObject<Media>() {
		@Override
		public Media deserialize(final com.dslplatform.client.json.JsonReader reader, final com.dslplatform.patterns.ServiceLocator locator) throws java.io.IOException {
			return new serializers.dslplatform.media.Media(reader, locator);
		}
	};

	private Media(final com.dslplatform.client.json.JsonReader reader, final com.dslplatform.patterns.ServiceLocator _serviceLocator) throws java.io.IOException {
		
		String _uri_ = "";
		String _title_ = null;
		int _width_ = 0;
		int _height_ = 0;
		String _format_ = "";
		long _duration_ = 0L;
		long _size_ = 0L;
		int _bitrate_ = 0;
		java.util.List<String> _persons_ = new java.util.ArrayList<String>();
		serializers.dslplatform.media.Player _player_ = serializers.dslplatform.media.Player.JAVA;
		String _copyright_ = null;
		byte nextToken = reader.getNextToken();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 932140029:
						_uri_ = com.dslplatform.client.json.StringConverter.deserialize(reader);
							nextToken = reader.getNextToken();
						break;
					case -1738164983:
						_title_ = com.dslplatform.client.json.StringConverter.deserialize(reader);
							nextToken = reader.getNextToken();
						break;
					case -1786286561:
						_width_ = com.dslplatform.client.json.NumberConverter.deserializeInt(reader);
							nextToken = reader.moveToNextToken();
						break;
					case -708986046:
						_height_ = com.dslplatform.client.json.NumberConverter.deserializeInt(reader);
							nextToken = reader.moveToNextToken();
						break;
					case -1180859054:
						_format_ = com.dslplatform.client.json.StringConverter.deserialize(reader);
							nextToken = reader.getNextToken();
						break;
					case 799079693:
						_duration_ = com.dslplatform.client.json.NumberConverter.deserializeLong(reader);
							nextToken = reader.moveToNextToken();
						break;
					case 597743964:
						_size_ = com.dslplatform.client.json.NumberConverter.deserializeLong(reader);
							nextToken = reader.moveToNextToken();
						break;
					case 854445426:
						_bitrate_ = com.dslplatform.client.json.NumberConverter.deserializeInt(reader);
							nextToken = reader.moveToNextToken();
						break;
					case 181318793:
						
					if (nextToken == '[') {
						nextToken = reader.getNextToken();
						if (nextToken != ']') {
							com.dslplatform.client.json.StringConverter.deserializeCollection(reader, _persons_);
						}
						nextToken = reader.getNextToken();
					}
					else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					case 748274432:
						
					if (nextToken == '"') {
						switch(reader.calcHash()) {
							case -247728219: _player_ = serializers.dslplatform.media.Player.JAVA; break;
							case -1831302071: _player_ = serializers.dslplatform.media.Player.FLASH; break;
							default:
								throw new java.io.IOException("Unknown enum value: '" + reader.getLastName() + "' at position " + reader.positionInStream());
						}
						nextToken = reader.getNextToken();
					} else throw new java.io.IOException("Expecting '\"' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					case -1190269634:
						_copyright_ = com.dslplatform.client.json.StringConverter.deserialize(reader);
							nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 932140029:
						_uri_ = com.dslplatform.client.json.StringConverter.deserialize(reader);
							nextToken = reader.getNextToken();
						break;
					case -1738164983:
						_title_ = com.dslplatform.client.json.StringConverter.deserialize(reader);
							nextToken = reader.getNextToken();
						break;
					case -1786286561:
						_width_ = com.dslplatform.client.json.NumberConverter.deserializeInt(reader);
							nextToken = reader.moveToNextToken();
						break;
					case -708986046:
						_height_ = com.dslplatform.client.json.NumberConverter.deserializeInt(reader);
							nextToken = reader.moveToNextToken();
						break;
					case -1180859054:
						_format_ = com.dslplatform.client.json.StringConverter.deserialize(reader);
							nextToken = reader.getNextToken();
						break;
					case 799079693:
						_duration_ = com.dslplatform.client.json.NumberConverter.deserializeLong(reader);
							nextToken = reader.moveToNextToken();
						break;
					case 597743964:
						_size_ = com.dslplatform.client.json.NumberConverter.deserializeLong(reader);
							nextToken = reader.moveToNextToken();
						break;
					case 854445426:
						_bitrate_ = com.dslplatform.client.json.NumberConverter.deserializeInt(reader);
							nextToken = reader.moveToNextToken();
						break;
					case 181318793:
						
					if (nextToken == '[') {
						nextToken = reader.getNextToken();
						if (nextToken != ']') {
							com.dslplatform.client.json.StringConverter.deserializeCollection(reader, _persons_);
						}
						nextToken = reader.getNextToken();
					}
					else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					case 748274432:
						
					if (nextToken == '"') {
						switch(reader.calcHash()) {
							case -247728219: _player_ = serializers.dslplatform.media.Player.JAVA; break;
							case -1831302071: _player_ = serializers.dslplatform.media.Player.FLASH; break;
							default:
								throw new java.io.IOException("Unknown enum value: '" + reader.getLastName() + "' at position " + reader.positionInStream());
						}
						nextToken = reader.getNextToken();
					} else throw new java.io.IOException("Expecting '\"' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					case -1190269634:
						_copyright_ = com.dslplatform.client.json.StringConverter.deserialize(reader);
							nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		this.uri = _uri_;
		this.title = _title_;
		this.width = _width_;
		this.height = _height_;
		this.format = _format_;
		this.duration = _duration_;
		this.size = _size_;
		this.bitrate = _bitrate_;
		this.persons = _persons_;
		this.player = _player_;
		this.copyright = _copyright_;
	}

	public static Object deserialize(final com.dslplatform.client.json.JsonReader reader, final com.dslplatform.patterns.ServiceLocator locator) throws java.io.IOException {
		switch (reader.getNextToken()) {
			case 'n':
				if (reader.wasNull())
					return null;
				throw new java.io.IOException("Invalid null value found at: " + reader.positionInStream());
			case '{':
				return new serializers.dslplatform.media.Media(reader, locator);
			case '[':
				return reader.deserializeNullableCollection(JSON_READER);
			default:
				throw new java.io.IOException("Invalid char value found at: " + reader.positionInStream() + ". Expecting null, { or [. Found: " + (char)reader.last());
		}
	}
}
