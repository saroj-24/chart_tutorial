package com.example.chart_tutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private  CardView pie_cv,line_cv,radar_cv,column_cv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pie_cv =  findViewById(R.id.piechartview);
        line_cv = findViewById(R.id.linechartcardview);
        radar_cv = findViewById(R.id.radarchartview);
        column_cv = findViewById(R.id.columnchartview);

        pie_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PieChart.class));

            }
        });
        line_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LineChartActivity.class));
            }
        });
        column_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ColumnchartActivity.class));
            }
        });
        radar_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RadarActivity.class));
            }
        });

    }
}