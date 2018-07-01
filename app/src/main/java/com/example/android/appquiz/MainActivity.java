package com.example.android.appquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**
     * this displays the correct answers for each question and get stored
     */
    String questionOneUserAnswer, questionTwoUserAnswer, questionThreeUserAnswer, questionFourUserAnswer, questionFiveUserAnswer, questionSixUserAnswer;
    String answerOne = "2";
    String answerTwo = "5";
    String answerThree = "5";
    String answerFour = "14";
    String answerFive = "1";
    String answerSix = "1";

    EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.name_field);


    }

    /**
     * this method checks whether the answer is correct or wrong
     * and returns with wrong or correct on the screen when submit button is clicked
     */
    void checkAnswers() {
        String name = userName.getText().toString();
        String answerResponse;
        if (answerOne.equals(questionOneUserAnswer)) {
            answerResponse = "Math Quiz\n" + name + "\n" + "Question one correct\n";
        } else {
            answerResponse = "Math Quiz\n" + name + "\n" + "Question one wrong\n";
        }
        if (answerTwo.equals(questionTwoUserAnswer)) {
            answerResponse += "Question two correct \n";
        } else {
            answerResponse += "Question two wrong \n";
        }
        if (answerThree.equals(questionThreeUserAnswer)) {
            answerResponse += "Question three correct \n";
        } else {
            answerResponse += "Question three wrong \n";
        }
        if (answerFour.equals(questionFourUserAnswer)) {
            answerResponse += "Question four correct \n";
        } else {
            answerResponse += "Question four wrong \n";
        }
        if (answerFive.equals(questionFiveUserAnswer)) {
            answerResponse += "Question five correct \n";
        } else {
            answerResponse += "Question five wrong \n";
        }
        if (answerSix.equals(questionSixUserAnswer)) {
            answerResponse += "Question six correct \n";
        } else {
            answerResponse += "Question six wrong \n";
        }
        new AlertDialog.Builder(this)
                .setTitle("Quiz Response")
                .setMessage(answerResponse)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finish();
                        startActivity(new Intent(MainActivity.this, MainActivity.class));
                    }
                }).show();

    }


    public void AnswerForQuestionOne(View view) {
        if (view.getId() == R.id.yes1_radio_button) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionOneUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.no1_radio_button) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionOneUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.yes2_radio_button) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionOneUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.no2_radio_button) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionOneUserAnswer = ((RadioButton) view).getText().toString();
        }

    }


    public void AnswerForQuestionTwo(View view) {
        if (view.getId() == R.id.question_two_a) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionTwoUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_two_b) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionTwoUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_two_c) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionTwoUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_two_d) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionTwoUserAnswer = ((RadioButton) view).getText().toString();
        }

    }

    public void AnswerForQuestionThree(View view) {
        if (view.getId() == R.id.question_three_a) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionThreeUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_three_b) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionThreeUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_three_c) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionThreeUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_three_d) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionThreeUserAnswer = ((RadioButton) view).getText().toString();
        }

    }


    public void AnswerForQuestionFour(View view) {
        if (view.getId() == R.id.question_four_a) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionFourUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_four_b) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionFourUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_four_c) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionFourUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_four_d) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionFourUserAnswer = ((RadioButton) view).getText().toString();
        }

    }


    public void AnswerForQuestionFive(View view) {
        if (view.getId() == R.id.question_five_a) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionFiveUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_five_b) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionFiveUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_five_c) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionFiveUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_five_d) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionFiveUserAnswer = ((RadioButton) view).getText().toString();
        }
    }


    public void AnswerForQuestionSix(View view) {
        if (view.getId() == R.id.question_six_a) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionSixUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_six_b) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionSixUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_six_c) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionSixUserAnswer = ((RadioButton) view).getText().toString();
        }
        if (view.getId() == R.id.question_six_d) {
            Toast.makeText(this, ((RadioButton) view).getText().toString(), Toast.LENGTH_SHORT).show();
            questionSixUserAnswer = ((RadioButton) view).getText().toString();
        }

    }

    public void Submit(View view) {
        checkAnswers();
    }
}