package com.larten.sep2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn_Login;
    Button btn_Exit;
    ImageView imageView4;
    ImageView imageView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Login =(Button)findViewById(R.id.btn_Login);
        btn_Exit = (Button)findViewById(R.id.btn_Exit);
        imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView5 = (ImageView)findViewById(R.id.imageView5);


    }
}
