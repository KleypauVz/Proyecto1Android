package com.example.android.sweetlab;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lItem;
    private Adaptador adaptador;
    private ArrayList<Datos> arraydatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Selecciona la chucheria que deseas comprar",Toast.LENGTH_LONG).show();
        lItem = (ListView) findViewById(R.id.lItem);
        arraydatos = GetArrayItems();
        adaptador = new Adaptador(this, arraydatos);
        lItem.setAdapter(adaptador);


        lItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("objetoData", arraydatos.get(position));
                startActivity(intent);
            }
        });



    }
    private ArrayList<Datos> GetArrayItems(){
        ArrayList<Datos> list=new ArrayList<>();
        list.add(new Datos(R.drawable.ubbaloo, "Bubbaloo"));
        list.add(new Datos(R.drawable.hipshoy, "Chips Ahoy!"));
        list.add(new Datos(R.drawable.jacks, "JACKS"));
        list.add(new Datos(R.drawable.milka, "Chocolate Milka"));
        list.add(new Datos(R.drawable.oreo, "Galletas Oreo"));
        list.add(new Datos(R.drawable.pringles, "Papas Pringles"));
        list.add(new Datos(R.drawable.itz, "RITZ"));
        list.add(new Datos(R.drawable.ringpop, "Chupetas Ring Pop"));
        list.add(new Datos(R.drawable.tictac, "TIC TAC"));
        list.add(new Datos(R.drawable.toblerone, "Chocolate Toblerone"));
        list.add(new Datos(R.drawable.pirulin, "Pirulines"));
        list.add(new Datos(R.drawable.pinguiinos, "Pinguinitos"));
        list.add(new Datos(R.drawable.nutella, "Nutella"));
        list.add(new Datos(R.drawable.mym, "M&M"));
        list.add(new Datos(R.drawable.luckycharms, "Lucky Charms"));
        list.add(new Datos(R.drawable.kitkat, "Kit Kat"));
        list.add(new Datos(R.drawable.hershey, "HERSHEY'S"));
        list.add(new Datos(R.drawable.lifesavers, "Life Savers"));
        list.add(new Datos(R.drawable.fun_dip, "Fun Dip"));
        list.add(new Datos(R.drawable.nerds, "Nerds"));
        return list;
    }

}

