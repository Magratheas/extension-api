package tech.magratheaai.extensionapi.aux.social_network;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.io.Serializable;
import java.util.List;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
@Builder
@Getter
public class Keyboard implements Serializable {
    /**
     * Requests clients to hide the keyboard as soon as it's been used.
     */
    private final boolean oneTime;

    /**
     * To specific users only(@mentioned in the text of the Message object).
     */
    private final boolean selective;

    /**
     * Array of button rows.
     */
    @Singular(value = "row")
    private final List<List<Button>> keyboardButtons;
}
