
package com.example.senierproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_lOGIN = 201;
    public static final int REQUEST_CODE_BOXOFFICE = 202;
    public static final int REQUEST_CODE_MAP = 203;
    public static final int REQUEST_CODE_TiCKEKING = 204;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button main01Button = (Button) findViewById(R.id.main01Button);
        main01Button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.putExtra("titleMsg", "로그인");

                startActivityForResult(intent, REQUEST_CODE_lOGIN);
            }
        });

        Button main02Button = (Button) findViewById(R.id.main02Button);
        main02Button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BoxOfficeActivity.class);
                intent.putExtra("titleMsg", "주간 박스오피스 조회");

                startActivityForResult(intent, REQUEST_CODE_BOXOFFICE);
            }
        });

        Button main03Button = (Button) findViewById(R.id.main03Button);
        main03Button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                intent.putExtra("titleMsg", "위치보기");

                startActivityForResult(intent, REQUEST_CODE_MAP);
            }
        });

        Button main04Button = (Button) findViewById(R.id.main04Button);
        main04Button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TicketingActivity.class);
                intent.putExtra("titleMsg", "영화 예매하기");

                startActivityForResult(intent, REQUEST_CODE_TiCKEKING);
            }
        });

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if (intent != null) {
            if (requestCode == REQUEST_CODE_lOGIN) {
                String message = intent.getStringExtra("message");

                if (message != null) {
                    Toast toast = Toast.makeText(getBaseContext(), "로그인 응답, result code : " + resultCode + ", message : " + message, Toast.LENGTH_LONG);
                    toast.show();
                }
            } else if (requestCode == REQUEST_CODE_BOXOFFICE) {
                String message = intent.getStringExtra("message");

                if (message != null) {
                    Toast toast = Toast.makeText(getBaseContext(), "영화관 위치보기 응답, result code : " + resultCode + ", message : " + message, Toast.LENGTH_LONG);
                    toast.show();
                }
            } else if (requestCode == REQUEST_CODE_MAP) {
                String message = intent.getStringExtra("message");

                if (message != null) {
                    Toast toast = Toast.makeText(getBaseContext(), "영화 예매하기 응답, result code : " + resultCode + ", message : " + message, Toast.LENGTH_LONG);
                    toast.show();
                }
            }else if (requestCode == REQUEST_CODE_TiCKEKING) {
                String message = intent.getStringExtra("message");

                if (message != null) {
                    Toast toast = Toast.makeText(getBaseContext(), "영화 예매하기 응답, result code : " + resultCode + ", message : " + message, Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        }

    }

}
