package com.example.fco.fisiomer2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MenuInicio extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.fco.fisiomer2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicio);
    }

    public void pasarTextto(View view) {
        Intent intent = new Intent(this, CatalogoMapas.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirPagina(View view) {
        Intent intent = new Intent(this, CatalogoMapas.class);
        startActivity(intent);
    }

}
