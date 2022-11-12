package com.example.face2.ui.Activities_Main;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.face2.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class login extends AppCompatActivity {
 private ActivityLoginBinding log_bind;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log_bind= ActivityLoginBinding.inflate(getLayoutInflater());
        View view = log_bind.getRoot();
        setContentView(view);

        auth = FirebaseAuth.getInstance();
        log_bind.log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                signWithMail("Roaa@mail.com", "123456");

                Intent intent1=new Intent(login.this, Home.class);
                startActivity(intent1);
                 finish();
            }
        });
    }

    private void signWithMail( String mail,String password) {
        auth.signInWithEmailAndPassword(mail,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(login.this, "login is success", Toast.LENGTH_LONG).show();
                            if (log_bind.user.getText().toString().isEmpty())
                             {
                            Toast.makeText(login.this, "enter user name", Toast.LENGTH_LONG).show();
                            return;
                             }
                            if (log_bind.pass.getText().toString().isEmpty())
                            {
                             Toast.makeText(login.this, "enter user password", Toast.LENGTH_LONG).show();
                              return;
                            }
                            if (log_bind.user.getText().toString().equals("Roaa@mail.com") && log_bind.pass.getText().toString().equals("123456"))
                            {
                              Toast.makeText(login.this, "login is success", Toast.LENGTH_LONG).show();
                            }

                        }

                        else
                            Log.i("ccccccccc", "onComplete: "+"sucess");
                    }
                });
    }

}


