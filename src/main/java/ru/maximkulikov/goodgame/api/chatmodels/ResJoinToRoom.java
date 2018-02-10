package ru.maximkulikov.goodgame.api.chatmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Maxim Kulikov
 * @since 09.01.2017
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResJoinToRoom implements ResChatObject {

    @JsonProperty("channel_id")
    private String channelId;

    @JsonProperty("room_id")
    private String roomId;

}
