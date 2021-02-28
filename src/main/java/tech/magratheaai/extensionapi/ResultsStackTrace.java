package tech.magratheaai.extensionapi;

import java.util.List;

/**
 * Results of previous extensions and input from user.
 * @author NikitaBolshakov
 * @version 1.0
 */
public record ResultsStackTrace(InputDataHolder input, List<InputDataHolder> stacktrace) {
    /**
     * @return Last element of stack trace
     */
    public InputDataHolder getLast(){
        int size = stacktrace().size();
        return stacktrace().get(size - 1);
    }
}
