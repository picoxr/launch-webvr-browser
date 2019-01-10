# LauncherWebVR Instructions

## 1.How to Use

1. First, copy the configuration file config.txt (written to the VR url) to the Download directory of the device.
2. The device installs the VR browser (chromepublic20180504.apk) and the jumping browser application LauncherWebVR (launcherwebvr_signed_20180504.apk).
3. Directly open the application LauncherWebVR

## Source Code

1.Modify AndroifMinifest.xml.Add code:

```
android:sharedUserId="android.uid.system"
```

![](https://github.com/PicoSupport/LauncherWebVR/blob/master/01.png)

Add Permission

```
 <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
 <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
```

2.Method of Calling

| Call Action    | android.intent.action.VIEW                                  |
| -------------- | ----------------------------------------------------------- |
| BrowserPackage | org.chromium.chrome                                         |
| BrowserClass   | org.chromium.chrome.browser.document.ChromeLauncherActivity |

## **Note**

1. This method requires a system signature

