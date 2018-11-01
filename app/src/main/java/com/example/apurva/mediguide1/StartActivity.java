package com.example.apurva.mediguide1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button mCreateBtn;
    private Button mHaveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mCreateBtn = (Button)findViewById(R.id.create_btn);
        mHaveBtn = (Button)findViewById(R.id.log_btn);

        mHaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logIntent = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(logIntent);
                finish();
            }
        });

        mCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regtypeIntent = new Intent(StartActivity.this,RegTypeActivity.class);
                startActivity(regtypeIntent);
                finish();
            }
        });
    }
}
