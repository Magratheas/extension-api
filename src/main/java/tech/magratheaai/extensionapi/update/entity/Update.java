package tech.magratheaai.extensionapi.update.entity;

import java.util.Map;

/**
 * Main information holder.
 *
 * @author NikitaBolshakov
 * @version 1.0
 */
public interface Update {
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
    <T> T getObjectByTag(String tag, Class<T> clazz);
}
