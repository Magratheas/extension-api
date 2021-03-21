package tech.magratheaai.extensionapi.aux.social_network.attachment_template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import tech.magratheaai.extensionapi.annotation.Required;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.util.List;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
@Builder
@Getter
public class Document implements Serializable {
    /**
     * File URL
     */
    @Required(social_network = "telegram")
    private final URI url;

    private final vkInfo vkInfo;
    private final telegramInfo telegramInfo;

    private final uploadInfo uploadInfo;

    @AllArgsConstructor
    @Getter
    public class vkInfo implements Serializable{
        /**
         * Document ID
         */
        @Required(social_network = {"vk"})
        private final Integer id;

        /**
         * Document owner ID
         */

        private final Integer ownerId;

        /**
         * Document title
         */
        @Required(social_network = {"vk"})
        private final String title;

        /**
         * File size in bites
         */
        @Required(social_network = {"vk"})
        private final Integer size;

        /**
         * File extension
         */
        @Required(social_network = {"vk"})
        private final String ext;

        /**
         * Date when file has been uploaded in Unixtime
         */
        @Required(social_network = {"vk"})
        private final Integer date;

        /**
         * Document type
         */
        @Required(social_network = {"vk"})
        private final Integer type;


        private final boolean isLicensed;

        /**
         * Access key for the document
         */
        private final String accessKey;

        /**
         * Document tags
         */
        private final List<String> tags;
    }

    @AllArgsConstructor
    @Getter
    public class telegramInfo implements Serializable{}

    @AllArgsConstructor
    @Getter
    public class uploadInfo implements Serializable{
        private final File file;
    }
}
