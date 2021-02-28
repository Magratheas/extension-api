package tech.magratheaai.extensionapi;

/**
 * Decorates the extension.
 * @author NikitaBolshakov
 * @version 1.0
 */
public interface ExtensionDecorator extends MagratheaExtension {
    /**
     * @return Returns the extension to be wrapped
     */
    default MagratheaExtension getExtension() {
        return null;
    }
}
