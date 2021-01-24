package com.example.nbu_dimitar_yakov_;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nbu_dimitar_yakov_.R;

public class CopyrightActivity extends MainActivity {

    protected Button mButtonQuit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copyright);
        mButtonQuit = (Button)findViewById(R.id.quit);


        //Start of Button Listener for Button4
        mButtonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        //End of Button Listener for Button4
    }
}
