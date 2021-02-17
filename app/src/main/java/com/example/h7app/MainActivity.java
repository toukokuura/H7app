package com.example.h7app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text; // muuttujien alustus
    EditText write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);  //etsitään tekstikenttä, tyyppi TextView
        text.setText(":)");

        write = (EditText) findViewById(R.id.editText);
    }

    public void custom (View x) {
        text.setText(write.getText()); //asettaa kirjoitetun tekstin tekstikenttään
    }

    public void hello (View x) {
        System.out.println("Hello world!!"); // tulostaa konsoliin
        text.setText("Hello world!!");  //tekstikentän teksti
    }
}
