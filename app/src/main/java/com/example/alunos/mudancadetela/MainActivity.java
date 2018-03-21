package com.example.alunos.mudancadetela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView activity02;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity02 = (TextView) findViewById(R.id.textactivity2);
        btn = (Button) findViewById(R.id.btactivity2);
    }
    public void btnclickAct1 (View v){
        Intent it = new Intent(this, activity2.class);
        startActivity(it);
        finish();
    }
}
