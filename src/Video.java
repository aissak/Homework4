
public class Video extends Item {
	/**
	 * instances for the Video class
	 */
	private String mediaType;
	private String source;

	/**
	 * empty constructor
	 */
	public Video() {
		super();
	}

	/**
	 * * @return mediaType, source
	 */
	public Video(String mediaType, String source) {

		this.mediaType = "mp4";
		this.source = " any source";
	}

	/**
	 * * @return name, number, type, cost, mediaType, sources
	 */
	public Video(String name, int number, String type, double cost, String mediaType, String source) {
		super(name, number, type, cost);

		/**
		 * sets the media type that is from abstract class
		 */
		setMediaType(mediaType);

		/**
		 * sets the media type that is from abstract class
		 */
		setSource(source);
	}

	/**
	 * getter: gets mediaType
	 */
	@Override
	public String getMediaType() {

		return mediaType;
	}

	/**
	 * setter: sets the media type for video
	 */
	@Override
	public void setMediaType(String mediaType) {

		if (mediaType.equalsIgnoreCase("mp4") || mediaType.equalsIgnoreCase("BluRay DVD"))

			this.mediaType = mediaType;

	}

	/**
	 * getter: gets source for the video
	 */
	@Override
	public String getSource() {

		return source;
	}

	/**
	 * setter: sets source for the
	 */
	@Override
	public void setSource(String source) {

		this.source = source;

	}

	/**
	 * toString for media type and source
	 */
	public String toString() {
		return super.toString() + "Video [mediaType=" + mediaType + ", source=" + source + "]";
	}

}
