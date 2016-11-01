package com.example.ghinafauziyyahna.bookinventory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ghina Fauziyyah N A on 10/31/2016.
 */

public class activity1 extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        Button btn_newbie = (Button)findViewById(R.id.btn_newbie);
        Button btn_member = (Button)findViewById(R.id.btn_member);
        Button btn_admin = (Button)findViewById(R.id.btn_admin);
        btn_newbie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity1.this,activityNewbie.class));
            }
        });
        btn_member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity1.this,activityMember.class));
            }
        });
        btn_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity1.this,activityAdmin.class));
            }
        });


    }

}
