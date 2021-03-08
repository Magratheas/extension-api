package tech.magratheaai.extensionapi.update;

import java.io.Serializable;
import java.util.Map;

/**
 * Main information holder.
 *
 * @author NikitaBolshakov
 * @version 1.0
 */
public interface Update extends Serializable {
    /**
     * @return
     */
    Map<String, Object> getUpdateInfo();

    /**
     * @param tag
     * @param clazz
     * @param <T>
     * @return
     */
    <T extends Serializable> T getObjectByTag(String tag, Class<T> clazz);
}
