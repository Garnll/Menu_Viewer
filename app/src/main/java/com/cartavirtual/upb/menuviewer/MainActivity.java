package com.cartavirtual.upb.menuviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LanzarMapa(View view){
        Intent i;

        i = new Intent(this, MapsActivity.class);

        startActivity(i);
    }

    public void LanzarMenu(View view){
        Intent i;

        i = new Intent(this, MenuPlatosActivity.class);

        startActivity(i);
    }
}
