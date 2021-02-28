package tech.magratheaai.extensionapi.point;

import tech.magratheaai.extensionapi.InputDataHolder;
import tech.magratheaai.extensionapi.update.object.Update;

import java.util.function.Consumer;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */


/**
 * This interface is used for interaction between user and bot server
 */
public interface UserInteractionContext {

    /**
     * Sending message to specified user
     * @param m Instance of Message for send
     * @return If sending is successful will return true
     */
    boolean send(Update m);

    /**
     * Returns message to user interface(uses in extensions)
     * @return Actually last message
     */
    InputDataHolder getInput();

    /**
     * Returns special id of social network, where is income this message
     * @return Actually special id
     */
    String getChatIdKey();

    /**
     * @param consumer Provide callback method to user interaction context
     */
    void setNewMessageCallback(Consumer<InputDataHolder> consumer);
}
