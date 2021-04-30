package tech.magratheaai.extensionapi.aux.social_network;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
@Builder
@Getter
@AllArgsConstructor
@ToString
public class Message implements Serializable {
    /**
     * Message keyboard.
     */
    private final Keyboard keyboard;
    /**
     * Id of message chat. Equivalent to user id, in private correspondence.
     */
    private final String chatId;
    /**
     * User id.
     */
    private final String userId;
    /**
     * Message text.
     */
    private final String text;
    /**
     * Message payload.
     * Appears when performing certain actions, such as pressing buttons, paying.
     */
    private final String payload;
    @Singular("attachment")
    private final List<Attachment> attachments;
    /**
     * Message id.
     */
    private final String id;
    private final List<String> forward;
}
