package ru.maximkulikov.goodgame.api.chatmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Java-GoodGame-Api-Wrapper
 * Created by maxim on 09.01.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqChannelCounters implements ReqChatObject {

    @JsonProperty("channel_id")
    private String channelId;

    public ReqChannelCounters(String channelId) {
        this.channelId = channelId;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final void setChannelId(final String channelId) {
        this.channelId = channelId;
    }

    @Override
    public final String toString() {
        return "ReqChannelCounters{" +
                "channelId='" + this.channelId + '\'' +
                '}';
    }
}