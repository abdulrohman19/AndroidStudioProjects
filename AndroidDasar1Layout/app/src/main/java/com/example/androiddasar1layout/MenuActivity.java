package com.example.androiddasar1layout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    //1. variablenya
    Button btnLinear, btnRelative, btnFrame, btnConstraint, btnScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //2.menyambungkan - variable sesuai id
        btnLinear = findViewById(R.id.btn_linear);
        btnRelative = findViewById(R.id.btn_relative);
        btnFrame = findViewById(R.id.btn_frame);
        btnConstraint = findViewById(R.id.btn_constrain);
        btnScroll = findViewById(R.id.btn_scrool);

        //3.memproses - event handling
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MenuActivity.this, "Ini Toast", Toast.LENGTH_SHORT).show();
                    Intent pindah = new Intent(MenuActivity.this, MainActivity.class);
                    startActivity(pindah);
            }
        });
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder pesan= new AlertDialog.Builder(MenuActivity.this);
                pesan.setTitle("Alert Dialog");
                pesan.setMessage("ini Alert Dialog");
                pesan.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MenuActivity.this, "Anda memilih OK ", Toast.LENGTH_SHORT).show();
                        Intent pindah = new Intent(MenuActivity.this, RelativeActivity.class);
                        startActivity(pindah);
                    }
                });
                pesan.setNegativeButton("No", null);
                pesan.show();
            }
        });
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MenuActivity.this, FrameActivity.class);
                startActivity(pindah);
            }
        });
        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MenuActivity.this, ConstraintActivity.class);
                startActivity(pindah);
            }
        });
        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MenuActivity.this, ScroolActivity.class);
                startActivity(pindah);
            }
        });


    }
}