package com.example.leonpsilva.cardpio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.leonpsilva.cardpio.modelos.Produto;

import java.util.ArrayList;

public class ProdutosActivity extends AppCompatActivity {

    private TextView textViewTitulo;
    private LinearLayout linearLayout;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ImageView imageViewCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        textViewTitulo = findViewById(R.id.textViewTitulo);
        linearLayout = findViewById(R.id.layout);
        imageViewCategoria = findViewById(R.id.imageViewCategoria);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);

        textViewTitulo.setText(titulo);

        criarProdutos(titulo);
    }


   public void criarProdutos(String titulo) {

        if (titulo.equals("Lanches")) {
            imageViewCategoria.setImageResource(R.drawable.lanche);
            produtos.add(new Produto("Lanche de bacon",
                    13.99, "Delicioso lanche de Bacon",
                    "Lanche"));

            produtos.add(new Produto("X-Costela",
                    24.99,
                    "Delicioso lanche de Costela",
                    "Lanche"));

            produtos.add(new Produto("X-Tudo",
                    22.99,
                    "Delioso lanche de Tudo",
                    "Lanche"));

        }else if (titulo.equals("Picanhas")) {
            imageViewCategoria.setImageResource(R.drawable.picanha);
            produtos.add(new Produto("Picanha a bafo",
                    125.99,"Deliciosa picanha a bafo",
                    "Picanhas"));

            produtos.add(new Produto("Picanha Grelhada",
                    70.99,
                    "Picanha grelhada Suculenta",
                    "Picanhas"));

       }else if (titulo.equals("Pizzas")) {
            imageViewCategoria.setImageResource(R.drawable.pizza);
            produtos.add(new Produto("Pizza de Calabresa",
                    20.99,
                    "Deliciosa Pizza crocante com gosto de calabresa",
                    "Pizza"));

            produtos.add(new Produto("Pizza de 4Queijos",
                    20.99,
                    "Deliciosa Pizza crocante com gosto de Queijo",
                    "Pizza"));

        }else if (titulo.equals("Quibes")) {
            imageViewCategoria.setImageResource(R.drawable.quibe);
            produtos.add(new Produto("Quibe de Frango",
                    12.99,
                    "Delicioso quibe de frango grelhado",
                    "Quibes"));
        }

        listaProdutos(produtos);
   }

   public void listaProdutos(ArrayList<Produto> lista) {
        for (int i=0; i<lista.size();i++) {
            TextView textViewNome = new TextView(this);
            TextView textViewPreco = new TextView(this);
            TextView textViewDescricao = new TextView(this);

            textViewNome.setText(lista.get(i).getNome());
            textViewNome.setTextSize(18);

            textViewPreco.setText("R$:" + lista.get(i).getPreco().toString().replace(".",","));

            textViewDescricao.setText(lista.get(i).getDescricao());

            linearLayout.addView(textViewNome);
            linearLayout.addView(textViewPreco);
            linearLayout.addView(textViewDescricao);
        }
   }

}
