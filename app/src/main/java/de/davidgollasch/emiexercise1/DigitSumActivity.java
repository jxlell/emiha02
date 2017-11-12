package de.davidgollasch.emiexercise1;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static de.davidgollasch.emiexercise1.R.id.buttonDigit;
import static de.davidgollasch.emiexercise1.R.id.digitInput;
import static de.davidgollasch.emiexercise1.R.id.resultOutput;

public class DigitSumActivity extends AppCompatActivity {

    private TextView tvOutput;
    private EditText etNumber;
    private Button btnFire;

    /**
     * this function gets a number and calculates its digit sum
     * @param n Number to get digit sum from
     * @return sum; digit sum of n
     */
    private int getDigitSum(int n){
        int length = String.valueOf(n).length();
        int sum = 0;
        for(int i = 0; i<length; i++){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_sum);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.tuAkzentfarbe1BlauHell)));

        // Initialises the views and event listeners
        InitializeActivity();
    }

    /**
     * Construct the Interactive Structure
     */
    private void InitializeActivity() {

        /*
         *
         *  TODO: IMPLEMENT THIS
         *  NUMBER 2: LINK VIEWS
         *
         *
         */

        etNumber = (EditText) findViewById(digitInput);
        tvOutput = (TextView) findViewById(resultOutput);
        btnFire = (Button) findViewById(buttonDigit);

        btnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear text view
                tvOutput.setText("");

                // Invoke calculation
                CalculateDigitSum();
            }
        });

    }

    /**
     * Trigger the Digit Sum Calculation
     */
    private void CalculateDigitSum() {
        /*
         *
         *  TODO: IMPLEMENT THIS
         *  NUMBER 3: CALCULATE AND PRINT DIGIT SUM
         *
         *
         */

        /*
         * a) Get entered number
         */
        int entered = Integer.parseInt(etNumber.getText().toString());


        /*
         * b) Calculate digit sum
         *    (Hint: This can be done recursively using an additional function/method
         *    private int getDigitSum(int n))
         */
        int sum = getDigitSum(entered);


        /*
         * c) Print result
         */
        String output = "";
        output = "" + sum;
        tvOutput.setText(output);

        }

}
