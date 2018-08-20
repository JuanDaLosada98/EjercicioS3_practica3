package com.example.estudiante.ejercicios3;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView tv_resultado;
    EditText et_masa;
    EditText et_altura;
    Button btn_calcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_resultado= findViewById(R.id.tv_resultado);
        et_masa = findViewById(R.id.et_masa);
        et_altura = findViewById(R.id.et_altura);
        btn_calcular = findViewById(R.id.btn_calcular);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String masa = et_masa.getText().toString();
                String altura = et_altura.getText().toString();
                Float n2 = Float.parseFloat(altura);
                Float n1 = Float.parseFloat(masa);
                Float resultado = (n1 / (n2*n2))*10000;
                tv_resultado.setText(resultado.toString());
                Toast.makeText(MainActivity.this, "Tú IMC ES " + resultado.toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }


}
