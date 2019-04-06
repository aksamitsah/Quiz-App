package com.aksamitsah.quizapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int score = 0;
    EditText name1, id1, email1, ans_Q4;
    String Q1_S, Q3_S;
    RadioGroup Q1_rg, Q3_rg;
    RadioButton Q1_rb, Q3_rb;

    CheckBox Chock;
    CheckBox Chock1;
    CheckBox Chock2;
    CheckBox Chock3;


    /**
     * scores calculate total score;
     */
    public void scores() {
        score++;
        // Toast.makeText("grl", "You checked: "+getString(R.string.question1_ans1), Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans_Q4 = (EditText) findViewById(R.id.output_ans_Q4);
        name1 = (EditText) findViewById(R.id.name_view);
        id1 = (EditText) findViewById(R.id.id_data);
        email1 = (EditText) findViewById(R.id.email_data);
        Q1_rg = (RadioGroup) findViewById(R.id.rgroup);
        Q3_rg = (RadioGroup) findViewById(R.id.rgroupQ3);

    }

    /**
     * @parm Q1_radio used to show popup message select option and store value in Q1_S;
     */
    public void Q1_radio(View view) {
        int radiobuttonid = Q1_rg.getCheckedRadioButtonId();
        Q1_rb = (RadioButton) findViewById(radiobuttonid);
        String Q1_S = (String) Q1_rb.getText();
        Toast.makeText(this, "You checked: " + Q1_S, Toast.LENGTH_LONG).show();
    }

    /**
     * @parm Q3_radio used to show popup message select option and store value in Q3_S;
     */
    public void Q3_radio(View view) {
        int radiobuttonid = Q3_rg.getCheckedRadioButtonId();
        Q3_rb = (RadioButton) findViewById(radiobuttonid);
        String Q3_S = (String) Q3_rb.getText();
        Toast.makeText(this, "You checked: " + Q3_S, Toast.LENGTH_LONG).show();
    }

    /**
     * @show_result
     */


    public void show_result(View view) {
        score = 0;

        /**
         *  information name,id and email
         */
        String name_value = name1.getText().toString();
        String id_value = id1.getText().toString();
        String email_value = email1.getText().toString();
        /**
         * q1
         */
        Boolean answer1;
        Q1_rb = (RadioButton) this.findViewById(R.id.radioButton2);
        answer1 = Q1_rb.isChecked();
        if (answer1) {
            scores();
        } else {

        }

        /**
         *  q2
         */
        Chock = (CheckBox) findViewById(R.id.notify_me_checkbox1);
        Chock1 = (CheckBox) findViewById(R.id.notify_me_checkbox2);
        Chock2 = (CheckBox) findViewById(R.id.notify_me_checkbox3);
        Chock3 = (CheckBox) findViewById(R.id.notify_me_checkbox4);
        boolean choice1 = Chock.isChecked();
        boolean choice2 = Chock1.isChecked();
        boolean choice3 = Chock2.isChecked();
        boolean choice4 = Chock3.isChecked();
        if (choice1 && choice2 && choice3 && !choice4) {
            scores();
        } else {
        }
        /**
         * q3
         */
        Boolean answer3;
        Q3_rb = (RadioButton) this.findViewById(R.id.radioButtonq4);
        answer3 = Q3_rb.isChecked();
        if (answer3) {
            scores();
        } else {
        }
        /**
         * q4
         */
        String score_value = ans_Q4.getText().toString();
        if (score_value.equals("15")) {
            scores();
        } else {
        }
        /**
         * output values:
         */
        TextView priceTextView = (TextView) findViewById(R.id.output);
        String S = "Name: " + name_value + "\nid: " + id_value + "\nEmail: " + email_value + "\nTotal Score is: " + score;
        priceTextView.setText(S);
        Toast.makeText(this, "You Score: " + score + " out of 4", Toast.LENGTH_LONG).show();

    }


}
