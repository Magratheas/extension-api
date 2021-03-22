package tech.magratheaai.extensionapi.aux.social_network;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
@Getter
@Builder
@ToString
public class Row implements Serializable {
    @Singular("btn")
    private final List<Button> row;
}
