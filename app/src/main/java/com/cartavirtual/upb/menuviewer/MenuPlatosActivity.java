package com.cartavirtual.upb.menuviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MenuPlatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_platos);
    }

    public void LanzarEntradas(View view)
    {
        Intent i;

        i = new Intent(this, EntradasActivity.class);

        startActivity(i);

    }

    public void LanzarPlatosFuertes(View view)
    {
        Intent i;

        i = new Intent(this, PlatosFuertesActivity.class);

        startActivity(i);
    }


    public void LanzarBebidas(View view)
    {
        Intent i;

        i = new Intent(this, BebidasActivity.class);

        startActivity(i);
    }
}
