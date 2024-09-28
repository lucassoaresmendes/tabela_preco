package com.apptv.tabelaprecos.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.apptv.tabelaprecos.R;

public class TabelaPrecosActivity extends AppCompatActivity {

    private final String[] produtos = {"Carne", "Frango", "Peixe", "Queijo", "Presunto"};
    private final String[] precos = {"R$ 25,00", "R$ 15,00", "R$ 20,00", "R$ 12,00", "R$ 18,00"};
    private static final String TAG = "TabelaPrecosActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabela_precos); // Crie este layout
        preencherDadosTabela();
    }

    private void preencherDadosTabela() {
        GridLayout gridPai = findViewById(R.id.grid_produtos);

        if (gridPai == null) {
            Log.e(TAG, "GridLayout pai não encontrado");
            return;
        }

        for (int i = 0; i < produtos.length; i += 2) {
            // Criar um novo GridLayout filho
            GridLayout gridFilho = new GridLayout(this);
            gridFilho.setColumnCount(4); // 4 colunas: 2 para produto, 2 para preço

            // Criar parâmetros de layout para o grid filho
            GridLayout.LayoutParams gridParams = new GridLayout.LayoutParams();
            gridParams.width = GridLayout.LayoutParams.MATCH_PARENT;
            gridParams.height = GridLayout.LayoutParams.WRAP_CONTENT;
            gridFilho.setLayoutParams(gridParams);

            boolean linhaPar = (i / 2) % 2 == 0;

            // Adicionar primeiro produto e preço
            adicionarItemTabela(gridFilho, produtos[i], precos[i], 0, linhaPar);

            // Adicionar segundo produto e preço (se houver)
            if (i + 1 < produtos.length) {
                adicionarItemTabela(gridFilho, produtos[i + 1], precos[i + 1], 2, linhaPar);
            }

            // Adicionar o grid filho ao grid pai
            gridPai.addView(gridFilho);
        }
    }

    private void adicionarItemTabela(@NonNull GridLayout gridLayout, String produto, String preco, int coluna, boolean linhaPar) {
        int corLinha = linhaPar ? Color.parseColor("#000000") : Color.parseColor("#800000");
        //Conversar sobre qual cor colocar

        // Adicionar o produto
        TextView produtoTextView = new TextView(this);
        produtoTextView.setText(produto);
        personalizarTextView(produtoTextView, corLinha);
        GridLayout.LayoutParams produtoParams = new GridLayout.LayoutParams();
        produtoParams.rowSpec = GridLayout.spec(GridLayout.UNDEFINED);
        produtoParams.columnSpec = GridLayout.spec(coluna); // Produto na coluna 0 ou 2
        produtoParams.width = (int) (305 * getResources().getDisplayMetrics().density);
        produtoParams.height = GridLayout.LayoutParams.WRAP_CONTENT;
        produtoParams.setMargins(1, 0,1,1);
        produtoTextView.setLayoutParams(produtoParams);
        gridLayout.addView(produtoTextView);

        // Adicionar o preço
        TextView precoTextView = new TextView(this);
        precoTextView.setText(preco);
        personalizarTextView(precoTextView, corLinha);
        GridLayout.LayoutParams precoParams = new GridLayout.LayoutParams();
        precoParams.rowSpec = GridLayout.spec(GridLayout.UNDEFINED);
        precoParams.columnSpec = GridLayout.spec(coluna + 1); // Preço na coluna 1 ou 3
        precoParams.width = (int) (153 * getResources().getDisplayMetrics().density);
        precoParams.height = GridLayout.LayoutParams.WRAP_CONTENT;
        precoParams.setMargins(1,0,1,1);
        precoTextView.setLayoutParams(precoParams);
        gridLayout.addView(precoTextView);
    }

    private void personalizarTextView(@NonNull TextView textView, int corDeFundo) {
        textView.setBackgroundColor(corDeFundo);
        textView.setTextSize(18f);
        textView.setTextColor(Color.WHITE); // Texto em branco
        textView.setTypeface(null, android.graphics.Typeface.BOLD);
        textView.setPadding(8, 5, 8, 5);
    }
}
