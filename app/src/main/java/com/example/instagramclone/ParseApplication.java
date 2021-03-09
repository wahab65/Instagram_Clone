package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("oAEFUnbzU3U9nSXDzmOLem1j1U6iumpwvG44Ktkt")
                .clientKey("4TnCqdpncGvg8Jh5Sz6m2JiHm02Nr2Wc9Zp1Ho1y")
                .server("https://parseapi.back4app.com")
                .build()
        );


    }
}
