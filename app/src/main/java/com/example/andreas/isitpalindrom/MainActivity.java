package com.example.andreas.isitpalindrom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTexteingabe;
    private TextView textausgabe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {

        editTexteingabe = this.findViewById(R.id.stringeingabe);

        String s = editTexteingabe.getText().toString();

        textausgabe = this.findViewById(R.id.ausgabeview);

        if (s.isEmpty()) {
            textausgabe.setText("Texteingabe ist leer!");
        } else if (s.length() < 5) {
            textausgabe.setText("Der eingegebene Text ist zu kurz");
        } else if (isPalindrom(s)==true) {
            textausgabe.setText("Eingabetext ist Palindrom ;)");
        } else {
            textausgabe.setText("Eingabetext ist kein Palindrom!");
        }
    }


    public static boolean isPalindrom (String z) {
        return z.equals(new StringBuilder(z).reverse().toString());
    }

}