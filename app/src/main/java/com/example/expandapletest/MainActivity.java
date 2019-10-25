package com.example.expandapletest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;


public class MainActivity extends AppCompatActivity {
    Button btnOpen;
    TextView textView;
    ExpandableRelativeLayout expandableRelativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tvPar);
        btnOpen = findViewById(R.id.btnOpen);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "helllo ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showInformation(View view){
        expandableRelativeLayout = findViewById(R.id.myContent);
        expandableRelativeLayout.toggle();

    }
}
