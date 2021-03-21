package tech.magratheaai.extensionapi.aux.social_network;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
public class ButtonTypeTemplate {
    public static String text(){return "text";}
    public static String location(){return "location";}

    public static class vk{
        public static String openLink(){return "open_link";}
        public static String vkPay(){return "vkpay";}
        public static String openApp(){return "open_app";}
        public static String callback(){return "callback";}
    }
    public static class telegram{
        public static String contact(){return "contact";}
        public static String poll(){return "poll";}
    }
}
