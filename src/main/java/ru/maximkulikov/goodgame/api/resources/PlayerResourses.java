package ru.maximkulikov.goodgame.api.resources;

import ru.maximkulikov.goodgame.api.handlers.PlayerResponseHandler;
import ru.maximkulikov.goodgame.api.models.Player;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * {@link PlayerResourses} предоставляет фукциональность к ресурсам информации о плеере
 *
 * @author Maxim Kulikov
 * @since 29.12.2016
 */
public class PlayerResourses extends AbstractResource {

    public PlayerResourses(final String defaultBaseUrl, final int defaultApiVersion) {
        super(defaultBaseUrl, defaultApiVersion);
    }

    /**
     * Получение информации о плеере
     *
     * @param channelId Идентификатор канала
     * @param handler
     */
    public final void getPlayer(final String channelId, final PlayerResponseHandler handler) {
        String url = String.format("%s/player/%s", getBaseUrl(), channelId);

        this.configureHeaders();
        http.get(url, new GoodGameHttpResponseHandler(handler) {
            @Override
            public void onSuccess(final int statusCode, final Map<String, List<String>> headers, final String content) {
                try {
                    Player value = objectMapper.readValue(content, Player.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }
}
