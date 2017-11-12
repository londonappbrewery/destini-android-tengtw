package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryId = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryId == 1){
                    //Log.d("Destini","T1 story");
                    mStoryId=3;
                    mStoryTextView.setText(getResources().getString(R.string.T3_Story));
                    mButtonTop.setText(getResources().getString(R.string.T3_Ans1));
                    mButtonBottom.setText(getResources().getString(R.string.T3_Ans2));
                } else if (mStoryId == 3){
                    mStoryId=6;
                    mStoryTextView.setText(getResources().getString(R.string.T6_End));
                    mButtonTop.setText("");
                    mButtonBottom.setText("");
                } else if (mStoryId == 2){
                    mStoryId =3;
                    mStoryTextView.setText(getResources().getString(R.string.T3_Story));
                    mButtonTop.setText(getResources().getString(R.string.T3_Ans1));
                    mButtonBottom.setText(getResources().getString(R.string.T3_Ans2));
                }
            }
        });

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryId == 1){
                    mStoryId=2;
                    mStoryTextView.setText(getResources().getString(R.string.T2_Story));
                    mButtonTop.setText(getResources().getString(R.string.T2_Ans1));
                    mButtonBottom.setText(getResources().getString(R.string.T2_Ans2));
                } else if (mStoryId == 3){
                    mStoryTextView.setText(getResources().getString(R.string.T5_End));
                    mButtonTop.setText("");
                    mButtonBottom.setText("");
                } else if (mStoryId == 2){
                    mStoryId=4;
                    mStoryTextView.setText(getResources().getString(R.string.T4_End));
                    mButtonTop.setText("");
                    mButtonBottom.setText("");
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
