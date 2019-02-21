# Launch WebVR Browser 

Note: Regarding JAR file creation and usage, please refer to [the Guideline](https://github.com/picoxr/support/blob/master/How%20to%20use%20JAR%20file%20in%20Unity%20project%20on%20Pico%20Device.docx)

## Introduction
This demo can read the url from config file , then launch WebVR Browser to open the url.

## Usage
1. First, copy the config file (config.txt) to the Download directory of the device.
2. Modify the url in config.txt to what you need.
3. Install WebVR browser (chromepublic20180504.apk).
4. Build this project and launch, then it will switch to WebVR Browser and open the url.

## Class name
```
android:name="jeffrey.example.com.launcherwebvr.MainActivity"
```

## Permission

```
 <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
 <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
```

Add shardUserId property: 

```
android:sharedUserId="android.uid.system"
```

![](https://github.com/picoxr/LauncherWebVR/blob/master/01.png)

## Note
This demo requires system signature. About how to sign a apk, refer to this [Customize Launcher on Pico Device](https://github.com/picoxr/support/blob/master/Customize%20Launcher%20on%20Pico%20Device.docx?raw=true).




