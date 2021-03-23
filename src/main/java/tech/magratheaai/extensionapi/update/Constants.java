package tech.magratheaai.extensionapi.update;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
public class Constants {
    //Social networks
    public static class SocialNetwork {
        public static final String MESSAGE = "message";
        public static final String ACTION = "action";
        public static final String NEW_MESSAGE = "new_message";
        public static final String EDIT_MESSAGE = "edit_message";
        public static final String REMOVE_MESSAGE = "remove_message";
        public static final String QUERY = "query";
        public static final String SEND_MESSAGE_QUERY = "send_message_query";
        public static final String EDIT_MESSAGE_QUERY = "edit_message_query";
        public static final String REMOVE_MESSAGE_QUERY = "remove_message_query";
    }

    //Update constants
    public static final String CHAT_ID        = "chat_id";
    public static final String USER_ID        = "user_id";
    public static final String BOT            = "bot";
    public static final String INLINE         = "inline";
    public static final String MESSAGE_ID     = "message_id";
    public static final String USER_INTERFACE = "user_interface";
    public static final String CHANGED        = "changed";
    public static final String TEXT           = "text";
    public static final String MARKUP         = "org/magrathea/botapi/markup";
    public static final String ATTACHMENTS    = "attachments";
    public static final String QUERY_ID       = "query_id";
    public static final String QUERY          = "query";
    public static final String QUERY_OFFSET   = "query_offset";
    public static final String QUERY_TITLE    = "query_title";

    public static class User {
        public static final String FIRST_NAME    = "first_name";
        public static final String LAST_NAME     = "last_name";
        public static final String USER_NAME     = "user_name";
        public static final String LANGUAGE_CODE = "language_code";
    }
    public static class Attachment{
        public static final String FILE_NAME = "file_name";
        public static final String FILE_ID   = "file_id";
        public static final String FILE_SIZE = "file_size";
    }
}
