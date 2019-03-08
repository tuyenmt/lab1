package com.example.mactrungtuyen.lab1_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_nhap;
    Button btn_kt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_nhap = (EditText)findViewById(R.id.edt_nhap);
        btn_kt = (Button)findViewById(R.id.btn_kt);
        btn_kt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count();
            }
        });

    }
   public void count(){
        String s = edt_nhap.getText().toString();
        char c = 'a';
        int count = 0;
        for (int i = 0; i <s.length(); i++){
            if (s.charAt(i) == c){
                count ++;
            }
        }

       Toast.makeText(this,"So ki tư là :" + count, Toast.LENGTH_LONG).show();
   }
}
