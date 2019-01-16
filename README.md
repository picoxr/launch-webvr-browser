# LauncherWebVR Instructions

Note: Regarding java package creation and usege, please refer to [the Guideline](https://github.com/PicoSupport/PicoSupport/blob/master/How_to_use_JAR_file_in_Unity_project_on_Pico_device.docx)

## Introduction
this demo can read the url from config file , then launch WebVR App to open the url.

## Usage
1. First, copy the config file (config.txt) to the Download directory of the device.
2. Modify the url in config.txt to what you need.
3. Install WebVR App (chromepublic20180504.apk)
4. Build this project and launch, then it will switch to WebVR App and open the url.

## Class name
android:name="jeffrey.example.com.launcherwebvr.MainActivity"

## Permission

```
 <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
 <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
```

add shardUserId property: <br>

```
android:sharedUserId="android.uid.system"
```

![](https://github.com/PicoSupport/LauncherWebVR/blob/master/01.png)

## Note
This demo requires system signature.




