package utec.edu.sv.suma5ultimosn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView txContador, txRespuesta;
    EditText etvalor;
    Button btcalcular, btlimpiar;

    int Cont=0, suma=0;
    String data1="", data2="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etvalor=findViewById(R.id.edtvalor);
        txContador=findViewById(R.id.txtcont);
        txRespuesta=findViewById(R.id.txtrespuesta);
        btcalcular=findViewById(R.id.btnprocesar);
        btlimpiar=findViewById(R.id.btnlimpiar);


        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String dato;
               int num;
               double result;

               num=Integer.parseInt(etvalor.getText().toString());
               if (Cont>4){

                  suma=suma+num;

               }
               Cont++;
               txContador.setText("Contador: "+String.valueOf(Cont));
               if (Cont>9){
                   btcalcular.setEnabled(false);
                   txRespuesta.setText("La Suma Es: "+String.valueOf(suma));

               }


            }
        });

        btlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btcalcular.setEnabled(true);
                Cont=0; suma=0;
                txContador.setText("Contador: 0");
                txRespuesta.setText("La Suma Es: 0");
            }
        });

    }
}