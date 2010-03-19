package net.bugsquat.diservlet;

/**
 * An image store knows how to retrieve/store requested images.
 */
public interface ImageStore {

	/**
	 * Stores an image in the store.
	 * 
	 * @param key the key for the image.
	 * @param image the stored image.
	 */
	void storeImage(String key, StoredImage image);
	
	/**
	 * Retrieves the stored image relative to the specified key.
	 * @param imageKey the image key
	 * @return the image's byte array.
	 */
	StoredImage retrieveImage(String imageKey);
	
	/**
	 * @return true if the image is in the store, false otherwise.
	 */
	boolean contains(String key);
	
}
