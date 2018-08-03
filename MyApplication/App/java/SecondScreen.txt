package com.example.mohd.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondScreen extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        btn = (Button) findViewById(R.id.btnSubmit);
        TextView texx = findViewById(R.id.textView3);
        Bundle b = getIntent().getExtras();
        String username = b.getString("username");
        texx.setText("Welcome : " + username);

        TextView areano1 = (TextView)findViewById(R.id.txtv_areano);
        TextView GateSt1 = (TextView)findViewById(R.id.txtv_GateSt);
        TextView QuickC1 = (TextView)findViewById(R.id.txtv_QuickC);
        TextView chat1 = (TextView)findViewById(R.id.txtv_chat);
        TextView sysSt1 = (TextView)findViewById(R.id.txtv_sysSt);

        areano1.setText(":01");             // Signal fetch from outside receiver/Trigger.
        areano1.setTextColor(Color.GREEN);
        GateSt1.setText(":Closed");         // Signal fetch from outside receiver/Trigger..
        GateSt1.setTextColor(Color.GREEN);
        QuickC1.setText(":Site Operator!"); // Signal fetch from outside receiver/Trigger..
        chat1.setText(":Site Operator");    // Signal fetch from outside receiver/Trigger..
        sysSt1.setText(":OK!");
        sysSt1.setTextColor(Color.GREEN);
    }

    public void GuSignalCon(View view)
    {
        TextView area0 = (TextView)findViewById(R.id.txtv_areano);
        //String area001 = area0.getText().toString();
        TextView GateSt = (TextView)findViewById(R.id.txtv_GateSt);
        TextView QuickC = (TextView)findViewById(R.id.txtv_QuickC);
        TextView chat = (TextView)findViewById(R.id.txtv_chat);
        TextView sysSt = (TextView)findViewById(R.id.txtv_sysSt);
        // TextView LastA = (TextView)findViewById(R.id.txtv_LastA);

        String GateStValue = GateSt.getText().toString();
        if ( GateStValue.equals(":Closed") )
        {
            area0.setText(":03");
            area0.setTextColor(Color.RED);
            GateSt.setText(":Opened!");
            GateSt.setTextColor(Color.RED);
            QuickC.setText(":Ahmad Talal");
            chat.setText(":Ahmad Talal + Aymen");
            sysSt.setText(":OK!");
            sysSt.setTextColor(Color.GREEN);
          }

          else
              {
            area0.setText(":10");
            area0.setTextColor(Color.GREEN);
            GateSt.setText(":Closed");
            GateSt.setTextColor(Color.GREEN);
            QuickC.setText(":Saud Saad");
            chat.setText(":Saud S + Ibrahim G");
            sysSt.setText(":OK!");
            sysSt.setTextColor(Color.GREEN);
        }
    }
}
