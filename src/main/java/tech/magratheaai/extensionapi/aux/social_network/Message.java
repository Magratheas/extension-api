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
    private final Keyboard keyboard;
    private final String chatId;
    private final String userId;
    private final String text;
    private final String payload;
    @Singular("attachment")
    private final List<Attachment> attachments;
}
