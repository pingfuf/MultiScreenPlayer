package com.player;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by pingfu on 15/2/5.
 */
public class BaseActivity extends Activity {
    private View rootView;
    private View contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
    }
}
