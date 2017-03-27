# Android Shortcuts

Example app for shortcuts in design library v25

### Demo
![Demo 1](https://raw.githubusercontent.com/pcevikogullari/AndroidShortcuts/master/shortcut1.gif) ![Demo 1](https://raw.githubusercontent.com/pcevikogullari/AndroidShortcuts/master/shortcut2.gif)

### Manifest
Add meta-data before ```</activity>``` tag in Manifest.xml
```
<meta-data android:name="android.app.shortcuts"
    android:resource="@xml/shortcuts" />
```

### Add Shortcut
To add or edit a new shotcut, go to /res/xml/shortcuts.xml :
```sh
<shortcuts xmlns:android="http://schemas.android.com/apk/res/android">
    <shortcut
        android:shortcutId="shortcut1"
        android:enabled="true"
        android:icon="@drawable/ic_directions_run_black_24dp"
        android:shortcutShortLabel="@string/shortcut1"
        android:shortcutLongLabel="@string/shortcut1_long"
        android:shortcutDisabledMessage="@string/shortcut1_disabled">
        <intent
            android:action="custom_action"
            android:targetPackage="com.pamir.shortcuts"
            android:targetClass="com.pamir.shortcuts.MainActivity" />
    </shortcut>
</shortcuts>
```

### Handle Actions

To handle shortcuts, just add new constant:
```
private final static String CUSTOM_ACTION = "custom_action";
```

and check the intent for custom action :
```
switch (getIntent().getAction()){
    case CUSTOM_ACTION:
        textView.setText(CUSTOM_ACTION);
        break;
    default:
        break;
}
```

