package com.example.a503_08.a1001sync;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnasync =(Button)findViewById(R.id.btnasync);

        btnasync.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this).setMessage("액티비티 종료").setTitle("대화상자").setIcon(R.drawable.icon).setPositiveButton("프로그램 종료", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).show();


                //토스트 출력
                Toast.makeText(MainActivity.this,"토스트 출력",Toast.LENGTH_LONG).show();

                //액티비티 종료
                //finish();
            }
        });
    }
}
