package utec.edu.sv.tptriangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Lado1, Lado2, Lado3;
    Button btmostrar;
    TextView txError;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lado1=findViewById(R.id.edtL1);
        Lado2=findViewById(R.id.edtL2);
        Lado3=findViewById(R.id.edtL3);
        txError=findViewById(R.id.txtError);
        btmostrar=findViewById(R.id.btnMostrar);

        btmostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int L1,L2,L3;
                String mensaje;

                L1=Integer.parseInt(Lado1.getText().toString());
                L2=Integer.parseInt(Lado2.getText().toString());
                L3=Integer.parseInt(Lado3.getText().toString());

                if (L1 > 0 && L2 > 0 && L3 > 0) {

                    if ((L1 == L2) && (L1 == L3) && (L2 == L3)) {

                        Intent i =new Intent(getApplicationContext(), equilatero.class);
                        i.putExtra("Ls1",Lado1.getText().toString());
                        i.putExtra("Ls2",Lado2.getText().toString());
                        i.putExtra("Ls3",Lado3.getText().toString());
                        startActivity(i);
                        //"Es triangulo Equilatero"
                    } else {
                        if ((L1 == L2) && (L3!=L1) && (L3 != L2)){

                            Intent i =new Intent(getApplicationContext(),isosceles.class);
                            i.putExtra("Ls1",Lado1.getText().toString());
                            i.putExtra("Ls2",Lado2.getText().toString());
                            i.putExtra("Ls3",Lado3.getText().toString());
                            startActivity(i);
                            //"Es triangulo isoseles"
                        }
                        else{
                            if ((L1 == L3) && (L2!=L1) && (L2 != L3)){

                                Intent i=new Intent(getApplicationContext(),isosceles.class);
                                i.putExtra("Ls1",Lado1.getText().toString());
                                i.putExtra("Ls2",Lado2.getText().toString());
                                i.putExtra("Ls3",Lado3.getText().toString());
                                startActivity(i);

                            }
                            else{
                                if ((L2 == L3) && (L2!=L1) && (L1 != L3)){

                                    Intent i=new Intent(getApplicationContext(),isosceles.class);
                                    i.putExtra("Ls1",Lado1.getText().toString());
                                    i.putExtra("Ls2",Lado2.getText().toString());
                                    i.putExtra("Ls3",Lado3.getText().toString());
                                    startActivity(i);

                                }
                                else{
                                    if ((L1 != L2) && (L2!=L3) && (L3 != L1)){

                                        Intent i =new Intent(getApplicationContext(),escaleno.class);
                                        i.putExtra("Ls1",Lado1.getText().toString());
                                        i.putExtra("Ls2",Lado2.getText().toString());
                                        i.putExtra("Ls3",Lado3.getText().toString());
                                        startActivity(i);

                                    }
                                    else{
                                        mensaje = "Error";
                                        txError.setText(mensaje);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    mensaje = "ingrese valor mayores a 0";
                    txError.setText(mensaje);
                    //"ingrese valor mayores a 0"
                }

            }
        });
    }
}