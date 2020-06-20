package com.example.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.nfc.FormatException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;
    Button btnSoma;
    Button btnDivisao;
    Button btnSubtracao;
    Button btnMultiplicacao;

    double n1, n2, nr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.txtNum1);
        num2 = (EditText)findViewById(R.id.txtNum2);
        result = (TextView)findViewById(R.id.txtResult);
        btnSoma = (Button)findViewById(R.id.btnCalculo1);
        btnDivisao = (Button)findViewById(R.id.btnCalculo2);
        btnSubtracao = (Button)findViewById(R.id.btnCalculo3);
        btnMultiplicacao = (Button)findViewById(R.id.btnCalculo4);
    }

    public void Soma(View botao)
    {
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            nr = n1 + n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Valor inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
        }

        result.setText(Double.toString(nr));
    }

    public void Subtração(View botao)
    {
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            nr = n1 - n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Valor inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
        }

        result.setText(Double.toString(nr));
    }

    public void Multiplicação(View botao)
    {
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            nr = n1 * n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Valor inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
        }

        result.setText(Double.toString(nr));
    }

    public void Divisão(View botao)
    {
        int i = 0;
        n2 = 0;
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            nr = n1 / n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Valor inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
            i = 1;
        }

        if ((n2 == 0) && i == 0){
            Toast messageBox = Toast.makeText(this,"Não pode dividir por zero!", Toast.LENGTH_SHORT);
            messageBox.show();
            i = 0;
        }
        else {
            result.setText(Double.toString(nr));
        }
    }
}
