package com.example.apurva.mediguide1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegTypeActivity extends AppCompatActivity {

    private Button mReadBtn;
    private Button mWriteBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_type);

        mReadBtn = (Button)findViewById(R.id.read_btn);
        mWriteBtn = (Button) findViewById(R.id.write_btn);

        mReadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg1Intent = new Intent(RegTypeActivity.this,Register1Activity.class);
                startActivity(reg1Intent);
                finish();
            }
        });

        mWriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg2Intent = new Intent(RegTypeActivity.this,Register2Activity.class);
                startActivity(reg2Intent);
                finish();
            }
        });
    }
}
