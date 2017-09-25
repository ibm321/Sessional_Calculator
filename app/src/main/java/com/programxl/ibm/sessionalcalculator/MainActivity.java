package com.programxl.ibm.sessionalcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    Double total_obt=0.0;
    Double total_tot=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sum_obt(EditText edit){
        String get_obt_num=edit.getText().toString();;
        if(get_obt_num.isEmpty())
        {

        }else
        {
            Double obtained = Double.parseDouble(get_obt_num);
            total_obt= total_obt+obtained;
        }
    }
    public void sum_tot(EditText edit){
        String get_obt_num=edit.getText().toString();;
        if(get_obt_num.isEmpty())
        {

        }else
        {
            Double obtained = Double.parseDouble(get_obt_num);
            total_tot= total_tot+obtained;
        }
    }
    public void clickFunction(View view){



        //Obtained Assignment 1
        edit = (EditText)findViewById(R.id.obt_assi1);
       sum_obt(edit);


        //Obtained Assignment 2
        edit = (EditText)findViewById(R.id.obt_assi2);
        sum_obt(edit);

        //Obtained Assignment 3
        edit = (EditText)findViewById(R.id.obt_assi3);
        sum_obt(edit);

        //Obtained Assignment 4
        edit = (EditText)findViewById(R.id.obt_assi4);
        sum_obt(edit);

        //Obtained Assignment 5
        edit = (EditText)findViewById(R.id.obt_assi5);
        sum_obt(edit);

        //Obtained Assignment 6
        edit = (EditText)findViewById(R.id.obt_assi6);
        sum_obt(edit);


       //Total Assignment 1
        edit = (EditText)findViewById(R.id.totassi1);
       sum_tot(edit);

        //Total Assignment 2
        edit = (EditText)findViewById(R.id.tot_assi2);
        sum_tot(edit);

        //Total Assignment 3
        edit = (EditText)findViewById(R.id.tot_assi3);
        sum_tot(edit);

        //Total Assignment 4
        edit = (EditText)findViewById(R.id.tot_assi4);
        sum_tot(edit);

        //Total Assignment 5
        edit = (EditText)findViewById(R.id.tot_assi5);
        sum_tot(edit);

        //Total Assignment 6
        edit = (EditText)findViewById(R.id.tot_assi6);
        sum_tot(edit);


        Double percent_assi=0.0;
        edit = (EditText)findViewById(R.id.per_assi);
        String per_assi =edit.getText().toString();
        if(per_assi.isEmpty()){

        }
        else
        {
            percent_assi = Double.parseDouble(per_assi);
        }
        Double total=(total_obt/total_tot)*percent_assi;
        Double total2=Math.round(total*100.0)/100.0;
        Intent intent = new Intent(MainActivity.this, Activity_quiz.class);
        intent.putExtra("name", total2);
        startActivity(intent);
    }

}
