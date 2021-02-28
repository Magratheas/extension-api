package tech.magratheaai.extensionapi;

import org.pf4j.ExtensionPoint;

import java.util.List;
import java.util.Map;

/**
 * Processes messages received from the user.
 * @author NikitaBolshakov
 * @version 1.0
 */
public interface MagratheaExtension extends ExtensionPoint {
    /**
     * @param params Contains a list of entries, where the key is the parameter name.
     */
    default void init(List<Map.Entry<String, String>> params){}

    /**
     * @return Allows to push the result onto the stack.
     */
    default boolean allowPushResults(){
        return true;
    }

    /**
     * Process input.
     * @param results results of previous tasks
     * @see ResultsStackTrace
     * @return Pushes the result onto the stack if available.
     */
    ModuleInputContextObject run(ResultsStackTrace results);
}
