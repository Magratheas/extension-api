package tech.magratheaai.extensionapi.aux.social_network;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.io.Serializable;
import java.util.List;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
@Builder
@Getter
@AllArgsConstructor
public class Message implements Serializable {
    private final Keyboard keyboard;
    private final String chatId;
    private final String userId;
    @Singular("attachment")
    private final List<Attachment> attachments;
}
