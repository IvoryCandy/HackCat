package com.orz.hackcat.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.liuguangqiang.swipeback.SwipeBackLayout;
import com.orz.hackcat.R;

/**
 * Created by catherinezhuang on 10/14/17.
 */

public class DemoActivity extends Activity {

    private ProgressBar progressBar;
    private SwipeBackLayout swipeBackLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        initViews();
    }

    private void initViews() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar4);
        swipeBackLayout = (SwipeBackLayout) findViewById(R.id.swipe_layout);
        swipeBackLayout.setEnableFlingBack(false);

        swipeBackLayout.setOnPullToBackListener(new SwipeBackLayout.SwipeBackListener() {
            @Override
            public void onViewPositionChanged(float fractionAnchor, float fractionScreen) {
                float progress =  progressBar.getMax() * fractionAnchor;
                progressBar.setProgress((int) progress);
                if (progress >= progressBar.getMax() * 3 / 4) {
                    Intent k = new Intent(DemoActivity.this, FunctionActivity.class);
                    startActivity(k);
                }
            }
        });
    }

}
