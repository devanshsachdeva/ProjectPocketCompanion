package com.error404.ppc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Info;
    private int counter =3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText)findViewById(R.id.etname);
        Password = (EditText)findViewById(R.id.etpassword);
        Login = (Button) findViewById(R.id.btnlogin);
        Info = (TextView)findViewById(R.id.tvinfo);

        Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
//           String password = helper.searchPass(Name.getText().toString());
                validate(Name.getText().toString(), Password.getText().toString());

                Name.setText("");
                Password.setText("");
            }
        });

    }

    private void validate (String userName, String userPassword)
    {
        if(userName.equals("User01") && (userPassword.equals("Us01")))
        {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);

        }
        else if (userName.equals("User02") && (userPassword.equals("Us02")))
        {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }
        else if (userName.equals("user03") && (userPassword.equals("Us03")))
        {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }
        else if (userName.equals("User04") && (userPassword.equals("Us04")))
        {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }
        else if (userName.equals("user05") && (userPassword.equals("Us05")))
        {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }
        else if (userName.equals("User06") && (userPassword.equals("Us06")))
        {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }
        else if (userName.equals("User07") && (userPassword.equals("Us07")))
        {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }
        else if (userName.equals("Admin") && (userPassword.equals("1234")))
        {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }

        else
        {
            Context context = getApplicationContext();
            CharSequence text = "Login Failed";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            counter--;
            Info.setText(("No. of Attempts Remainng : " + String.valueOf(counter)));
            if (counter == 0)
            {
                Login.setEnabled(false);
            }

        }
    }

}
