package utec.edu.sv.ejercicio4guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtNum;
    TextView tv1,tv2;
    Button btbuton, btlimpiar;
    int contador = 0, pares = 0;
    int numPositivos = 0,  numNegativos = 0, cantMultiplos = 0;

    String data1="", data2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum = findViewById(R.id.edtNumber);
        tv1 = findViewById(R.id.tvTotalIngresado);
        tv2 = findViewById(R.id.tvResultado);
        btbuton=findViewById(R.id.btncalcular);
        btlimpiar=findViewById(R.id.btnlimpiar);

        btlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btbuton.setEnabled(true);
                contador = 0; pares = 0;
                numPositivos = 0;  numNegativos = 0; cantMultiplos = 0;
                data1=""; data2="";
                tv1.setText("Cantidad de numeros ingresados: 0");
                tv2.setText("Total numeros positivos: 0"+"\nTotal numeros negativos: 0"+"\nLa suma de numeros pares es: 0"+"\nCantidad de numeros multiplo de 15: 0");

            }
        });
    }

    public void procesar(View view){

        String data = edtNum.getText().toString();

        int num = Integer.parseInt(data);
        double resul;

        if(num < 0 ){
            numNegativos++;
        }else{
            numPositivos++;
            if(num % 2 == 0){
                pares = pares + num;
            }
            resul = num%15;
            if(resul == 0){
                cantMultiplos++;
            }
        }
        contador++;
        tv1.setText("Cantidad de numeros ingresados: "+String.valueOf(contador));
        tv2.setText("Total numeros positivos: "+numPositivos+"\nTotal numeros negativos: "+numNegativos+"\nLa suma de numeros pares es: "+pares+"\nCantidad de numeros multiplo de 15: "+cantMultiplos);
        if(contador > 9){

            btbuton.setEnabled(false);
        }
    }
}