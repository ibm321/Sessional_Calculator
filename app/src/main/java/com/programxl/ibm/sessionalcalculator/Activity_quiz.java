package com.programxl.ibm.sessionalcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Activity_quiz extends AppCompatActivity {
    EditText edit;
    Double total_obt=0.0;
    Double total_tot=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quiz);
       TextView txtView = (TextView) findViewById(R.id.cal_quiz);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null)
        {
            String getName =  bd.get("name").toString();
            txtView.setText(getName);
        }


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
    public void clickQuiz(View view)
    {
        //Obtained Assignment 1
        edit = (EditText)findViewById(R.id.obt_quiz1);
        sum_obt(edit);


        //Obtained Assignment 2
        edit = (EditText)findViewById(R.id.obt_quiz2);
        sum_obt(edit);

        //Obtained Assignment 3
        edit = (EditText)findViewById(R.id.obt_quiz3);
        sum_obt(edit);

        //Obtained Assignment 4
        edit = (EditText)findViewById(R.id.obt_quiz4);
        sum_obt(edit);

        //Obtained Assignment 5
        edit = (EditText)findViewById(R.id.obt_quiz5);
        sum_obt(edit);

        //Obtained Assignment 6
        edit = (EditText)findViewById(R.id.obt_quiz6);
        sum_obt(edit);


        //Total Assignment 1
        edit = (EditText)findViewById(R.id.tot_quiz1);
        sum_tot(edit);

        //Total Assignment 2
        edit = (EditText)findViewById(R.id.tot_quiz2);
        sum_tot(edit);

        //Total Assignment 3
        edit = (EditText)findViewById(R.id.tot_quiz3);
        sum_tot(edit);

        //Total Assignment 4
        edit = (EditText)findViewById(R.id.tot_quiz4);
        sum_tot(edit);

        //Total Assignment 5
        edit = (EditText)findViewById(R.id.tot_quiz5);
        sum_tot(edit);

        //Total Assignment 6
        edit = (EditText)findViewById(R.id.tot_quiz6);
        sum_tot(edit);

        Double percent_quiz=0.0;
        edit = (EditText)findViewById(R.id.per_quiz);
        String per_quiz =edit.getText().toString();
        if(per_quiz.isEmpty()){

        }
        else
        {
            percent_quiz = Double.parseDouble(per_quiz);
        }
        TextView txtvw=(TextView)findViewById(R.id.cal_quiz);
        String getstr=txtvw.getText().toString();
        Double total =Double.parseDouble(getstr);
        Double totalquiz=(total_obt/total_tot)*percent_quiz;
        total=total+totalquiz;
        Double total2=Math.round(total*100.0)/100.0;
        Intent intent = new Intent(Activity_quiz.this, Activity_total.class);
        intent.putExtra("name", total2);
        startActivity(intent);


    }
    }


