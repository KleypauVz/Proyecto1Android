package com.example.android.sweetlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Datos Item;
    private TextView nombre2;
    private ImageView chuche2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre2=findViewById(R.id.nombre2);
        chuche2=findViewById(R.id.chuche2);

        Item = (Datos) getIntent().getSerializableExtra("objetoData");
        nombre2.setText(Item.getNombre());
        chuche2.setImageResource(Item.getChuche());

    }


    public void Send(View view) {
        Intent uno = new Intent(this, MainActivity.class);
        startActivity(uno);

    }

}