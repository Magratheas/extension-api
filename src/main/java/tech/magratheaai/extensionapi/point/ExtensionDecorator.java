package tech.magratheaai.extensionapi.point;

/**
 * Decorates the extension.
 * @author NikitaBolshakov
 * @version 1.0
 */
public interface ExtensionDecorator extends Extension {
    /**
     * @return Returns the extension to be wrapped
     */
    default Extension getExtension() {
        return null;
    }
}
