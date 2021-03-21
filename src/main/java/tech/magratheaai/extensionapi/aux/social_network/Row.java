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
@Getter
@Builder
public class Row implements Serializable {
    @Singular("btn")
    private final List<Button> row;
}
