package com.soenaingtun.view;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by SoeNaingTun on 6/25/15.
 */
public class EditTextFloatLabelActivity extends AppCompatActivity {

    EditText medit_username, medit_password;
    Button mbtn_login;
    TextInputLayout username_layout, password_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_float_label);
        medit_username=(EditText)findViewById(R.id.edit_text_email);
        medit_password=(EditText)findViewById(R.id.edit_text_password);
        mbtn_login=(Button)findViewById(R.id.button);
        username_layout=(TextInputLayout)findViewById(R.id.emailLayout);

        mbtn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(medit_username.getText().toString().length()==0){
                    username_layout.setErrorEnabled(true);
                    username_layout.setError(getString(R.string.username));
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_text_float_label, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
