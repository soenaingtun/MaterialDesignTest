package com.soenaingtun.view;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by SoeNaingTun on 7/2/15.
 */
public class SnackBarTestActivity extends AppCompatActivity {


    LinearLayout rootLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snack_test_layout);
        Button btnShow=(Button)findViewById(R.id.btnShow);
        rootLayout=(LinearLayout)findViewById(R.id.rootLayout);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackBar();
                // showAdditionalSnackBar();
            }
        });
    }

/*    private void showAdditionalSnackBar() {

        Snackbar.make(rootLayout, "Hello SnackBar!", Snackbar.LENGTH_SHORT)
                .setAction("Undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Perform anything for the action selected
                    }
                })
                .setActionTextColor(getResources().getColor(R.color.snacktextColor))
                .setDuration(4000).show();
    }*/

    private void showSnackBar() {

        Snackbar.make(rootLayout, "Hello SnackBar!",Snackbar.LENGTH_LONG)
                .setAction("Undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Perform anything for the action selected
                        Toast.makeText(getApplicationContext(), "SnackBar Event !", Toast.LENGTH_LONG).show();
                    }
                })
                .show();
    }
}
