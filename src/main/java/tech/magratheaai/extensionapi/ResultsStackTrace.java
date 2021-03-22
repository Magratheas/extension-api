package tech.magratheaai.extensionapi;

import lombok.Getter;
import tech.magratheaai.extensionapi.aux.social_network.attachment_template.Audio;
import tech.magratheaai.extensionapi.aux.social_network.attachment_template.Document;
import tech.magratheaai.extensionapi.update.object.Update;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Results of previous extensions and input from user.
 * @author NikitaBolshakov
 * @version 1.0
 */
public class ResultsStackTrace implements Serializable {
    @Getter
    private final Update input;
    @Getter
    private final List<Update> stacktrace;
    public ResultsStackTrace(Update input, List<Update> stacktrace){
        this.input      = input;
        this.stacktrace = Collections.unmodifiableList(stacktrace);
    }
    public Update getLast(){
        int size = stacktrace.size();
        return getStacktrace().get(size - 1);
    }

}
