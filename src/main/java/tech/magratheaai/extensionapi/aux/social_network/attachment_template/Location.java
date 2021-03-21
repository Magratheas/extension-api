package tech.magratheaai.extensionapi.aux.social_network.attachment_template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import tech.magratheaai.extensionapi.annotation.Required;

import java.io.File;
import java.io.Serializable;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
@Builder
@Getter
public class Location implements Serializable {
    @Required(social_network = {"vk", "telegram"})
    private final Float latitude;

    @Required(social_network = {"vk", "telegram"})
    private final Float longitude;

    private final vkInfo vkInfo;
    private final telegramInfo telegramInfo;

    private final uploadInfo uploadInfo;

    @Builder
    @Getter
    public class vkInfo implements Serializable{
    }

    @Builder
    @Getter
    public class telegramInfo implements Serializable{
        private final float horizontalAccuracy;
    }

    @AllArgsConstructor
    @Getter
    public class uploadInfo implements Serializable{
        private final File file;
    }
}
