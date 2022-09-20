package pastrana.jero.ejercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txNombre;
    private TextView lbSaludo;
    private Button btReset;
    private Button btSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializa();

        btSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txNombre.getText().toString().trim().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Pon un nombre :(", Toast.LENGTH_SHORT).show();
                } else {
                    lbSaludo.setText("Hola, " + txNombre.getText() + ", buenas tardes.");
                    txNombre.setText("");
                }
            }
        });

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lbSaludo.setText("");
            }
        });


    }

    private void inicializa() {
        lbSaludo = findViewById(R.id.lbSaludoMain);
        btReset = findViewById(R.id.btResetMain);
        btSaludo = findViewById(R.id.btSaludoMain);
        txNombre = findViewById(R.id.txNombreMain);
    }
}