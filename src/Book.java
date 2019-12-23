public class Book extends Item {

	/**
	 * Instances for the Book class
	 */
	private String mediaType;
	private String source;

	/**
	 * empty constructor
	 */
	public Book() {

	}

	/**
	 * * @return mediaType, source
	 */
	public Book(String mediaType, String source) {
		this.mediaType = "print";
		this.source = "any publisher";

	}

	/**
	 * * @return name, number, type, cost, mediaType, sources
	 */

	public Book(String name, int number, String type, double cost, String mediaType, String source) {
		super(name, number, type, cost);

		setMediaType(mediaType);
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
	 * setter: sets mediaType
	 */
	@Override
	public void setMediaType(String mediaType) {

		if (mediaType.equalsIgnoreCase("Print") || mediaType.equalsIgnoreCase("Ebook"))

			this.mediaType = mediaType;
	}

	/**
	 * getter: gets source
	 */
	@Override
	public String getSource() {

		return source;
	}

	/**
	 * setter: sets sources
	 */
	@Override
	public void setSource(String source) {

		this.source = source;

	}

	/**
	 * toString for mediaType, sources
	 */

	public String toString() {
		return super.toString() + "Book[mediaType=" + mediaType + ", source=" + source + "]";
	}

}
