package com.wordpress.sendyhartanto.wiboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Activity_Main extends AppCompatActivity {

    RelativeLayout rellay_dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay_dashboard = (RelativeLayout) findViewById(R.id.rellay_dashboard);

        rellay_dashboard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_MAIN)
            }
        });
    }
}
