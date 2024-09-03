package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3,btn4, btn5, btn6, btn7 , btn8 ,btn9, btnRestart;
    TextView textView;
    String b1, b2, b3, b4, b5, b6, b7 ,b8,b9;
    int flag =0;
    int count =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }
    private void init(){

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        textView =findViewById(R.id.textView);


        btnRestart = findViewById(R.id.btnRestart);
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
                textView.setText("Let's Playf\nAnother Match");
            }

        });



    }

    public void Check(View view) {
        Button btn= (Button) view;
        if(btn.getText().toString().equals("")) {

            count++;

            if (flag == 0) {
                btn.setText("X");
                flag = 1;

            } else {
                btn.setText("O");
                flag = 0;
            }


            if (count > 4) {

                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();


                //Conditions
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    //Row1
                    btn1.setBackgroundColor(getResources().getColor(R.color.list));
                    btn2.setBackgroundColor(getResources().getColor(R.color.list));
                    btn3.setBackgroundColor(getResources().getColor(R.color.list));

                    announceWinner(b1);


                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    //Row2
                    btn4.setBackgroundColor(getResources().getColor(R.color.list));
                    btn5.setBackgroundColor(getResources().getColor(R.color.list));
                    btn6.setBackgroundColor(getResources().getColor(R.color.list));

                    announceWinner(b4);



                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    //Row3

                    btn7.setBackgroundColor(getResources().getColor(R.color.list));
                    btn8.setBackgroundColor(getResources().getColor(R.color.list));
                    btn9.setBackgroundColor(getResources().getColor(R.color.list));

                    announceWinner(b7);



                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    //RowDiagonal1
                    btn1.setBackgroundColor(getResources().getColor(R.color.list));
                    btn5.setBackgroundColor(getResources().getColor(R.color.list));
                    btn9.setBackgroundColor(getResources().getColor(R.color.list));

                    announceWinner(b5);




                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    //RowDiagonal2
                    btn3.setBackgroundColor(getResources().getColor(R.color.list));
                    btn5.setBackgroundColor(getResources().getColor(R.color.list));
                    btn7.setBackgroundColor(getResources().getColor(R.color.list));

                    announceWinner(b3);


                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    //Row1
                    btn1.setBackgroundColor(getResources().getColor(R.color.list));
                    btn4.setBackgroundColor(getResources().getColor(R.color.list));
                    btn7.setBackgroundColor(getResources().getColor(R.color.list));

                    announceWinner(b1);


                } else if (b2.equals(b5) && b2.equals(b8) && !b2.equals("")) {
                    //Row1
                    btn2.setBackgroundColor(getResources().getColor(R.color.list));
                    btn5.setBackgroundColor(getResources().getColor(R.color.list));
                    btn8.setBackgroundColor(getResources().getColor(R.color.list));

                    announceWinner(b2);


                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    //Row1
                    btn3.setBackgroundColor(getResources().getColor(R.color.list));
                    btn6.setBackgroundColor(getResources().getColor(R.color.list));
                    btn9.setBackgroundColor(getResources().getColor(R.color.list));

                    announceWinner(b3);

                }
                else if (count == 9){
                    if (!b1.equals("") && !b2.equals("") && !b3.equals("") &&
                            !b4.equals("") && !b5.equals("") && !b6.equals("") &&
                            !b7.equals("") && !b8.equals("") && !b9.equals("")){
                        Toast.makeText(this, "It's A Draw" , Toast.LENGTH_SHORT).show();
                        newGame();

                    }

                }
            }


        }

}
    private void newGame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        count =0;
        flag =0;

        btn1.setBackgroundColor(getResources().getColor(R.color.reset));
        btn2.setBackgroundColor(getResources().getColor(R.color.reset));
        btn3.setBackgroundColor(getResources().getColor(R.color.reset));
        btn4.setBackgroundColor(getResources().getColor(R.color.reset));
        btn5.setBackgroundColor(getResources().getColor(R.color.reset));
        btn6.setBackgroundColor(getResources().getColor(R.color.reset));
        btn7.setBackgroundColor(getResources().getColor(R.color.reset));
        btn8.setBackgroundColor(getResources().getColor(R.color.reset));
        btn9.setBackgroundColor(getResources().getColor(R.color.reset));

    }

    private void announceWinner(String winner){
        Toast.makeText(this, "Winner is: " + winner, Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                newGame();
            }
        },2000);

        textView.setText("Winner is: "+winner);

    }


}