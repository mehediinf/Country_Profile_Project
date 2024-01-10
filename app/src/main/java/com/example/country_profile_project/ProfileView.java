package com.example.country_profile_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileView extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView_1,textView_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_view);

        imageView = findViewById(R.id.imageView_Id);
        textView_1 = findViewById(R.id.textView_Id_1);
        textView_2 = findViewById(R.id.textView_Id_2);


        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }

    }

    void showDetails(String countryName){
        if (countryName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.bangladesh);
            textView_1.setText(R.string.bangladesh_name);
            textView_2.setText(R.string.bangladesh_text);

        }

        if (countryName.equals("pakistan")){
            imageView.setImageResource(R.drawable.pakistan);
            textView_1.setText(R.string.pakistan_name);
            textView_2.setText(R.string.pakistan_text);

        }

        if (countryName.equals("turkey")){
            imageView.setImageResource(R.drawable.turkey);
            textView_1.setText(R.string.turkey_name);
            textView_2.setText(R.string.turkey_text);

        }

    }

}