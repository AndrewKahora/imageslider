package com.example.andrew.imageslider;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wenchao.cardstack.CardStack;

public class MainActivity extends AppCompatActivity {
    cardsDataAdapter mCardAdapter;
    CardStack mCardStack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCardStack = (CardStack) findViewById(R.id.container);
//        mCardStack.setContentResource(R.drawable.chain3);

        mCardStack.setContentResource(R.layout.card_layout);

        mCardStack.setStackMargin(20);
        mockdata();

    }

    public void mockdata(){
        mCardAdapter = new cardsDataAdapter(getApplicationContext(),0);

        mCardAdapter.addAll("Cape", "Watch", "Chain","Cape", "Watch", "Chain","Cape", "Watch",
                "Chain","Cape", "Watch", "Chain","Cape", "Watch", "Chain","Cape", "Watch", "Chain",
                "Cape", "Watch", "Chain","Cape", "Watch", "Chain","final", "Watch", "Chain","final"
                , "Watch", "Chain","final", "Watch", "Chain","final", "Watch", "Chain","final");


//        mCardAdapter.add("test1");
//        mCardAdapter.add("test2");
//        mCardAdapter.add("test3");
//        mCardAdapter.add("test4");
//        mCardAdapter.add("test5");

        mCardStack.setAdapter(mCardAdapter);


    }

}


