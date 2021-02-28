package tech.magratheaai.extensionapi;

import org.pf4j.ExtensionPoint;

/**
 * Extension point responsible for user interaction.
 * @author NikitaBolshakov
 * @version 1.0
 */
public interface MagratheaContext extends ExtensionPoint {
    /**
     * Extension initialization with parameters.
     */
    default void init(){}
    /**
     * @return The created user interaction context.
     */
    UserInteractionContext getUserInteractionContext();
}
