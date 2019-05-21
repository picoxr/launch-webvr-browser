package com.picovr.launchwebvr;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launch();
    }


    public void launch() {
        Log.e(TAG, "launch: " );
        String filepath= Environment.getExternalStoragePublicDirectory(DOWNLOAD_SERVICE)+"/config.txt";
        Log.e(TAG, filepath );
        Uri uri=Uri.parse(readFile(filepath));
        Intent intent=new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setClassName("org.chromium.chrome","org.chromium.chrome.browser.document.ChromeLauncherActivity");
        startActivity(intent);
    }

    private String readFile(String filepath){
        File file=new File(filepath);
        byte[] buff=new byte[(int) file.length()];
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(buff);
            fileInputStream.close();
            String hello = new String(buff, "utf-8");
            //hello=hello.replaceAll("\\r\\n","\n");
            return  hello;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
