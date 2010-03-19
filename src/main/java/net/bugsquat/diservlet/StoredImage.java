package net.bugsquat.diservlet;

/**
 * Represents a stored image in an <code>ImageStore</code>. The data stored
 * includes the image bytes, and the mime/type of the image.
 *
 */
public class StoredImage {

	private String mimeType;
	private byte[] imageBytes;
	
	public StoredImage(String mimeType, byte[] imageBytes) {
		this.mimeType = mimeType;
		this.imageBytes = imageBytes;
	}

	public String getMimeType() {
		return mimeType;
	}

	public byte[] getImageBytes() {
		return imageBytes;
	}
	
}
