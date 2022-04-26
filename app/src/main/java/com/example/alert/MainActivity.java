package com.example.alert;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Dialog dialog;
    private Button ShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowDialog = findViewById(R.id.button);


        dialog = new Dialog(this);

        dialog.setContentView(R.layout.customalert);
        dialog.setCancelable(false);

        Button YesBtn = dialog.findViewById(R.id.Yes_btn);
        Button noBtn = dialog.findViewById(R.id.No_btn);


        ShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.show(); // Showing the dialog here
            }
        });


        YesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                System.exit(0);
            }
        });

        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });





    }


    public void onBackPressed() {
        Dialog customDialog = new Dialog(this);

        customDialog.setContentView(R.layout.customalert);
        customDialog.setCancelable(false);

        Button YesBtn = customDialog.findViewById(R.id.Yes_btn);
        Button noBtn = customDialog.findViewById(R.id.No_btn);

        YesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }


        });

        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog.cancel();
            }


        });
        customDialog.show();
    }
}