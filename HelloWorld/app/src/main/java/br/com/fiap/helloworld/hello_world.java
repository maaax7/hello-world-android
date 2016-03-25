package br.com.fiap.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class hello_world extends AppCompatActivity {

    private TextView txtNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        txtNum = (TextView)findViewById(R.id.txtResult);
        txtNum.setText(R.string.txtZero);
    }

    public void executa(View v){
        Integer val = Integer.parseInt(txtNum.getText().toString());

        switch (v.getId()){
            case R.id.btnMais:{
                val++;
                txtNum.setText(String.valueOf(val));

                break;
            }
            case R.id.btnMenos: {
                val--;
                txtNum.setText(String.valueOf(val));

                break;
            }
            default:{
                Toast.makeText(this, "Conteúdo zerado!", Toast.LENGTH_SHORT).show();
                txtNum.setText(R.string.txtZero);

                break;
            }
        }
    }

    //public void mais(View v){
    //    Integer val = Integer.parseInt(txtNum.getText().toString());
    //    val++;

    //    txtNum.setText(String.valueOf(val));
    //}

    //public void menos(View v){
    //    Integer val = Integer.parseInt(txtNum.getText().toString());
    //    val--;

    //    txtNum.setText(String.valueOf(val));
    //}

    //public void zerar(View v){
    //    txtNum.setText(R.string.txtZero);
    //}
}
