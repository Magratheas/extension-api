package tech.magratheaai.extensionapi.aux.social_network.attachment_template;

import lombok.*;

import java.io.File;
import java.io.Serializable;
import java.net.URI;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
@Builder
@Getter
@ToString
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

    private final vkInfo vkInfo;

    private final telegramInfo telegramInfo;

    private final uploadInfo uploadInfo;

    @AllArgsConstructor
    @EqualsAndHashCode
    public static class vkInfo implements Serializable{
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

        public String getArtist() {
            return artist;
        }

        public Integer getId() {
            return id;
        }

        public URI getUrl() {
            return url;
        }

        public Integer getDate() {
            return date;
        }

        public Integer getAlbumId() {
            return albumId;
        }

        public Integer getGenreId() {
            return genreId;
        }
    }

    @AllArgsConstructor
    @ToString
    public static class telegramInfo implements Serializable {
    }

    @AllArgsConstructor
    @ToString
    public static class uploadInfo implements Serializable {
        private final File file;

        public File getFile() {
            return file;
        }
    }
}
