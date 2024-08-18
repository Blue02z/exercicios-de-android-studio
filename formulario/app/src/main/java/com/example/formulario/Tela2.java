package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);


        RadioButton rb1 = findViewById(R.id.rb12);
        RadioButton rb2 = findViewById(R.id.rb22);
        RadioButton rb3 = findViewById(R.id.rb32);
        RadioButton rb4 = findViewById(R.id.rb42);
        RadioButton rb5 = findViewById(R.id.rb52);
        Button button = findViewById(R.id.btn3);



        Intent intent = getIntent();




        button.setOnClickListener(new View.OnClickListener() {
            int soma = intent.getIntExtra("CHAVE_INT", -1);
            public static final int REQUEST_CODE = 1;
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()){
                    soma += 5;
                    Intent intent = new Intent(getApplicationContext(), Tela3.class);
                    intent.putExtra("CHAVE_INT2", soma);
                    startActivity(intent);
                };

                if(rb2.isChecked()){
                    soma += 4;
                    Intent intent = new Intent(getApplicationContext(), Tela3.class);
                    intent.putExtra("CHAVE_INT2", soma);
                    startActivity(intent);
                }

                if(rb3.isChecked()){
                    soma += 3;
                    Intent intent = new Intent(getApplicationContext(), Tela3.class);
                    intent.putExtra("CHAVE_INT2", soma);
                    startActivity(intent);
                }

                if(rb4.isChecked()){
                    soma += 2;
                    Intent intent = new Intent(getApplicationContext(), Tela3.class);
                    intent.putExtra("CHAVE_INT2", soma);
                    startActivity(intent);
                }

                if(rb5.isChecked()){
                    soma += 1;
                    Intent intent = new Intent(getApplicationContext(), Tela3.class);
                    intent.putExtra("CHAVE_INT", soma);
                    startActivity(intent);
                }
            }
        });

    }
}