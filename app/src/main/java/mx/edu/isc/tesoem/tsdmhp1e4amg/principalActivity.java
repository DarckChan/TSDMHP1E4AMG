package mx.edu.isc.tesoem.tsdmhp1e4amg;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class principalActivity extends AppCompatActivity {

    CheckBox checkcasa,checkescuela,checkstiopublico;
    RadioButton rbh,rbm,rbno;
    Spinner spestados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        checkcasa=findViewById(R.id.checkcasa);
        checkescuela=findViewById(R.id.checkescuela);
        checkstiopublico=findViewById(R.id.checkpublico);


        rbh=findViewById(R.id.radioButton);
        rbm=findViewById(R.id.radioButton2);
        rbno=findViewById(R.id.radioButton3);

        spestados=findViewById(R.id.spinneredos);


        checkcasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkcasa.isChecked()){
                    Toast.makeText(principalActivity.this, "selecciono casa", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkescuela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkescuela.isChecked()){
                    Toast.makeText(principalActivity.this, "selecciono escuela", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkstiopublico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkstiopublico.isChecked()){
                    Toast.makeText(principalActivity.this, "selecciono publico", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rbh.isChecked()){
                    Toast.makeText(principalActivity.this, "selecciono hombre", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rbm.isChecked()){
                    Toast.makeText(principalActivity.this, "Selecciono mujer", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rbno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rbno.isChecked()){
                    Toast.makeText(principalActivity.this, "Selecciono no decirlo", Toast.LENGTH_SHORT).show();
                }
            }
        });

        spestados.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(principalActivity.this, spestados.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}