package tech.magratheaai.extensionapi.aux.social_network;

import lombok.*;
import tech.magratheaai.extensionapi.aux.social_network.attachment_template.*;

import java.io.Serializable;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
@Builder
@AllArgsConstructor
@ToString
@Getter
public class Attachment implements Serializable {
    /**
     * Type of attachment
     * @see AttachmentTypeTemplate
     */
    private final String attachmentType;

    private final Audio audio;
    private final Document document;
    private final Location location;
    private final Photo photo;
    private final Video video;
    private final Voice voice;

}
