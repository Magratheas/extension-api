package tech.magratheaai.extensionapi.aux.social_network;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
public class AttachmentTypeTemplate {
    public static String photo(){return "photo";}
    public static String audio(){return "audio";}
    public static String video(){return "video";}
    public static String doc(){return "doc";}
    public static String voice(){return "audio_message";}
    public static String poll(){return "poll";}
    public static String location(){return "location";}

    public static class vk{
        public static String link(){return "link";}
        public static String market(){return "market";}
        public static String marketAlbum(){return "market_album";}
        public static String gift(){return "gift";}
        public static String sticker(){return "sticker";}
        public static String wall(){return "wall";}
        public static String wallReply(){return "wall_reply";}
        public static String article(){return "article";}
        public static String call(){return "call";}
        public static String graffiti(){return "graffiti";}
    }
    public static class telegram{
        public static String animation(){return "animation";}
        public static String videoNote(){return "video_note";}
        public static String mediaGroup(){return "media_group";}
        public static String contact(){return "contact";}
        public static String venue(){return "venue";}
        public static String dice(){return "dice";}
    }
}
