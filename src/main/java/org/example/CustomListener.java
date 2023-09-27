package org.example;

import io.github.jwdeveloper.tiktok.annotations.TikTokEventHandler;
import io.github.jwdeveloper.tiktok.events.messages.TikTokGiftMessageEvent;

import io.github.jwdeveloper.tiktok.listener.TikTokEventListener;
import io.github.jwdeveloper.tiktok.live.LiveClient;

public class CustomListener implements TikTokEventListener {


    @TikTokEventHandler
    public void onGiftMessage(LiveClient liveClient, TikTokGiftMessageEvent event) {
        System.out.println(event.getGift().getDescription());
    }

}
