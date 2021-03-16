package tech.magratheaai.extensionapi.point;

import org.pf4j.ExtensionPoint;
import tech.magratheaai.extensionapi.ResultsStackTrace;
import tech.magratheaai.extensionapi.update.object.Update;

import java.util.List;
import java.util.Map;

/**
 * Processes messages received from the user.
 * @author NikitaBolshakov
 * @version 1.0
 */
public interface Extension extends ExtensionPoint{
    /**
     */
    default void init(){}

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
    Update run(ResultsStackTrace results);
}
