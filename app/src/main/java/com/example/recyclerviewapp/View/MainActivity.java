package com.example.recyclerviewapp.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewapp.Model.Student;
import com.example.recyclerviewapp.R;
import com.example.recyclerviewapp.View.Adapter.StudentAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvStudents);
        StudentAdapter adapter = new StudentAdapter(getPerson());
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        manager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
    }

    public ArrayList getPerson() {
        ArrayList persons = new ArrayList<Student>();
        persons.add(new Student("Aaryan", 25,R.drawable.image));
        persons.add(new Student("Raz", 24,R.drawable.image));
        persons.add(new Student("Ram", 22,R.drawable.image));
        persons.add(new Student("Aaryan", 27,R.drawable.image));
        persons.add(new Student("Raz", 23,R.drawable.image));


        return persons;
    }
}