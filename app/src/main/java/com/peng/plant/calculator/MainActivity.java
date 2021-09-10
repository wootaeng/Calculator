package com.peng.plant.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnNum1;
    private Button btnNum2;
    private Button btnNum3;
    private Button btnNum4;
    private Button btnNum5;
    private Button btnNum6;
    private Button btnNum7;
    private Button btnNum8;
    private Button btnNum9;
    private Button btnNum0;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMulti;
    private Button btnDiv;
    private Button btnReset;
    private Button btnResult;
    private Button btnDel;
    private Button btnComma;

    private String number;
    boolean plus = false;
    boolean minus = false;
    boolean multi = false;
    boolean div = false;
    EditText Caltext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }



    //계산 리스너
    private View.OnClickListener calcul = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnResult:
                    if (plus == true){
                        Caltext.setText("" + (Double.parseDouble(number) + Double.parseDouble(Caltext.getText().toString())));
                    }else if (minus == true){
                        Caltext.setText("" + (Double.parseDouble(number) - Double.parseDouble(Caltext.getText().toString())));
                    }else if (multi == true){
                        Caltext.setText("" + (Double.parseDouble(number) * Double.parseDouble(Caltext.getText().toString())));
                    }else if (div == true){
                        Caltext.setText("" +(Double.parseDouble(number) / Double.parseDouble(Caltext.getText().toString())) );
                    }
                    break;

                case R.id.btnPlus:
                    plus = true;
                    number = Caltext.getText().toString();
                    Caltext.setText("");
                    break;
                case R.id.btnMinus:
                    minus = true;
                    number = Caltext.getText().toString();
                    Caltext.setText("");
                    break;
                case R.id.btnMulti:
                    multi = true;
                    number = Caltext.getText().toString();
                    Caltext.setText("");
                    break;
                case R.id.btnDiv:
                    div = true;
                    number = Caltext.getText().toString();
                    Caltext.setText("");
                case R.id.btnDel:
                    int length = Caltext.getText().length();
                    if (length > 0 ){
                        Caltext.getText().delete(length-1, length);
                    }
                    break;
            }
        }
    };



    //숫자입력 리스너
    private View.OnClickListener numberEdit = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnNum0:
                    Caltext.setText(Caltext.getText().toString()+"0");
                    break;
                case R.id.btnNum1:
                    Caltext.setText(Caltext.getText().toString()+"1");
                    break;
                case R.id.btnNum2:
                    Caltext.setText(Caltext.getText().toString()+"2");
                    break;
                case R.id.btnNum3:
                    Caltext.setText(Caltext.getText().toString()+"3");
                    break;
                case R.id.btnNum4:
                    Caltext.setText(Caltext.getText().toString()+"4");
                    break;
                case R.id.btnNum5:
                    Caltext.setText(Caltext.getText().toString()+"5");
                    break;
                case R.id.btnNum6:
                    Caltext.setText(Caltext.getText().toString()+"6");
                    break;
                case R.id.btnNum7:
                    Caltext.setText(Caltext.getText().toString()+"7");
                    break;
                case R.id.btnNum8:
                    Caltext.setText(Caltext.getText().toString()+"8");
                    break;
                case R.id.btnNum9:
                    Caltext.setText(Caltext.getText().toString()+"9");
                    break;
                case R.id.btnComma:
                    Caltext.setText(Caltext.getText().toString() + ".");
                    break;

            }
        }
    };

    private void init(){
        Caltext = (EditText)findViewById(R.id.calText);
        //넘버패드
        btnNum0 = (Button)findViewById(R.id.btnNum0);
        btnNum1 = (Button) findViewById(R.id.btnNum1);
        btnNum2 = (Button)findViewById(R.id.btnNum2);
        btnNum3 = (Button)findViewById(R.id.btnNum3);
        btnNum4 = (Button)findViewById(R.id.btnNum4);
        btnNum5 = (Button)findViewById(R.id.btnNum5);
        btnNum6 = (Button)findViewById(R.id.btnNum6);
        btnNum7 = (Button)findViewById(R.id.btnNum7);
        btnNum8 = (Button)findViewById(R.id.btnNum8);
        btnNum9 = (Button)findViewById(R.id.btnNum9);
        //부등호
        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnMulti = (Button)findViewById(R.id.btnMulti);
        //기능
        btnReset = (Button)findViewById(R.id.btnReset);
        btnResult = (Button)findViewById(R.id.btnResult);
        btnDel = (Button)findViewById(R.id.btnDel);
        btnComma = (Button)findViewById(R.id.btnComma);

        btnNum0.setOnClickListener(numberEdit);
        btnNum1.setOnClickListener(numberEdit);
        btnNum2.setOnClickListener(numberEdit);
        btnNum3.setOnClickListener(numberEdit);
        btnNum4.setOnClickListener(numberEdit);
        btnNum5.setOnClickListener(numberEdit);
        btnNum6.setOnClickListener(numberEdit);
        btnNum7.setOnClickListener(numberEdit);
        btnNum8.setOnClickListener(numberEdit);
        btnNum9.setOnClickListener(numberEdit);
        btnComma.setOnClickListener(numberEdit);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Caltext.setText("");
            }
        });

        btnResult.setOnClickListener(calcul);
        btnPlus.setOnClickListener(calcul);
        btnMinus.setOnClickListener(calcul);
        btnMulti.setOnClickListener(calcul);
        btnDiv.setOnClickListener(calcul);
        btnDel.setOnClickListener(calcul);


    }
}