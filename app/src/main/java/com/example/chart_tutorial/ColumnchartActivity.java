package com.example.chart_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;
import com.anychart.core.cartesian.series.Column;
import com.anychart.enums.HoverMode;
import com.anychart.enums.Position;
import com.anychart.enums.TooltipPositionMode;
import com.anychart.graphics.vector.Anchor;

import java.util.ArrayList;
import java.util.List;

public class ColumnchartActivity extends AppCompatActivity {
  AnyChartView anyChart;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_columnchart);
        anyChart =  findViewById(R.id.columnchartAnyChart);
        setup();

    }
    private void setup()
    {
        Cartesian cartesian = AnyChart.column();
        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("Sole Drinkable", 80540));
        data.add(new ValueDataEntry("Deep Driftwood ", 94190));
        data.add(new ValueDataEntry("Daiquiri", 102610));
        data.add(new ValueDataEntry("Dry Martini", 110430));
        data.add(new ValueDataEntry("Margarita", 128000));
        data.add(new ValueDataEntry("Espresso Martini", 143760));
        data.add(new ValueDataEntry("Manhattan", 170670));
        data.add(new ValueDataEntry(" Aperol Spritz", 213210));
        data.add(new ValueDataEntry("Mojito", 249980));

        Column column = cartesian.column(data);
        column.tooltip()
                .titleFormat("{%X}")
                .position(Position.CENTER_BOTTOM)
                .anchor(String.valueOf(Anchor.CENTER_BOTTOM))
                .offsetX(0d)
                .offsetY(5d)
                .format("${%Value}{groupsSeparator: }");
        cartesian.animation(true);
        cartesian.title("Top 10 Beverage Products by Revenue");
        cartesian.yScale().minimum(0d);
        cartesian.yAxis(0).labels().format("${%Value}{groupsSeparator: }");
        cartesian.tooltip().positionMode(TooltipPositionMode.POINT);
        cartesian.interactivity().hoverMode(HoverMode.BY_X);
        cartesian.xAxis(0).title("Product");
        cartesian.yAxis(0).title("Revenue");
        anyChart.setChart(cartesian);
    }
}