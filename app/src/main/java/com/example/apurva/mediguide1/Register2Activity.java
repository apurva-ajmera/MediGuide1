package com.example.apurva.mediguide1;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Register2Activity extends AppCompatActivity {

    private TextInputLayout mReg2Name;
    private TextInputLayout mReg2Password;
    private TextInputLayout mReg2AdharNo;
    private Button mRegSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);


        mRegSignUp = (Button)findViewById(R.id.reg2_crt_btn);
        mReg2Name = (TextInputLayout)findViewById(R.id.reg2_display_name);
        mReg2Password = (TextInputLayout)findViewById(R.id.reg2_password);
        mReg2AdharNo = (TextInputLayout)findViewById(R.id.reg2_no);;
    }
}
