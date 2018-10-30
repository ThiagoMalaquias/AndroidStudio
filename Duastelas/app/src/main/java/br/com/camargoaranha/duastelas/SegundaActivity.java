package br.com.camargoaranha.duastelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    TextView lblTela2;
    EditText txtTela2;
    Button btVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent itLocal = getIntent();
        String valorPassado = itLocal.getStringExtra("Valor");

        lblTela2 = findViewById(R.id.lblTela2);
        txtTela2 = findViewById(R.id.txtTela2);
        btVoltar = findViewById(R.id.btVoltar);
        lblTela2.setText(valorPassado);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaPrimeira(v);
            }
        });
    }

    private void chamaPrimeira(View v){
        Intent ri = new Intent();

        ri.putExtra("Result:", txtTela2.getText().toString());

        setResult(RESULT_OK,ri);
        finish();
    }
}
