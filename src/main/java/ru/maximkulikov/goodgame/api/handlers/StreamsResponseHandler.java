package ru.maximkulikov.goodgame.api.handlers;

import ru.maximkulikov.goodgame.api.models.EmbededChannels;

/**
 * Java-GoodGame-Api-Wrapper
 * Created by maxim on 18.01.2017.
 */
public interface StreamsResponseHandler extends BaseFailureHandler {

    void onSuccess(EmbededChannels channels);
}
