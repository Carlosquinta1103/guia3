package utec.edu.sv.tptriangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import utec.edu.sv.tptriangulo.R;
public class equilatero extends AppCompatActivity {

    TextView ld1,ld2,ld3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equilatero);
        ld1=findViewById(R.id.txtld1);
        ld2=findViewById(R.id.txtld2);
        ld3=findViewById(R.id.txtld3);

        String lado1,lado2,lado3;

        Bundle bundle=getIntent().getExtras();
        lado1="Lado 1: "+bundle.getString("Ls1");
        ld1.setText(lado1);
        lado2="Lado 2: "+bundle.getString("Ls2");
        ld2.setText(lado2);
        lado3="Lado 3: "+bundle.getString("Ls3");
        ld3.setText(lado3);


    }
}