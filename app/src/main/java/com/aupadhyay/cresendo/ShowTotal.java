package com.aupadhyay.cresendo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowTotal extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    //private float tm1, tm2, tm3, tm4, tm5, tm6, tm7, tm8, tm9, tm10, tm11, tm

    private Float tmArray[] = new Float[14];
    ArrayList<ContestantDetails> arrayList;

    ListView listView;



    public void initViews()
    {
        sharedPreferences = getSharedPreferences("total_marks", Context.MODE_PRIVATE);

        int x = 1;
        for(int i = 0; i < 14; ++i)
        {
            tmArray[i] = sharedPreferences.getFloat("total_"+String.valueOf(x), 0);
            x++;
        }


        ContestantDetails contestantDetails1 = new ContestantDetails("Contestant 1 ", tmArray[0]);
        ContestantDetails contestantDetails2 = new ContestantDetails("Contestant 2 ", tmArray[1]);
        ContestantDetails contestantDetails3 = new ContestantDetails("Contestant 3 ", tmArray[2]);
        ContestantDetails contestantDetails4 = new ContestantDetails("Contestant 4 ", tmArray[3]);
        ContestantDetails contestantDetails5 = new ContestantDetails("Contestant 5 ", tmArray[4]);
        ContestantDetails contestantDetails6 = new ContestantDetails("Contestant 6 ", tmArray[5]);
        ContestantDetails contestantDetails7 = new ContestantDetails("Contestant 7 ", tmArray[6]);
        ContestantDetails contestantDetails8 = new ContestantDetails("Contestant 8 ", tmArray[7]);
        ContestantDetails contestantDetails9 = new ContestantDetails("Contestant 9 ", tmArray[8]);
        ContestantDetails contestantDetails10 = new ContestantDetails("Contestant 10 ", tmArray[9]);
        ContestantDetails contestantDetails11 = new ContestantDetails("Contestant 11 ", tmArray[10]);
        ContestantDetails contestantDetails12 = new ContestantDetails("Contestant 12 ", tmArray[11]);
        ContestantDetails contestantDetails13 = new ContestantDetails("Contestant 13 ", tmArray[12]);
        ContestantDetails contestantDetails14 = new ContestantDetails("Contestant 14 ", tmArray[13]);


        arrayList = new ArrayList<>();

        arrayList.add(contestantDetails1);
        arrayList.add(contestantDetails2);
        arrayList.add(contestantDetails3);
        arrayList.add(contestantDetails4);
        arrayList.add(contestantDetails5);
        arrayList.add(contestantDetails6);
        arrayList.add(contestantDetails7);
        arrayList.add(contestantDetails8);
        arrayList.add(contestantDetails9);
        arrayList.add(contestantDetails10);
        arrayList.add(contestantDetails11);
        arrayList.add(contestantDetails12);
        arrayList.add(contestantDetails13);
        arrayList.add(contestantDetails14);

        listView = (ListView) findViewById(R.id.marksListView);

        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.list_row, arrayList);
        listView.setAdapter(customAdapter);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_total);
        initViews();
    }
}
