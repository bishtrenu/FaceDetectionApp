package com.example.renu.facedetection;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class LCOFaceDetection extends Application {
    public static final String RESULT_TEXT="RESULT_TEXT";
   public final  static  String RESULT_DIALOG="RESULT_DIALOG";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
