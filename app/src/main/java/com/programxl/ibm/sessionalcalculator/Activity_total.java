package com.programxl.ibm.sessionalcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Activity_total extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total);
        TextView txtView = (TextView) findViewById(R.id.cal_mid);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if (bd != null) {
            String getName = bd.get("name").toString();
            txtView.setText(getName);
        }
    }
    public void calculate(View view){
        Double mid_marks=0.0;
        Double mid_marks1=0.0;
        Double total11=0.0;
       TextView txtvw = (TextView)findViewById(R.id.cal_mid);
        String s = txtvw.getText().toString();
        Double cal_midd= Double.parseDouble(s);
        total11= total11+cal_midd;
        EditText edit=(EditText)findViewById(R.id.obt_mid);
        String mid = edit.getText().toString();
        if(mid.isEmpty())
        {

        }
        else{
            mid_marks=Double.parseDouble(mid);
            total11=total11+mid_marks;
        }

        EditText edit1=(EditText)findViewById(R.id.obt_p);
        String mid1 = edit1.getText().toString();
        if(mid1.isEmpty())
        {

        }
        else
        {
           mid_marks1=Double.parseDouble(mid1);
            total11=total11+mid_marks1;
        }

        String message= total11.toString();
        txtvw.setText(message);
    }
    public void clickAbout(View view)
    {
        Intent intent = new Intent(Activity_total.this, about.class);
        startActivity(intent);
    }
}
