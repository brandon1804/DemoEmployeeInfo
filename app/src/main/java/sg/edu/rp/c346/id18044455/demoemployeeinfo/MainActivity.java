package sg.edu.rp.c346.id18044455.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvE;
    ArrayList<Employee> eList;
    //ArrayAdapter<Employee> aaE;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    lvE = findViewById(R.id.lvE);
    Employee e1 = new Employee("John", "Software Technical Leader", 3400.0);
    Employee e2 = new Employee("May", "Programmer", 2200.0);

    eList = new ArrayList<>();
    eList.add(e1);
    eList.add(e2);
    //aaE = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, eList);
    //lvE.setAdapter(aaE);
        adapter = new CustomAdapter(this, R.layout.row, eList);
        lvE.setAdapter(adapter);
    }//end of main method
}//end of class