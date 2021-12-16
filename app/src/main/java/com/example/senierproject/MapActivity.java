package com.example.senierproject;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void map1(View view) {
        Uri loca = Uri.parse("geo:37.501559,127.026318");
        showMap(loca);
    }
    public void map2(View view) {
        Uri locat = Uri.parse("geo:37.501355,126.882301");
        showMap(locat);
    }
    public void map3(View view) {
        Uri locati = Uri.parse("geo:37.525476,126.925412");
        showMap(locati);
    }
    public void map4(View view) {
        Uri locatio = Uri.parse("geo:37.517168,126.903175");
        showMap(locatio);
    }
    public void map5(View view) {
        Uri location = Uri.parse("geo:37.556449,126.922610");
        showMap(location);
    }

    public void showMap(Uri geoLocation){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}