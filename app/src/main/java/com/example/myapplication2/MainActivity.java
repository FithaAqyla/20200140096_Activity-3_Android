package com.example.myapplication2;

//import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.button);

        edemail=findViewById(R.id.editTextTextPersonName);

        edpassword=findViewById(R.id.editTextTextPersonName2);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                String email = "aqyla@gmail.com";
                String pwd = "3131";

                if (nama.isEmpty() || password.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password wajib diisi", Toast.LENGTH_LONG);
                    t.show();
                }
                else {

                if(nama.equals(email) && password.equals(pwd)){
                    Toast t = Toast.makeText(getApplicationContext(),"Login Sukses",
                    Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();

                    b.putString("a", nama.trim());

                    b.putString("b", password.trim());

                    Intent intent=new Intent(getApplicationContext(), MainActivity2.class);

                    intent.putExtras(b);
                    startActivity(intent);
                    finish();
                } else{
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login gagal", Toast.LENGTH_LONG);

                    t.show();
                }
//                if (nama.equals("admin@gmail.com")&&password.equals("122")){
//                    Toast.makeText(getApplicationContext(),"Password Salah",
//                            Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
//                    MainActivity.this.startActivity(intent);
//                    finish();
//                }
//                if (nama.equals("adminn@gmail.com")&&password.equals("123")){
//                    Toast.makeText(getApplicationContext(),"Email Salah",
//                            Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
//                    MainActivity.this.startActivity(intent);
//                    finish();
//                }
//                else {
//                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                    builder.setMessage("Email dan Password salah!").create().show();
//                }
////                Toast t = Toast.makeText(getApplicationContext(),"email anda : " + nama + "dan Password anda: " +password+ "", Toast.LENGTH_LONG);
////                t.show();
                }
            }
        });
    }
}