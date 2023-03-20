package utec.edu.sv.cifrasn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText ValorEP;
    TextView txresp;
    Button btMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ValorEP=findViewById(R.id.edtValorE);
        txresp=findViewById(R.id.txtresp);
        btMostrar=findViewById(R.id.btnMostrar);

        btMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ValorE;

                ValorE=Integer.parseInt(ValorEP.getText().toString());

                if (ValorE>=0 && ValorE<=9 ){
                    txresp.setText("El Valor entero es 1 cifra.");
                }
                else if (ValorE>=10 && ValorE<=99){
                    txresp.setText("El Valor entero es 2 cifra.");
                }
                else if (ValorE>=100 && ValorE<=999){
                    txresp.setText("El Valor entero es 3 cifra.");
                }
                else if (ValorE>999){
                    txresp.setText("Error Numero de 4 cifras");
                }
                else {
                    txresp.setText("Error solo numeros positivos");
                }
            }
        });

    }
}