package com.apptv.tabelaprecos.services;

import android.content.Context;

import com.apptv.tabelaprecos.dao.ProdutoPromocaoDao;
import com.apptv.tabelaprecos.database.AppDatabase;
import com.apptv.tabelaprecos.models.ProdutoPromocaoModel;

import java.util.List;

public class ProdutoPromocaoService {
    private final ProdutoPromocaoDao produtoPromocaoDao;

    public ProdutoPromocaoService(Context context) {
        AppDatabase db = AppDatabase.getInstance(context);
        this.produtoPromocaoDao = db.produtoPromocaoDao();
    }

    // Criar um novo produto promoção
    public long criarProdutoPromocao(ProdutoPromocaoModel produtoPromocao) {
        return produtoPromocaoDao.inserirProdutoPromocao(produtoPromocao);
    }

    // Buscar todos os produtos promoção
    public List<ProdutoPromocaoModel> buscarTodosProdutosPromocao() {
        return produtoPromocaoDao.buscarTodosProdutoPromocao();
    }

    // Buscar um produto promoção por ID
    public ProdutoPromocaoModel buscarProdutoPromocaoPorId(int id) {
        return produtoPromocaoDao.buscarProdutoPromocaoPorId(id);
    }

    // Atualizar um produto promoção
    public int atualizarProdutoPromocao(ProdutoPromocaoModel produtoPromocao) {
        return produtoPromocaoDao.atualizarProdutoPromocao(produtoPromocao);
    }

    // Deletar um produto promoção
    public int deletarProdutoPromocao(ProdutoPromocaoModel produtoPromocao) {
        return produtoPromocaoDao.deletarProdutoPromocao(produtoPromocao);
    }
}
