package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDo> alToDo;
    ArrayAdapter<ToDo> aaToDo;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listView);
        alToDo = new ArrayList<>();

        alToDo.add(new ToDo("MSA", "01/7/2019"));
        alToDo.add(new ToDo("Go For Haircut", "22/9/2019"));

        adapter = new CustomAdapter(this, R.layout.todo, alToDo);
        lvToDo.setAdapter(adapter);

    }
}
