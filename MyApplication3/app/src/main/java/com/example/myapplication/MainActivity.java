package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resultado = findViewById(R.id.resultado);
        EditText numeroOne = findViewById(R.id.inputOne);
        TextView numeroTwo = findViewById(R.id.inputTwo);
        Button calcular = findViewById(R.id.calcular);
        Spinner spinner = findViewById(R.id.spinner);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double note11 = Double.parseDouble(numeroOne.getText().toString());
                    double note22 = Double.parseDouble(numeroTwo.getText().toString());
                    String selecionado = spinner.getSelectedItem().toString();

                    double res;
                    String cuceta;

                    switch(selecionado){
                        case "Selecione":
                            Toast toast2 = Toast.makeText(getApplicationContext(), "Selecione alguma operação" , Toast.LENGTH_SHORT);
                            toast2.show();
                            break;
                        case "Somar":
                             res = note22 + note11;
                             cuceta = String.valueOf(res);
                            resultado.setText(cuceta);
                            break;
                        case "Subtrair":
                             res = note22 - note11;
                             cuceta = String.valueOf(res);
                            resultado.setText(cuceta);
                            break;
                        case "Multiplicar":
                            res = note22 * note11;
                            cuceta = String.valueOf(res);
                            resultado.setText(cuceta);
                            break;

                        case "Dividir":
                            if (note22 == 0){
                                Toast toast3 = Toast.makeText(getApplicationContext(), "Não é possivel divisão por zero" , Toast.LENGTH_SHORT);
                                toast3.show();
                            }else{
                                res = note11 / note22;
                                cuceta = String.valueOf(res);
                                resultado.setText(cuceta);
                            }
                            break;
                    }


                } catch (NumberFormatException e) {
                    int duration = Toast.LENGTH_SHORT;
                    String text = "oiiii";
                    Toast toast = Toast.makeText(getApplicationContext(), "Insira algum valor" , duration);

                    toast.show();

                }

            }
        });







    }
}