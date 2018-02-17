package com.example.asus.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }

    /**
     * This function directs to phone call when call icon is clicked.
     */
    public void goToPhone(View view) {
        Intent phoneIntent = new Intent ( Intent.ACTION_DIAL );
        phoneIntent.setData ( Uri.parse ( "tel:" + 736076638 ) );
        if (phoneIntent.resolveActivity ( getPackageManager () ) != null) {
            startActivity ( phoneIntent );
        }

    }

    /**
     * This function directs to facebook page when Facebook icon is clicked.
     */
    public void goToFacebook(View view) {
        Intent facebookIntent = new Intent ( Intent.ACTION_VIEW,
                Uri.parse ( "https://www.facebook.com/pg/KRASNOLOD" ) );
        startActivity ( facebookIntent );
    }

    /**
     * This function directs to mail box when Email icon is clicked.
     */
    public void goToMail(View view) {
        Intent mailIntent = new Intent ( Intent.ACTION_SENDTO );
        mailIntent.setData ( Uri.parse ( "mailto:" + "krasnolod@krasnolod.pl" ) );
        if (mailIntent.resolveActivity ( getPackageManager () ) != null) {
            startActivity ( mailIntent );
        }
    }

    /**
     * This function directs to google map when map icon is clicked.
     */
    public void goToMap(View view) {
        Intent mapIntent = new Intent ( Intent.ACTION_VIEW );
        mapIntent.setData ( Uri.parse ( "geo: 51.103437,17.042377") );
        if (mapIntent.resolveActivity ( getPackageManager () ) != null) {
            startActivity ( mapIntent );
        }
    }


}
