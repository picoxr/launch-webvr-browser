# Launch WebVR Browser 

JAR file, demo apk and config file are in /resource.    
Note: Regarding JAR file creation and usage, please refer to [the Guideline](http://static.appstore.picovr.com/docs/JarUnity/index.html)

## Introduction
This demo can read the url from config file , then launch WebVR Browser to open the url.

## Usage
1. First, copy the config file (config.txt) to the Download directory of the device.
2. Modify the url in config.txt to what you need.
3. Install WebVR browser (chromepublic20180504.apk).
4. Build this project (or install demo apk directly) and launch, then it will switch to WebVR Browser and open the url.

## Class name
```
android:name="com.picovr.launchwebvr.LaunchWebVRClass"
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

## Interface
```
void launch(Context context, String filePath)
```

## Sample Code

```
string configPath = "/storage/emulated/0/Download/config.txt";
AndroidJavaObject ajo = new AndroidJavaObject("com.picovr.launchwebvr.LaunchWebVRClass");
AndroidJavaObject context = new AndroidJavaClass("com.unity3d.player.UnityPlayer").GetStatic<AndroidJavaObject>("currentActivity");

ajo.Call("launch", context, configPath);
```

## Note
This demo requires system signature. About how to sign a apk, refer to this [Customize Launcher on Pico Device](https://github.com/picoxr/support/blob/master/Customize%20Launcher%20on%20Pico%20Device.docx?raw=true).




