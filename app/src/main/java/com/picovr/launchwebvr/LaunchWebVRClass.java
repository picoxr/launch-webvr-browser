package com.picovr.launchwebvr;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LaunchWebVRClass {
    private static final String TAG = "LaunchWebVRClass";

    /**
     * Launch webVR browser.
     * @param context Context
     * @param filePath The path of config file. eg: /storage/emulated/0/Download/config.txt
     */
    public void launch(Context context, String filePath) {
        Log.e(TAG, "launch: " );
        Log.e(TAG, filePath );
        Uri uri=Uri.parse(readFile(filePath));
        Intent intent=new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setClassName("org.chromium.chrome","org.chromium.chrome.browser.document.ChromeLauncherActivity");
        context.startActivity(intent);
    }

    private String readFile(String filepath){
        Log.e(TAG, "readFile: " );
        File file=new File(filepath);
        byte[] buff=new byte[(int) file.length()];
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(buff);
            fileInputStream.close();
            String hello = new String(buff, "utf-8");
            return  hello;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Log.e(TAG, "readFile: " + e.getMessage() );
        } catch (IOException e) {
            e.printStackTrace();
            Log.e(TAG, "readFile: " + e.getMessage() );
        }
        return null;
    }
}
