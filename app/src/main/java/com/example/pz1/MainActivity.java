package com.example.pz1;

import static com.example.pz1.R.drawable.bet;
import android.graphics.Color;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private Button btn;
    private TextView txt;
    private Button btn2;
    private TextView txt2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view();
        txt.setTextColor(MainActivity.ColorDiagram.getColor());
        txt2.setTextColor(MainActivity.ColorDiagram.getColor());
        txt.setText(MainActivity.ColorNames.getColorName());
        txt2.setText(MainActivity.ColorNames.getColorName());


    }





    public static class ColorDiagram {
        // Member variables (properties about the object)
        public static String[] mColors = {
                "#3079ab", // blue
                "#e15258", // red
                "#51b46d", // green
                "#e0ab18", // yellow
                "#ffffff", // white
        };

        // Method (abilities: things the object can do)
        public static int getColor() {
            String color = "";

            // Randomly select a fact
            Random randomGenerator = new Random(); // Construct a new Random number generator
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

            Random randomGenerator = new Random(); // Construct a new Random number generator
            int randomNumber = randomGenerator.nextInt(nColors.length);

            colorName = nColors[randomNumber];
            return colorName;
        }
    }

    public void view(){

        btn = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        txt = (TextView)findViewById(R.id.textView);
        txt2 = (TextView)findViewById(R.id.textView2);
        MainActivity mActivity= new MainActivity();

        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
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
                            txt.setTextColor(MainActivity.ColorDiagram.getColor());
                            txt2.setTextColor(MainActivity.ColorDiagram.getColor());
                            txt.setText(MainActivity.ColorNames.getColorName());
                            txt2.setText(MainActivity.ColorNames.getColorName());
                        }
                    }
            );
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txt.setTextColor(MainActivity.ColorDiagram.getColor());
                        txt2.setTextColor(MainActivity.ColorDiagram.getColor());
                        txt.setText(MainActivity.ColorNames.getColorName());
                        txt2.setText(MainActivity.ColorNames.getColorName());
                    }
                }
        );

    }

}