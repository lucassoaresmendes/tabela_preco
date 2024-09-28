package com.apptv.tabelaprecos.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GerenciadorBD extends SQLiteOpenHelper {
    // Nome do banco de dados
    private static final String DATABASE_NAME = "tabela_precos.db";

    // Versão do banco de dados
    private static final int DATABASE_VERSION = 1;

    // Construtor
    public GerenciadorBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Criação das tabelas
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Tabela produto
        String CREATE_TABLE_PRODUTO = "CREATE TABLE produto ("
                + "id_produto INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "descricao TEXT,"
                + "status INTEGER,"
                + "data_inclusao TEXT,"
                + "descricao_resumida TEXT,"
                + "preco_original REAL,"
                + "preco_promocional REAL"
                + ")";
        db.execSQL(CREATE_TABLE_PRODUTO);

        // Tabela anuncio
        String CREATE_TABLE_ANUNCIO = "CREATE TABLE anuncio ("
                + "id_anuncio INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "data_inicial TEXT,"
                + "data_final TEXT,"
                + "codigo_imagem TEXT,"
                + "tempo_exibicao TEXT"
                + ")";
        db.execSQL(CREATE_TABLE_ANUNCIO);

        // Tabela produto_promocao
        String CREATE_TABLE_PRODUTO_PROMOCAO = "CREATE TABLE produto_promocao ("
                + "id_produto_promocao INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "id_promocao INTEGER,"
                + "id_produto INTEGER,"
                + "quantidade INTEGER,"
                + "estoque_min REAL,"
                + "preco_promocional REAL,"
                + "tempo_exibicao TEXT,"
                + "FOREIGN KEY (id_promocao) REFERENCES promocao(id_promocao),"
                + "FOREIGN KEY (id_produto) REFERENCES produto(id)"
                + ")";
        db.execSQL(CREATE_TABLE_PRODUTO_PROMOCAO);

        // Tabela promocao
        String CREATE_TABLE_PROMOCAO = "CREATE TABLE promocao ("
                + "id_promocao INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "data_inicial TEXT,"
                + "data_final TEXT,"
                + "data_indeterminada INTEGER,"
                + "desconto REAL,"
                + "valor_desconto REAL,"
                + "preco_promocional REAL,"
                + "inativa INTEGER,"
                + "id_externo INTEGER,"
                + "maximo_cupom REAL,"
                + "leva REAL,"
                + "paga REAL,"
                + "brinde INTEGER,"
                + "descricao TEXT"
                + ")";
        db.execSQL(CREATE_TABLE_PROMOCAO);

        // Tabela senha
        String CREATE_TABLE_SENHA = "CREATE TABLE senha ("
                + "id_senha INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "senha INTEGER,"
                + "data_atual TEXT"
                + ")";
        db.execSQL(CREATE_TABLE_SENHA);
    }

    // Atualizar o banco de dados se houver mudanças
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS produto");
        db.execSQL("DROP TABLE IF EXISTS anuncio");
        db.execSQL("DROP TABLE IF EXISTS produto_promocao");
        db.execSQL("DROP TABLE IF EXISTS promocao");
        db.execSQL("DROP TABLE IF EXISTS senha");
        onCreate(db);
    }
}
