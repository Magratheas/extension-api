package tech.magratheaai.extensionapi.aux.social_network.attachment_template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.io.File;
import java.io.Serializable;
import java.net.URI;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
@Builder
@Getter
public class Audio implements Serializable {
    /**
     * Duration in seconds
     */
    private final Integer duration;
    /**
     * Performer name
     */
    private final String performer;
    /**
     * Title
     */
    private final String title;

    public final vkInfo vkInfo;
    public final telegramInfo telegramInfo;

    private final uploadInfo uploadInfo;

    @Getter
    @Builder
    public class vkInfo implements Serializable{
        /**
         * Artist name
         */
        private final String artist;
        /**
         * Audio ID
         */
        private final Integer id;
        /**
         * URL of mp3 file
         */
        private final URI url;
        /**
         * Date when uploaded
         */
        private final Integer date;
        /**
         * Album ID
         */
        private final Integer albumId;
        /**
         * Genre ID
         */
        private final Integer genreId;
    }

    @Getter
    @Builder
    private class telegramInfo implements Serializable {
    }

    @AllArgsConstructor
    @Getter
    public class uploadInfo implements Serializable {
        private final File file;
    }
}
