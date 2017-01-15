package ru.maximkulikov.goodgame.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Java-GG-Api-Wrapper
 * Created by maxim on 29.12.2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    @JsonProperty("user_id")
    private String userId;

    private String secure;

    private String email;

    private String payments;

    private String subscribed;

    @JsonProperty("subscribed_stream")
    private String subscribedStream;

    @JsonProperty("subscribed_anons")
    private String subscribedAnons;

    private String wallet;

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(final String email) {
        this.email = email;
    }

    public final String getPayments() {
        return this.payments;
    }

    public final void setPayments(final String payments) {
        this.payments = payments;
    }

    public final String getSecure() {
        return this.secure;
    }

    public final void setSecure(final String secure) {
        this.secure = secure;
    }

    public final String getSubscribed() {
        return this.subscribed;
    }

    public final void setSubscribed(final String subscribed) {
        this.subscribed = subscribed;
    }

    public final String getSubscribedAnons() {
        return this.subscribedAnons;
    }

    public final void setSubscribedAnons(final String subscribedAnons) {
        this.subscribedAnons = subscribedAnons;
    }

    public final String getSubscribedStream() {
        return this.subscribedStream;
    }

    public final void setSubscribedStream(final String subscribedStream) {
        this.subscribedStream = subscribedStream;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(final String userId) {
        this.userId = userId;
    }

    public final String getWallet() {
        return this.wallet;
    }

    public final void setWallet(final String wallet) {
        this.wallet = wallet;
    }

    @Override
    public final String toString() {
        return "User{" +
                "userId='" + this.userId + '\'' +
                ", secure='" + this.secure + '\'' +
                ", email='" + this.email + '\'' +
                ", payments='" + this.payments + '\'' +
                ", subscribed='" + this.subscribed + '\'' +
                ", subscribedStream='" + this.subscribedStream + '\'' +
                ", subscribedAnons='" + this.subscribedAnons + '\'' +
                ", wallet='" + this.wallet + '\'' +
                '}';
    }
}