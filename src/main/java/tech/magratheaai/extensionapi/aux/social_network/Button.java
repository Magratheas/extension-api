package tech.magratheaai.extensionapi.aux.social_network;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
@Builder
@Getter
@AllArgsConstructor
public class Button implements Serializable {
    private final String label;
    /**
     * Button type.
     * @see ButtonTypeTemplate
     */
    private final String typename;
    /**
     * Button color(Vk only).
     * @see ButtonColorTemplate
     */
    private final String color;
    /**
     * Link button.
     */
    private final String link;
    /**
     * Button callback data
     */
    private final String payload;
    /**
     * VK hash parameter.
     */
    private final String vkHash;
    /**
     * VK group owner id.
     */
    private final String vkOwnerId;
    /**
     * VK app id.
     */
    private final String vkAppId;
}
