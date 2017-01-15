package ru.maximkulikov.goodgame.api.chatmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Java-GoodGame-Api-Wrapper
 * Created by maxim on 10.01.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqRemoveMessage {

    @JsonProperty("channel_id")
    private String channelId;

    @JsonProperty("message_id")
    private String messageId;

    public ReqRemoveMessage(String channelId, String messageId) {
        this.channelId = channelId;
        this.messageId = messageId;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final void setChannelId(final String channelId) {
        this.channelId = channelId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final void setMessageId(final String messageId) {
        this.messageId = messageId;
    }

    @Override
    public final String toString() {
        return "ReqRemoveMessage{" +
                "channelId='" + this.channelId + '\'' +
                ", messageId='" + this.messageId + '\'' +
                '}';
    }
}