package com.example.myadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 list=findViewById(R.id.ll);

        ArrayList<resturant> myArray= new ArrayList<>();
        myArray.add(new resturant(R.drawable.lavash,"LAVASH", "5",
                "https://goo.gl/maps/zThtieX1pSNnd9j77"));
        myArray.add(new resturant(R.drawable.mezoo,"Mezoo", "4.3",
                "https://goo.gl/maps/3F75QR1YtAFWhXbf6"));
        myArray.add(new resturant(R.drawable.roka,"ROKA", "4",
                "https://goo.gl/maps/nB3YeyPXgLrpPHNr6"));
        myArray.add(new resturant(R.drawable.croi,"Croi Bakehouse", "3.5",
                "https://goo.gl/maps/FZmeXxWDnJzS9EAt8"));
        myArray.add(new resturant(R.drawable.di,"Di Lusso", "2.6",
                "https://goo.gl/maps/wtH43TFZCWmyvyYBA"));

        myArray.add(new resturant(R.drawable.okku,"Okku", "4.8",
                "https://goo.gl/maps/Q5LkjuJ5M1SpDWi37"));
        myArray.add(new resturant(R.drawable.bedous,"Bedous lounge", "4.2",
                "https://goo.gl/maps/mQQKcP1xe95F2sm67"));

        myArray.add(new resturant(R.drawable.meraki,"Meraki", "3",
                "https://goo.gl/maps/aym2t2A4qrp2UGFE7"));



        CustomAdapter adapter= new CustomAdapter(this, myArray );
 list.setAdapter(adapter);


    }
}