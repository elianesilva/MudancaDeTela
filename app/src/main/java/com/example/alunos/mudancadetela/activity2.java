package com.example.alunos.mudancadetela;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Alunos on 07/03/2018.
 */

public class activity2 extends AppCompatActivity {
    TextView activity02;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        activity02 = (TextView) findViewById(R.id.textactivity2);
        btn = (Button) findViewById(R.id.btactivity2);
    }
        public void btnclickAct2 (View v){
            Intent it = new Intent(this, MainActivity.class);
            startActivity(it);
            finish();
        }
}