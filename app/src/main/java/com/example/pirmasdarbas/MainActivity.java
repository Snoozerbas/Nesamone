package com.example.pirmasdarbas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {


    private MainActivity tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView tvMain = null;
        Button button = null;

    }

    public void onBtnChangeTextClick(View view) {
        this.tvMain.setText("LQWFQWRFNGVH");
    }
}
