package tech.magratheaai.extensionapi.point;

import java.io.Serializable;

/**
 * Decorates the extension.
 * @author NikitaBolshakov
 * @version 1.0
 */
public interface ExtensionDecorator extends Extension, Serializable {
    /**
     * @return Returns the extension to be wrapped
     */
    default Extension getExtension() {
        return null;
    }
}
