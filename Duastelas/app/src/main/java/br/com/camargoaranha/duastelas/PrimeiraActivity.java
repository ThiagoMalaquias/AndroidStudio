package br.com.camargoaranha.duastelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeiraActivity extends AppCompatActivity {
    TextView lblTela1;
    EditText txtTela1;
    Button btSegunda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        lblTela1 = findViewById(R.id.lblTela1);
        txtTela1 = findViewById(R.id.txtTela1);
        btSegunda = findViewById(R.id.btIrSegunda);

        btSegunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaSegunda(v);
            }
        });
    }

    private void chamaSegunda(View v){
        Intent it = new Intent(this,SegundaActivity.class);
        it.putExtra("Valor",txtTela1.getText().toString());
        startActivityForResult(it,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                lblTela1.setText(data.getStringExtra("Result"));
            }
        }
    }
}
