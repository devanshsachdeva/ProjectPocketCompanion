package com.error404.ppc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Project extends AppCompatActivity {

    private RadioButton rdbtn01;
    private RadioButton rdbtn02;
    private RadioButton rdbtn03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        rdbtn01 = (RadioButton) findViewById(R.id.prbtn1);
        rdbtn02 = (RadioButton) findViewById(R.id.prbtn2);
        rdbtn03 = (RadioButton) findViewById(R.id.prbtn3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This is the Project Repositroy ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rdbtn01.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(Project.this,Project1.class);
                startActivity(intent);

            }

        });

        rdbtn02.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(Project.this,Project2.class);
                startActivity(intent);

            }

        });

        rdbtn03.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(Project.this,Project3.class);
                startActivity(intent);

            }

        });

    }

}
