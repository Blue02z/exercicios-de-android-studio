package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        TextView textView = findViewById(R.id.textView2);
        TextView textView2 = findViewById(R.id.ptn);

        Intent intent = getIntent();
        int soma = intent.getIntExtra("CHAVE_INT7", -1);

        textView.setText(String.valueOf(soma));

        if (soma < 18 ){
            textView.setText("Conservador");
            textView2.setText(String.valueOf(soma));


        }else if(soma >= 18 && soma < 33){
            textView.setText("Moderado");
            textView2.setText(String.valueOf(soma));

        }else if(soma >= 33 && soma < 46){
            textView.setText("Agressivo");
            textView2.setText(String.valueOf(soma));

        }

    }
}