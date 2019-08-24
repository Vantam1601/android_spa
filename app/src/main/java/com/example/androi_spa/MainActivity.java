package com.example.androi_spa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
        //cbe7eb58-bae5-41db-859c-62f6f7870580
        OneSignal.sendTag("user_id","123");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
