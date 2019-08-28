package com.example.leonpsilva.cardpio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.leonpsilva.cardpio.modelos.Produto;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.cardpio.TITULO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menuItem1) {
            //Faz alguma coisa ao clicar no menu
            Intent intent = new Intent(this, SobreActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void abrirLanche(View v) {
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Lanches");
        startActivity(intent);
    }

    public void abrirPicanha(View v) {
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO,"Picanhas");
        startActivity(intent);
    }
    public void abrirPizza(View v) {
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO,"Pizzas");
        startActivity(intent);
    }

    public void abrirQuibe(View v) {
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Quibes");
        startActivity(intent);
    }
}

