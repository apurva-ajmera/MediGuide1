package com.example.apurva.mediguide1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register1Activity extends AppCompatActivity {

    private Button mReg1Btn;
    private TextInputLayout mDisplayName;
    private TextInputLayout memail;
    private TextInputLayout mpassword;

    //firebase
    private FirebaseAuth mAuth;

    //prigress dialog
    private ProgressDialog mRegProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        //toolbar


        //firebase
        mAuth = FirebaseAuth.getInstance();

        //progress dialog
        mRegProgress = new ProgressDialog(this);

        mReg1Btn = (Button)findViewById(R.id.reg1crt_btn);
        mDisplayName = (TextInputLayout)findViewById(R.id.display_name);
        memail = (TextInputLayout)findViewById(R.id.display_email);
        mpassword = (TextInputLayout)findViewById(R.id.display_password);

        mReg1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String RegName = mDisplayName.getEditText().getText().toString();
                String Regemail = memail.getEditText().getText().toString();
                String Regpassword = mpassword.getEditText().getText().toString();

                if (!TextUtils.isEmpty(RegName) || !TextUtils.isEmpty(Regemail) || !TextUtils.isEmpty(Regpassword)){

                    mRegProgress.setTitle("Registering User");
                    mRegProgress.setMessage("Please wait,while we creating your account");
                    mRegProgress.setCanceledOnTouchOutside(false);
                    mRegProgress.show();
                    register_user(RegName,Regemail,Regpassword);
                }

            }
        });
    }

    private void register_user(String RegName, String Regemail, String Regpassword) {

        mAuth.createUserWithEmailAndPassword(Regemail,Regpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()){
                    mRegProgress.dismiss();
                    Intent reg1main = new Intent(Register1Activity.this,MainActivity.class);
                    startActivity(reg1main);
                    finish();
                }
                else{
                    mRegProgress.hide();
                    Toast.makeText(Register1Activity.this,"you have some error",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
