package com.example.fco.fisiomer2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class CatalogoMapas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_mapas);

        Intent intent = getIntent();
        TextView textView = new TextView(this);
        textView.setTextSize(40);

        String mensaje = intent.getStringExtra(MenuInicio.EXTRA_MESSAGE);
        textView.setText(R.string.menu_sucursal);



        ViewGroup layout = (ViewGroup) findViewById(R.id.catalogo_mapas);
        layout.addView(textView);

    }

}

