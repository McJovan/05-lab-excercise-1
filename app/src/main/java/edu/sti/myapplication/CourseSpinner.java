package edu.sti.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class CourseSpinner extends AppCompatActivity {

    private String[] students = {
            "ABM",
            "BSIT",
            "BSCoE",
            "BSMT",
            "MSIT",
            "MSCS"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        getSupportActionBar().setTitle("Spinner Demo");

        ArrayList<String> studentDataSet = new ArrayList<>(Arrays.asList(students));

        Spinner studentsSpinner = findViewById(R.id.Spinner);
        CourseAdapter adapter = new CourseAdapter(this, R.layout.spinner, studentDataSet);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        studentsSpinner.setAdapter(adapter);
    }
}