package ru.maximkulikov.goodgame.api.chatmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Java-GoodGame-Api-Wrapper
 * Created by maxim on 11.01.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResPollResultsContainer {

    private String type;

    private ResPollResults data;

    public final ResPollResults getData() {
        return this.data;
    }

    public final void setData(final ResPollResults data) {
        this.data = data;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(final String type) {
        this.type = type;
    }

    @Override
    public final String toString() {
        return "ResPollResultsContainer{" +
                "type='" + this.type + '\'' +
                ", data=" + this.data +
                '}';
    }
}