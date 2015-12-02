package com.example.administrator.alldemos.activities;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * ---------------------------------------------------
 * Description:Handler测试类
 * Author: ljgsonx
 * Belong to: com.example.administrator.alldemos.activities
 * Time: 2015/12/2 18:09
 * ---------------------------------------------------
 */
public class Activity18 extends AppCompatActivity {

    private static final int MSG_ACTION_UPDATE = 0;

    private TextView mTextView;
    private Handler mHandler =new MyHandler();
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        LinearLayout.LayoutParams _lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 80);
        mTextView = new TextView(this);
        mTextView.setText("This is contents of test!");
        mTextView.setLayoutParams(_lp);
        mTextView.setGravity(Gravity.CENTER);
        mTextView.setTextSize(20);
        mButton = new Button(this);
        mButton.setLayoutParams(_lp);
        mButton.setGravity(Gravity.CENTER);
        mButton.setText("change the content by Handler");
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 20; i++) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            Message _msg = new Message();
                            _msg.what = MSG_ACTION_UPDATE;
                            _msg.obj = i;
                            mHandler.sendMessage(_msg);
                        }
                    }
                }.start();
            }
        });
        LinearLayout _linearLayout = new LinearLayout(this);
        _linearLayout.addView(mTextView);
        _linearLayout.addView(mButton);
        _linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(_linearLayout);
    }

    class MyHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == MSG_ACTION_UPDATE) {
                mTextView.setText("Handler started,Time: "+msg.obj);
            }
            super.handleMessage(msg);
        }
    }
}