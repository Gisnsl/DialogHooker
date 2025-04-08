package com.test.dialogByAhmed;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import mahos.Dialog.DialogHtmlByAhmed;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello World");
        setContentView(tv);
        DialogHtmlByAhmed.get(this);
    }
}

