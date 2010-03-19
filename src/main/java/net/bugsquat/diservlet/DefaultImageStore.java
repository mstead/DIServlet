package net.bugsquat.diservlet;

import java.util.HashMap;
import java.util.Map;

/**
 * The default image store is simply a <code>Map</code> based image store.
 * It stores a <code>String</code> ID to a byte[] for the image. This is not
 * very efficient when dealing with a large amount of images, but for small
 * applications with few users it should be OK.
 * 
 */
public class DefaultImageStore implements ImageStore {

	private Map<String, StoredImage> storedImageMap;
	
	public DefaultImageStore() {
		storedImageMap = new HashMap<String, StoredImage>();
	}
	
	@Override
	public StoredImage retrieveImage(String key) {
		return storedImageMap.get(key);
	}

	@Override
	public void storeImage(String key, StoredImage image) {
		if (storedImageMap.containsKey(key))
			return;
		
		storedImageMap.put(key, image);
	}

	@Override
	public boolean contains(String key) {
		return storedImageMap.containsKey(key);
	}

}
