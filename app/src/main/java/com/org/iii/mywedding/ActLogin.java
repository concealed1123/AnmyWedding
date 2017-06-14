package com.org.iii.mywedding;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActLogin extends AppCompatActivity {

        private View.OnClickListener btnFbSignIn_click =new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        };

        private View.OnClickListener btnSignIn_click =new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                String uid = txtAccount.getText().toString();
                String pw = txtPassword.getText().toString();
                if (uid.equals("marco") && pw.equals("123")){ //登入成功
                    SharedPreferences setting =
                            getSharedPreferences("atm", MODE_PRIVATE);
                    setting.edit()
                            .putString("PREF_USERID", uid)
                            .commit();
                    getIntent().putExtra("LOGIN_USERID", uid);
                    getIntent().putExtra("LOGIN_PASSWD", pw);
                    setResult(RESULT_OK, getIntent());
                    finish();

                   Toast.makeText(ActLogin.this,"登入成功!", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(com.org.iii.mywedding.ActLogin.this,ActNavi.class));
                }else{  //登入失敗
                    new AlertDialog.Builder(ActLogin.this)
                            .setTitle("登入失敗")
                            .setMessage("帳號或密碼錯誤")
                            .setPositiveButton("OK", null)
                            .show();
                }

            }
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actlogin);
        InitialComplement();



    }

        private void InitialComplement() {
            txtAccount=(EditText)findViewById(R.id.txtAccount);
            txtPassword=(EditText)findViewById(R.id.txtPassword);

            btnSignIn=(Button)findViewById(R.id.btnSignIn);
            btnSignIn.setOnClickListener(btnSignIn_click);
            btnFbSignIn=(Button)findViewById(R.id.btnFbSignIn);
            btnFbSignIn.setOnClickListener(btnFbSignIn_click);

        }

        Button btnSignIn ;
        Button btnFbSignIn ;
        EditText txtPassword;
        EditText txtAccount;

}




