package com.example.pirmasdarbas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private MainActivity tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView tvMain ;
        Button button1, button2; ;

    }

    public void onBtnChangeTextClick(View view) {
        this.tvMain.setText("LQWFQWRFNGVH");
    }
    public void onBtnChangeColorClick(View view) {
        this.tvMain.setTextColor(Color.RED);
    }// kodel man pabraukta??????? pats IDE pasiule ta irasyti, nesuprantu, man net programos emuliatoriuje neatidaro abiejuose virtual irenginiuose.
    //nesuprantu, meginau daryti ,kaip is kitu saltiniu daro, nors lygiai ta pati darau, neveikia.
}
