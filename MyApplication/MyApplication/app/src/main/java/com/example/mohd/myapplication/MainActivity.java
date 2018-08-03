package com.example.mohd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.CallScreeningService;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Main Function on this activity.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Button side to execute orders.
    public void GuSubmit(View view) {
        // get values of parameters in layout
        EditText usr = findViewById(R.id.et_usr);
        EditText pwd = findViewById(R.id.et_pwd);
        // Storing the above values into local parameter.
        String user = usr.getText().toString();
        String pass = pwd.getText().toString();

        // here an example to login to App. but in real case will query via DB.
        if (user.equals("admin") && pass.equals("admin"))
        {
            // Intent is passing date through another screen.
        Intent SecondS = new Intent(this, SecondScreen.class);
        Bundle b = new Bundle();
        b.putString("username", usr.getText().toString()); // with unique name of moved parameter.
        b.putString("password", pwd.getText().toString());
        SecondS.putExtras(b); // fill Intent
        startActivity(SecondS); // executed Call screen.
        }
        else
            // Print a msg.
            Toast.makeText(this, "wrong credentials!", Toast.LENGTH_LONG).show();
        }
}
