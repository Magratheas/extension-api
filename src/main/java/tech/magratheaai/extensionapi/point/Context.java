package tech.magratheaai.extensionapi.point;

import org.pf4j.ExtensionPoint;

/**
 * Extension point responsible for user interaction.
 * @author NikitaBolshakov
 * @version 1.0
 */
public interface Context extends ExtensionPoint {
    /**
     * Extension initialization with parameters.
     */
    default void init(){}
    /**
     * @return The created user interaction context.
     */
    UserInteractionContext getUserInteractionContext();
}
