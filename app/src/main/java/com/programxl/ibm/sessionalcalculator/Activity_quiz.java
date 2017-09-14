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
    public void clickQuiz(View view)
    {
        EditText edit;
        Double total_obt=0.0;
        Double total_tot=0.0;
        edit = (EditText)findViewById(R.id.obt_quiz1);
        String obtt_quiz1= edit.getText().toString();
        if(obtt_quiz1.isEmpty())
        {

        }else
        {
            Double obtained_quiz1 = Double.parseDouble(obtt_quiz1);
            total_obt= total_obt+obtained_quiz1;
        }


        edit = (EditText)findViewById(R.id.obt_quiz2);
        String obtt_quiz2= edit.getText().toString();
        if(obtt_quiz2.isEmpty())
        {

        }else
        {
            Double obtained_quiz2 = Double.parseDouble(obtt_quiz2);
            total_obt= total_obt+obtained_quiz2;
        }

        edit = (EditText)findViewById(R.id.obt_quiz3);
        String obtt_quiz3= edit.getText().toString();
        if(obtt_quiz3.isEmpty())
        {

        }else
        {
            Double obtained_quiz3 = Double.parseDouble(obtt_quiz3);
            total_obt= total_obt+obtained_quiz3;
        }

        edit = (EditText)findViewById(R.id.obt_quiz4);
        String obtt_quiz4= edit.getText().toString();
        if(obtt_quiz4.isEmpty())
        {

        }else
        {
            Double obtained_quiz4 = Double.parseDouble(obtt_quiz4);
            total_obt= total_obt+obtained_quiz4;
        }

        edit = (EditText)findViewById(R.id.obt_quiz5);
        String obtt_quiz5= edit.getText().toString();
        if(obtt_quiz5.isEmpty())
        {

        }else
        {
            Double obtained_quiz5 = Double.parseDouble(obtt_quiz5);
            total_obt= total_obt+obtained_quiz5;
        }

        edit = (EditText)findViewById(R.id.obt_quiz6);
        String obtt_quiz6= edit.getText().toString();
        if(obtt_quiz6.isEmpty())
        {

        }else
        {
            Double obtained_quiz6 = Double.parseDouble(obtt_quiz6);
            total_obt= total_obt+obtained_quiz6;
        }



        edit = (EditText)findViewById(R.id.tot_quiz1);
        String tott_quiz1= edit.getText().toString();
        if(tott_quiz1.isEmpty())
        {

        }else
        {
            Double total_quiz1 = Double.parseDouble(tott_quiz1);
            total_tot= total_tot+total_quiz1;
        }


        edit = (EditText)findViewById(R.id.tot_quiz2);
        String tott_quiz2= edit.getText().toString();
        if(tott_quiz2.isEmpty())
        {

        }else
        {
            Double total_quiz2 = Double.parseDouble(tott_quiz2);
            total_tot= total_tot+total_quiz2;
        }

        edit = (EditText)findViewById(R.id.tot_quiz3);
        String tott_quiz3= edit.getText().toString();
        if(tott_quiz3.isEmpty())
        {

        }else
        {
            Double total_quiz3 = Double.parseDouble(tott_quiz3);
            total_tot= total_tot+total_quiz3;
        }

        edit = (EditText)findViewById(R.id.tot_quiz4);
        String tott_quiz4= edit.getText().toString();
        if(tott_quiz4.isEmpty())
        {

        }else
        {
            Double total_quiz4 = Double.parseDouble(tott_quiz4);
            total_tot= total_tot+total_quiz4;
        }

        edit = (EditText)findViewById(R.id.tot_quiz5);
        String tott_quiz5= edit.getText().toString();
        if(tott_quiz5.isEmpty())
        {

        }else
        {
            Double total_assi5 = Double.parseDouble(tott_quiz5);
            total_tot= total_tot+total_assi5;
        }

        edit = (EditText)findViewById(R.id.tot_quiz6);
        String tott_quiz6= edit.getText().toString();
        if(tott_quiz6.isEmpty())
        {

        }else
        {
            Double total_quiz6 = Double.parseDouble(tott_quiz6);
            total_tot= total_tot+total_quiz6;
        }
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


