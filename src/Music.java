
public class Music extends Item {

	/**
	 * Instances for the item class
	 */
	private String mediaType;
	private String source;

	/**
	 * empty constructor
	 */
	public Music() {
		super();
	}

	/**
	 * * @return mediaType and source
	 */
	public Music(String mediaType, String source) {

		this.mediaType = "mp3";
		this.source = "any studio";

	}

	/**
	 * * @return name, number, type, cost, mediaType, source
	 */
	public Music(String name, int number, String type, double cost, String mediaType, String source) {
		super(name, number, type, cost);

		//
		setMediaType(mediaType);

		setSource(source);
	}

	/**
	 * getter: gets mediaType
	 */
	public String getMediaType() {

		return mediaType;
	}

	/**
	 * Setter: sets the media type
	 * 
	 */
	public void setMediaType(String mediaType) {

		if (mediaType.equalsIgnoreCase("MP3") || mediaType.equalsIgnoreCase("CD")
				|| mediaType.equalsIgnoreCase("Vinyl"))
			this.mediaType = mediaType;

	}

	/**
	 * getter: Gets source
	 */
	public String getSource() {

		return source;
	}

	/**
	 * Source: sets source
	 */
	public void setSource(String source) {

		this.source = source;
	}

	/**
	 * toString that prints the type of music and the source of it.
	 */
	@Override
	public String toString() {
		return super.toString() + "Music [mediaType=" + mediaType + ", source=" + source + "]";
	}

}
