/**
 * This app tests the user's knowledge about the logical conjunction table.
 *
 * @author  Issa Abanur
 * @version 1.0
 * @since 19-03-2019
 */

package com.example.logica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // Declare input fields and the submit button
    private EditText mEditText1;
    private EditText mEditText2;
    private EditText mEditText3;
    private EditText mEditText4;
    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link the variables to the views
        mEditText1 = findViewById(R.id.editText1);
        mEditText2 = findViewById(R.id.editText2);
        mEditText3 = findViewById(R.id.editText3);
        mEditText4 = findViewById(R.id.editText4);
        mSubmit = findViewById(R.id.submit);

        //Makes the submit button check the input.
        mSubmit.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick (View view){
               checkInput();
           }
        });


    }

    private void checkInput(){
        //Receive the text that has been put into the EditText field & assign it to a variable.
        String text1 =  mEditText1.getText().toString();
        String text2 =  mEditText2.getText().toString();
        String text3 =  mEditText3.getText().toString();
        String text4 =  mEditText4.getText().toString();

        //Check if the input fields match the truth table characters. Made compatible for both upper
        //and lower case.
        if (text1.equalsIgnoreCase("T") && text2.equalsIgnoreCase("F") &&
        text3.equalsIgnoreCase("F") && text4.equalsIgnoreCase("F")){

            //Display a toast message "Correct"
            answerCorrect();
        }
        //Display a toast message "Incorrect"
        else answerInCorrect();

    }

    private void answerCorrect(){
        Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
    }

    private void answerInCorrect(){
        Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
    }
}
