package ru.maximkulikov.goodgame.api.chatmodels;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author Maxim Kulikov
 * @since 09.01.2017
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResChannelStreamer implements ResChatObject {

    private Long id;

    private String name;

    private Long right;

    private List<String> groups;

}
