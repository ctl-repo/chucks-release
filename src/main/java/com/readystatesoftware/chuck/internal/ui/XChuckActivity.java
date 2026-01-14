package com.readystatesoftware.chuck.internal.ui;

import android.app.Activity;
import android.os.Bundle;

public class XChuckActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish(); //Kill the page, because this is release build
    }
}
