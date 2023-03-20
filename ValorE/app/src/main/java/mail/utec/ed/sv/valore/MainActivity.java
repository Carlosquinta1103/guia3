package mail.utec.ed.sv.valore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    EditText etValorE;
    TextView txresp;
    Button btmostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etValorE= findViewById(R.id.edtValor);
        txresp=findViewById(R.id.txtrespuesta);
        btmostrar=findViewById(R.id.btnmostrar);

        btmostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int valore;
                String resp;

                valore=Integer.parseInt(etValorE.getText().toString());

                if (valore>0){
                    txresp.setText("El numero es Positivo");
                }
                else if (valore<0){
                    txresp.setText("El numero es negativo");
                }
                else if (valore==0) {
                    txresp.setText("El numero es nulo");
                }
                else {
                    txresp.setText("Escriba un valor entero");
                }


            }
        });

    }
}