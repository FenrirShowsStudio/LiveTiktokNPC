package org.example;

import io.github.jwdeveloper.tiktok.*;

import java.io.IOException;

public class Main {
    private static final String USER = "CEVA" ;

    public static void main(String[] args) throws IOException {

        CustomListener customListener = new CustomListener();

        var client = TikTokLive.newClient(Main.USER)
                .addListener(customListener)
                .buildAndRun();
    }
}