package com.example.pz1;

import android.graphics.Color;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private Button btn;
    private TextView txt;
    private Button btn2;
    private TextView txt2;
    private Button btn3;
    private TextView Att;
    private TextView Corr;
    private TextView Wrong;
    private TextView timer;
    private TextView rules;
    int counter = 0;
    //int correct = 0;
    //int wrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view();
        Att.setText("Попыток: "+String.valueOf(counter));
        Corr.setText("Верно: "+String.valueOf(Check.correct));
        Wrong.setText("Неверно: "+String.valueOf(Check.wrong));







    }



    public static class ColorDiagram {

        public static String[] mColors = {
                "#3079ab", // blue
                "#e15258", // red
                "#51b46d", // green
                "#e0ab18", // yellow
                "#ffffff", // white
        };

        public static int getColor() {
            String color = "";

            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(mColors.length);

            color = mColors[randomNumber];
            int colorAsInt = Color.parseColor(color);

            return colorAsInt;
        }
    }

    public static class ColorNames {

        public static String[] nColors = {
                "Синий", // blue
                "Красный", // red
                "Зеленый", // green
                "Желтый", // yellow
                "Белый", // white
        };

        public static String getColorName() {
            String colorName = "";

            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(nColors.length);

            colorName = nColors[randomNumber];
            return colorName;
        }
    }
public static class Check {
    public static int color1 = MainActivity.ColorDiagram.getColor();
    public static int color2 = MainActivity.ColorDiagram.getColor();
    public static String colorN1 = MainActivity.ColorNames.getColorName();
    public static String colorN2 = MainActivity.ColorNames.getColorName();
    private static int correct = 0;
    private static int wrong = 0;

    public static int proverka() {
        if ((Check.color2 == -13600341 && Check.colorN1 == "Синий") ||
                (Check.color2 == (-2010536) && Check.colorN1 == "Красный") ||
                (Check.color2 == (-11422611) && Check.colorN1 == "Зеленый") ||
                (Check.color2 == (-2053352) && Check.colorN1 == "Желтый") ||
                (Check.color2 == (-1) && Check.colorN1 == "Белый")) {
            correct++;
        } else {
            wrong++;
        }


        return 0;
    }
    public static int proverka1() {
        if ((Check.color2 == -13600341 && Check.colorN1 == "Синий") ||
                (Check.color2 == (-2010536) && Check.colorN1 == "Красный") ||
                (Check.color2 == (-11422611) && Check.colorN1 == "Зеленый") ||
                (Check.color2 == (-2053352) && Check.colorN1 == "Желтый") ||
                (Check.color2 == (-1) && Check.colorN1 == "Белый")) {
            wrong++;
        } else {
            correct++;
        }
    return 0;
    }
}

    public void view(){

        btn = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        txt = (TextView)findViewById(R.id.textView);
        txt2 = (TextView)findViewById(R.id.textView2);
        Att = (TextView)findViewById(R.id.Att);
        Corr = (TextView)findViewById(R.id.Corr);
        Wrong = (TextView)findViewById(R.id.Wrong);
        timer = (TextView)findViewById(R.id.timer);
        rules = (TextView)findViewById(R.id.rules);


        MainActivity mActivity= new MainActivity();



        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        new CountDownTimer(100000, 1000) {


                            public void onTick(long millisUntilFinished) {
                                timer.setText("Осталось: " + millisUntilFinished / 1000+" сек.");
                            }

                            public void onFinish() {
                                txt.setVisibility(View.GONE);
                                txt2.setVisibility(View.GONE);
                                btn.setVisibility(View.GONE);
                                btn2.setVisibility(View.GONE);
                            }

                        }.start();
                        Check.colorN1=MainActivity.ColorNames.getColorName();
                        Check.colorN2 = MainActivity.ColorNames.getColorName();
                        Check.color1 = MainActivity.ColorDiagram.getColor();
                        Check.color2 = MainActivity.ColorDiagram.getColor();
                        txt.setTextColor(Check.color1);
                        txt2.setTextColor(Check.color2);
                        txt.setText(Check.colorN1);
                        txt2.setText(Check.colorN2);
                        btn.setVisibility(View.VISIBLE);
                        btn2.setVisibility(View.VISIBLE);
                        txt.setVisibility(View.VISIBLE);
                        txt2.setVisibility(View.VISIBLE);

                        btn3.setVisibility(View.GONE);
                    }
                }
        );


        btn.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Check.proverka();
                            Check.colorN1=MainActivity.ColorNames.getColorName();
                            Check.colorN2 = MainActivity.ColorNames.getColorName();
                            Check.color1 = MainActivity.ColorDiagram.getColor();
                            Check.color2 = MainActivity.ColorDiagram.getColor();

                            txt.setTextColor(Check.color1);
                            txt2.setTextColor(Check.color2);
                            txt.setText(Check.colorN1);
                            txt2.setText(Check.colorN2);
                            counter++;
                            Att.setText("Попыток: "+String.valueOf(counter));

                            Corr.setText("Верно: "+String.valueOf(Check.correct));
                            Wrong.setText("Неверно: "+String.valueOf(Check.wrong));

                        }
                    }
            );
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Check.proverka1();
                        Check.colorN1=MainActivity.ColorNames.getColorName();
                        Check.colorN2 = MainActivity.ColorNames.getColorName();
                        Check.color1 = MainActivity.ColorDiagram.getColor();
                        Check.color2 = MainActivity.ColorDiagram.getColor();
                        txt.setTextColor(Check.color1);
                        txt2.setTextColor(Check.color2);
                        txt.setText(Check.colorN1);
                        txt2.setText(Check.colorN2);
                        counter++;
                        Att.setText("Попыток: "+String.valueOf(counter));
                        Corr.setText("Верно: "+String.valueOf(Check.correct));
                        Wrong.setText("Неверно: "+String.valueOf(Check.wrong));
                    }
                }
        );

    }

}