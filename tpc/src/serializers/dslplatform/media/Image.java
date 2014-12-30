package serializers.dslplatform.media;



public final class Image   implements java.io.Serializable, com.dslplatform.client.json.JsonObject {
	
	
	
	public Image(
			final String uri,
			final String title,
			final int width,
			final int height,
			final serializers.dslplatform.media.Size size) {
			
		setUri(uri);
		setTitle(title);
		setWidth(width);
		setHeight(height);
		setSize(size);
	}

	
	
	public Image() {
			
		this.uri = "";
		this.width = 0;
		this.height = 0;
		this.size = serializers.dslplatform.media.Size.SMALL;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + 1561429203;
		result = prime * result + (this.uri.hashCode());
		result = prime * result + (this.title != null ? this.title.hashCode() : 0);
		result = prime * result + (this.width);
		result = prime * result + (this.height);
		result = prime * result + (this.size.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		if (!(obj instanceof Image))
			return false;
		final Image other = (Image) obj;
		
		if(!(this.uri.equals(other.uri)))
			return false;
		if(!(this.title == other.title || this.title != null && this.title.equals(other.title)))
			return false;
		if(!(this.width == other.width))
			return false;
		if(!(this.height == other.height))
			return false;
		if(!(this.size.equals(other.size)))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Image(" + uri + ',' + title + ',' + width + ',' + height + ',' + size + ')';
	}
	
	@com.fasterxml.jackson.annotation.JsonCreator private Image(
			@com.fasterxml.jackson.annotation.JsonProperty("_helper") final boolean _helper ,
			@com.fasterxml.jackson.annotation.JsonProperty("uri") final String uri,
			@com.fasterxml.jackson.annotation.JsonProperty("title") final String title,
			@com.fasterxml.jackson.annotation.JsonProperty("width") final int width,
			@com.fasterxml.jackson.annotation.JsonProperty("height") final int height,
			@com.fasterxml.jackson.annotation.JsonProperty("size") final serializers.dslplatform.media.Size size) {
		
		this.uri = uri == null ? "" : uri;
		this.title = title;
		this.width = width;
		this.height = height;
		this.size = size == null ? serializers.dslplatform.media.Size.SMALL : size;
	}

	
	private static final long serialVersionUID = 0x0097000a;
	
	private String uri;

	
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
	@com.fasterxml.jackson.annotation.JsonProperty("uri")
	public String getUri()  {
		
		return uri;
	}

	
	public Image setUri(final String value) {
		
		if(value == null) throw new IllegalArgumentException("Property \"uri\" cannot be null!");
		this.uri = value;
		
		return this;
	}

	
	private String title;

	
	@com.fasterxml.jackson.annotation.JsonProperty("title")
	public String getTitle()  {
		
		return title;
	}

	
	public Image setTitle(final String value) {
		
		this.title = value;
		
		return this;
	}

	
	private int width;

	
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
	@com.fasterxml.jackson.annotation.JsonProperty("width")
	public int getWidth()  {
		
		return width;
	}

	
	public Image setWidth(final int value) {
		
		this.width = value;
		
		return this;
	}

	
	private int height;

	
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
	@com.fasterxml.jackson.annotation.JsonProperty("height")
	public int getHeight()  {
		
		return height;
	}

	
	public Image setHeight(final int value) {
		
		this.height = value;
		
		return this;
	}

	
	private serializers.dslplatform.media.Size size;

	
	@com.fasterxml.jackson.annotation.JsonProperty("size")
	public serializers.dslplatform.media.Size getSize()  {
		
		return size;
	}

	
	public Image setSize(final serializers.dslplatform.media.Size value) {
		
		if(value == null) throw new IllegalArgumentException("Property \"size\" cannot be null!");
		this.size = value;
		
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
		
		if(this.size != serializers.dslplatform.media.Size.SMALL) {
			if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"size\":\"");
			sw.write(this.size.name());
			sw.write('"');
		} else if (!minimal) {
			if(hasWrittenProperty) sw.write(',');
			hasWrittenProperty = true;
			sw.write("\"size\":\"SMALL\"");
		}
	}

	public static com.dslplatform.client.json.JsonReader.ReadJsonObject<Image> JSON_READER = new com.dslplatform.client.json.JsonReader.ReadJsonObject<Image>() {
		@Override
		public Image deserialize(final com.dslplatform.client.json.JsonReader reader, final com.dslplatform.patterns.ServiceLocator locator) throws java.io.IOException {
			return new serializers.dslplatform.media.Image(reader, locator);
		}
	};

	private Image(final com.dslplatform.client.json.JsonReader reader, final com.dslplatform.patterns.ServiceLocator _serviceLocator) throws java.io.IOException {
		
		String _uri_ = "";
		String _title_ = null;
		int _width_ = 0;
		int _height_ = 0;
		serializers.dslplatform.media.Size _size_ = serializers.dslplatform.media.Size.SMALL;
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
					case 597743964:
						
					if (nextToken == '"') {
						switch(reader.calcHash()) {
							case -2045258836: _size_ = serializers.dslplatform.media.Size.SMALL; break;
							case -1271305644: _size_ = serializers.dslplatform.media.Size.LARGE; break;
							default:
								throw new java.io.IOException("Unknown enum value: '" + reader.getLastName() + "' at position " + reader.positionInStream());
						}
						nextToken = reader.getNextToken();
					} else throw new java.io.IOException("Expecting '\"' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
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
					case 597743964:
						
					if (nextToken == '"') {
						switch(reader.calcHash()) {
							case -2045258836: _size_ = serializers.dslplatform.media.Size.SMALL; break;
							case -1271305644: _size_ = serializers.dslplatform.media.Size.LARGE; break;
							default:
								throw new java.io.IOException("Unknown enum value: '" + reader.getLastName() + "' at position " + reader.positionInStream());
						}
						nextToken = reader.getNextToken();
					} else throw new java.io.IOException("Expecting '\"' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
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
		this.size = _size_;
	}

	public static Object deserialize(final com.dslplatform.client.json.JsonReader reader, final com.dslplatform.patterns.ServiceLocator locator) throws java.io.IOException {
		switch (reader.getNextToken()) {
			case 'n':
				if (reader.wasNull())
					return null;
				throw new java.io.IOException("Invalid null value found at: " + reader.positionInStream());
			case '{':
				return new serializers.dslplatform.media.Image(reader, locator);
			case '[':
				return reader.deserializeNullableCollection(JSON_READER);
			default:
				throw new java.io.IOException("Invalid char value found at: " + reader.positionInStream() + ". Expecting null, { or [. Found: " + (char)reader.last());
		}
	}
}
