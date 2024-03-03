package com.example.linechartgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    int data1 = 210;
    GraphView graphView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // on below line we are initializing our graph view.
        graphView = findViewById(R.id.idGraphView);

        // on below line we are adding data to our graph view.
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                // on below line we are adding
                // each point on our x and y axis.
                new DataPoint(0, 100),
                new DataPoint(1, 210),
                new DataPoint(2, 211),
                new DataPoint(4, 2321),
                new DataPoint(5, 1132),
                new DataPoint(6, 432),
                new DataPoint(7, 990),

        });


        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<DataPoint>(new DataPoint[]{
                // on below line we are adding
                // each point on our x and y axis.
                new DataPoint(0, 423),
                new DataPoint(1, 2188),
                new DataPoint(2, 2726),
                new DataPoint(4, 1334),
                new DataPoint(5, 1452),
                new DataPoint(6, 2207),
                new DataPoint(7, 645),

        });
        // after adding data to our line graph series.
        // on below line we are setting
        // title for our graph view.
        graphView.setTitle("My Graph View");

        // on below line we are setting
        // text color to our graph view.
        graphView.setTitleColor(R.color.white);

        // on below line we are setting
        // our title text size.
        graphView.setTitleTextSize(18);
        series.setColor(R.color.red);
        series2.setColor(R.color.blue);

        // on below line we are adding
        // data series to our graph view.
        graphView.addSeries(series);
        graphView.addSeries(series2);

    }
}