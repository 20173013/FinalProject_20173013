package com.example.senierproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TicketingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticketing);
    }

    public void ticketing1(View view) {
        Intent it1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cgv.co.kr/ticket/"));
        startActivity(it1);
    }
    public void ticketing2(View view) {
        Intent it2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lottecinema.co.kr/NLCHS/Ticketing"));
        startActivity(it2);
    }
    public void ticketing3(View view) {
        Intent it3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cineq.co.kr/Theater/Movie?TheaterCode=1001"));
        startActivity(it3);
    }
    public void ticketing4(View view) {
        Intent it4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.megabox.co.kr/booking"));
        startActivity(it4);
    }



}
