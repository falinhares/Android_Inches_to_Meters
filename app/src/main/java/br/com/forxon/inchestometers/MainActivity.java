package br.com.forxon.inchestometers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Elementos da tela
        EditText etPes=findViewById(R.id.etPes);
        Button btConverte=findViewById(R.id.btConverte);
        TextView tvResult=findViewById(R.id.tvResult);

        //Listener para quando clicar o botão
        btConverte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtPes=etPes.getText().toString();
                if(txtPes.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Você precisa entrar um valor e pés para converter!", Toast.LENGTH_SHORT).show();
                } else {
                    double valPes=Double.valueOf(txtPes);
                    double result=valPes*2.54/100;
                    DecimalFormat myDecFormat=new DecimalFormat("0.00");
                    tvResult.setText(myDecFormat.format(valPes)+" pés corresponde a "+myDecFormat.format(result)+" metros");
                }
            }
        });


    }
}