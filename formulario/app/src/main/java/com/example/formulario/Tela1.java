package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton rb1 = findViewById(R.id.rb1);
        RadioButton rb2 = findViewById(R.id.rb2);
        RadioButton rb3 = findViewById(R.id.rb3);
        RadioButton rb4 = findViewById(R.id.rb4);
        RadioButton rb5 = findViewById(R.id.rb5);
        Button button = findViewById(R.id.btn1);





        button.setOnClickListener(new View.OnClickListener() {
             private int soma;
             final String soma2 = "oi";
            public static final int REQUEST_CODE = 1;
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()){
                    soma = 0;
                    Intent intent = new Intent(Tela1.this, Tela2.class);
                    intent.putExtra("CHAVE_INT", soma);
                    startActivity(intent);
                };

                if(rb2.isChecked()){
                    soma = 2;
                    Intent intent = new Intent(Tela1.this, Tela2.class);
                    intent.putExtra("CHAVE_INT", soma);
                    startActivity(intent);
                }

                if(rb3.isChecked()){
                    soma = 4;
                    Intent intent = new Intent(Tela1.this, Tela2.class);
                    intent.putExtra("CHAVE_INT", soma);
                    startActivity(intent);
                }

                if(rb4.isChecked()){
                    soma = 8;
                    Intent intent = new Intent(Tela1.this, Tela2.class);
                    intent.putExtra("CHAVE_INT", soma);
                    startActivity(intent);
                }

                if(rb5.isChecked()){
                    soma = 10;
                    Intent intent = new Intent(Tela1.this, Tela2.class);
                    intent.putExtra("CHAVE_INT", soma);
                    startActivity(intent);
                }
            }
        });

    }
}