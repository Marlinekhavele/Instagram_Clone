package com.example.student.instagramclone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText etUserName= (EditText) findViewById(R.id.etUserEmail);
        Button BtnSignUp= (Button) findViewById(R.id.btnSignup);
        EditText etPassword= (EditText) findViewById(R.id.etPassword);
        TextView tvOr= (TextView) findViewById(R.id.tvOr);
        TextView tvLanguage= (TextView) findViewById(R.id.tvLanguage);
        TextView tvHelp= (TextView) findViewById(R.id.tvHelp);
        TextView tvFacebook= (TextView) findViewById(R.id.tvFacebook);
        Button BtnLogin= (Button) findViewById(R.id.btnLogin);
        ImageView ivLogo= (ImageView) findViewById(R.id.ivLogo);
    }
}
