package sg.edu.rp.c346.id18044455.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView aLV;
    ArrayList<AndroidVersion> aList;
    //ArrayAdapter<AndroidVersion> aaAndroid;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        aLV = findViewById(R.id.androidLV);
        AndroidVersion a9 = new AndroidVersion("Pie", "9.0");
        AndroidVersion a8 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion a7 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        aList = new ArrayList<>();
        aList.add(a9);
        aList.add(a8);
        aList.add(a7);

        //aaAndroid = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, aList);
        adapter = new CustomAdapter(this, R.layout.row, aList);
        //aLV.setAdapter(aaAndroid);
        aLV.setAdapter(adapter);


    }//end of main method
}//end of class