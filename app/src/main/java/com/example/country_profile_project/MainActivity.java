package com.example.country_profile_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshButton,pakistanButton,turkeyButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton = findViewById(R.id.bangladesh_Id);
        pakistanButton = findViewById(R.id.pakistan_Id);
        turkeyButton = findViewById(R.id.turkey_Id);


        bangladeshButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);
        turkeyButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.bangladesh_Id){
            intent = new Intent(MainActivity.this, ProfileView.class);
            intent.putExtra("name","bangladesh");

            startActivity(intent);
        }

        if (v.getId()==R.id.pakistan_Id){
            intent = new Intent(MainActivity.this, ProfileView.class);
            intent.putExtra("name","pakistan");

            startActivity(intent);
        }

        if (v.getId()==R.id.turkey_Id){
            intent = new Intent(MainActivity.this, ProfileView.class);
            intent.putExtra("name","turkey");

            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.warning);
        alertDialogBuilder.setTitle(R.string.titel_text);
        alertDialogBuilder.setMessage(R.string.message_text);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}