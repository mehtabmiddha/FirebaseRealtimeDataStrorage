package com.example.arushi.places;

import android.app.Application;
import com.firebase.client.Firebase;

/**
 * Created by Arushi on 6/6/2017.
 */
public class dataget extends Application {

    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
