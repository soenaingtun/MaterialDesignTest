package com.soenaingtun.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by SoeNaingTun on 7/2/15.
 */
public class MainActivity extends AppCompatActivity {

    private Button mbtnEditTest, mbtnSnackTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        mbtnEditTest=(Button)findViewById(R.id.btnEditTest);
        mbtnSnackTest=(Button)findViewById(R.id.btnSnackTest);

        mbtnEditTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToNextView(EditTextFloatLabelActivity.class);
            }
        });

        mbtnSnackTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToNextView(SnackBarTestActivity.class);
            }
        });
    }

    private void moveToNextView(Class<?> nextActivity) {

        startActivity(new Intent(MainActivity.this, nextActivity));
        //finish();
    }
}
