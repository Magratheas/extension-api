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
public class Video implements Serializable {
    /**
     * Video title
     */
    private final String title;

    private final vkInfo vkInfo;
    private final telegramInfo telegramInfo;

    private final uploadInfo uploadInfo;

    @AllArgsConstructor
    public static class vkInfo implements Serializable{

        /**
         * Video access key
         */
        private final String accessKey;

        /**
         * Date when the video has been added in Unixtime
         */
        private final Integer addingDate;

        /**
         * 1 if video is private
         */
        private final boolean isPrivate;

        /**
         * Number of comments
         */
        private final Integer comments;

        /**
         * Date when video has been uploaded in Unixtime
         */
        private final Integer date;

        /**
         * Video description
         */
        private final String description;

        /**
         * Video duration in seconds
         */
        private final Integer duration;

        /**
         * Video ID
         */
        private final Integer id;

        /**
         * Video owner ID
         */
        private final Integer ownerId;

        /**
         * Id of the user who uploaded the video if it was uploaded to a group by member
         */
        private final Integer userId;

        /**
         * Video embed URL
         */
        private final URI player;

        /**
         * Number of views
         */
        private final Integer views;

        /**
         * If video is external, number of views on vk
         */
        private final Integer localViews;

        /**
         * Live donations balance
         */
        private final Integer balance;

        /**
         * Date in Unixtime when the live stream is scheduled to start by the author
         */
        private final Integer liveStartTime;


        private final Integer likes;

        private final Integer reposts;

        public String getAccessKey() {
            return accessKey;
        }

        public Integer getAddingDate() {
            return addingDate;
        }

        public boolean isPrivate() {
            return isPrivate;
        }

        public Integer getComments() {
            return comments;
        }

        public Integer getDate() {
            return date;
        }

        public String getDescription() {
            return description;
        }

        public Integer getDuration() {
            return duration;
        }

        public Integer getId() {
            return id;
        }

        public Integer getOwnerId() {
            return ownerId;
        }

        public Integer getUserId() {
            return userId;
        }

        public URI getPlayer() {
            return player;
        }

        public Integer getViews() {
            return views;
        }

        public Integer getLocalViews() {
            return localViews;
        }

        public Integer getBalance() {
            return balance;
        }

        public Integer getLiveStartTime() {
            return liveStartTime;
        }

        public Integer getLikes() {
            return likes;
        }

        public Integer getReposts() {
            return reposts;
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
