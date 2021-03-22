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
public class Voice implements Serializable {
    /**
     * Voice file URL
     */
    private final URI voice;
    /**
     * Voice duration in seconds
     */
    @Required(social_network = {"vk"})
    private final Integer duration;

    private final vkInfo vkInfo;
    private final telegramInfo telegramInfo;

    @AllArgsConstructor
    public class vkInfo implements Serializable{
        /**
         * Access key for audio message
         */
        private final String accessKey;

        /**
         * Audio message ID
         */
        @Required(social_network = {"vk"})
        private final Integer id;

        /**
         * OGG file URL
         */
        private final URI linkOgg;

        /**
         * Audio message owner ID
         */
        private final Integer ownerId;

        @Required(social_network = "vk")
        private final List<Integer> waveform;

        private final uploadInfo uploadInfo;

        public String getAccessKey() {
            return accessKey;
        }

        public Integer getId() {
            return id;
        }

        public URI getLinkOgg() {
            return linkOgg;
        }

        public Integer getOwnerId() {
            return ownerId;
        }

        public List<Integer> getWaveform() {
            return waveform;
        }

        public Voice.uploadInfo getUploadInfo() {
            return uploadInfo;
        }
    }
    @AllArgsConstructor
    public class telegramInfo implements Serializable{}

    @AllArgsConstructor
    public class uploadInfo implements Serializable{
        private final File file;

        public File getFile() {
            return file;
        }
    }
}
