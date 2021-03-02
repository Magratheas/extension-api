package tech.magratheaai.extensionapi;

import com.google.common.collect.Lists;
import lombok.Getter;

import java.util.Collections;
import java.util.List;

/**
 * Results of previous extensions and input from user.
 * @author NikitaBolshakov
 * @version 1.0
 */
public class ResultsStackTrace {
    @Getter
    private final InputDataHolder input;
    @Getter
    private final List<InputDataHolder> stacktrace;
    public ResultsStackTrace(InputDataHolder input, List<InputDataHolder> stacktrace){
        this.input      = input;
        this.stacktrace = Collections.unmodifiableList(stacktrace);
    }
    public InputDataHolder getLast(){
        int size = stacktrace.size();
        return getStacktrace().get(size - 1);
    }

}
