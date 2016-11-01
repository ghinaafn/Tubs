package com.example.ghinafauziyyahna.bookinventory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Ghina Fauziyyah N A on 10/31/2016.
 */

public class activityNewbie extends AppCompatActivity implements View.OnClickListener{
    EditText edt_bookcode;
    EditText edt_rsltcode;

    protected void onCreate(Bundle savedInstanteState){
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_newbie);

        edt_bookcode = (EditText)findViewById(R.id.edt_bookcode);
        Button btn_submit = (Button)findViewById(R.id.btn_submit);
        edt_rsltcode = (EditText)findViewById(R.id.edt_rsltcode);
        Button btn_loginnow = (Button)findViewById(R.id.btn_loginnow);

        btn_submit.setOnClickListener(this);

        btn_loginnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activityNewbie.this, activityLogin.class));
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_submit:
             edt_rsltcode.setText(edt_bookcode.getText());
                break;

        }
    }
}
