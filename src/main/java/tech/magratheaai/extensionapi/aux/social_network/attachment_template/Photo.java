package tech.magratheaai.extensionapi.aux.social_network.attachment_template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import tech.magratheaai.extensionapi.annotation.Required;

import java.awt.*;
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
public class Photo implements Serializable {
    private final vkInfo vkInfo;
    private final telegramInfo telegramInfo;

    private final uploadInfo uploadInfo;

    @AllArgsConstructor
    public static class vkInfo implements Serializable{
        /**
         * Access key for the photo
         */
        private final String accessKey;

        /**
         * Album ID
         */
        private final Integer albumId;

        /**
         * Date when uploaded
         */
        @Required(social_network = "vk")
        private final Integer date;

        /**
         * Original photo height
         */
        private final Integer height;

        /**
         * Photo ID
         */
        @Required(social_network = "vk")
        private final Integer id;

        private final List<Image> images;

        /**
         * Latitude
         */
        private final Float lat;

        /**
         * Longitude
         */
        private final Float lng;

        /**
         * Photo owner's ID
         */
        private final Integer ownerId;

        /**
         * URL of image with 2560 px width
         */
        private final URI photo256;

        /**
         * Information whether current user can comment the photo
         */
        private final boolean canComment;

        private final String place;

        /**
         * Post ID
         */
        private final Integer postId;

        /**
         * Photo caption
         */
        private final String text;

        /**
         * ID of the user who have uploaded the photo
         */
        private final Integer userId;

        public String getAccessKey() {
            return accessKey;
        }

        public Integer getAlbumId() {
            return albumId;
        }

        public Integer getDate() {
            return date;
        }

        public Integer getHeight() {
            return height;
        }

        public Integer getId() {
            return id;
        }

        public List<Image> getImages() {
            return images;
        }

        public Float getLat() {
            return lat;
        }

        public Float getLng() {
            return lng;
        }

        public Integer getOwnerId() {
            return ownerId;
        }

        public URI getPhoto256() {
            return photo256;
        }

        public boolean isCanComment() {
            return canComment;
        }

        public String getPlace() {
            return place;
        }

        public Integer getPostId() {
            return postId;
        }

        public String getText() {
            return text;
        }

        public Integer getUserId() {
            return userId;
        }
    }

    @AllArgsConstructor
    public static class telegramInfo implements Serializable{}

    @AllArgsConstructor
    public static class uploadInfo implements Serializable{
        private final File file;

        public File getFile() {
            return file;
        }
    }
}
