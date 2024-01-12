package com.example.chart_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;
import com.anychart.enums.Align;
import com.anychart.enums.LegendLayout;

import java.util.ArrayList;
import java.util.List;

public class  PieChart extends AppCompatActivity {

    AnyChartView anyChartView;
    String[] months = {"January","February","march","april","may"};
    int[] salary = {25000,23000,30000,40000,50000};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        anyChartView =  findViewById(R.id.piechartAnyChart);
        setupChart();

    }

    private void setupChart() {
        Pie pie = AnyChart.pie();
        List<DataEntry> dataEntries = new ArrayList<>();
        for(int i= 0;i<months.length;i++)
        {
            dataEntries.add(new ValueDataEntry(months[i],salary[i]));
        }
        pie.data(dataEntries);
        pie.title("Fruits imported in 2015 (in kg)");
        pie.labels().position("outside");
        pie.legend().title().enabled(true);
        pie.legend().title()
                .text("Retail channels")
                .padding(0d, 0d, 10d, 0d);

        pie.legend()
                .position("center-bottom")
                .itemsLayout(LegendLayout.HORIZONTAL)
                .align(Align.CENTER);

        anyChartView.setChart(pie);
    }
}