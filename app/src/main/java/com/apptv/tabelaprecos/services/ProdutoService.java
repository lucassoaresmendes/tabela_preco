package com.apptv.tabelaprecos.services;

import android.content.Context;
import androidx.room.Room;
import com.apptv.tabelaprecos.database.AppDatabase;
import com.apptv.tabelaprecos.models.ProdutoModel;
import com.apptv.tabelaprecos.dao.ProdutoDao;

import java.util.List;

public class ProdutoService {

    private final ProdutoDao produtoDao;

    public ProdutoService(Context context) {
        AppDatabase db = AppDatabase.getInstance(context);
        this.produtoDao = db.produtoDao();
    }

    // Função para criar um novo produto
    public long criarProduto(ProdutoModel produto) {
        return produtoDao.inserirProduto(produto);
    }

    // Função para buscar todos os produtos
    public List<ProdutoModel> buscarTodosProdutos() {
        return produtoDao.buscarTodosProdutos();
    }

    // Função para atualizar um produto existente
    public int atualizarProduto(ProdutoModel produto) {
        return produtoDao.atualizarProduto(produto);
    }

    // Função para deletar um produto
    public int deletarProduto(ProdutoModel produto) {
        return produtoDao.deletarProduto(produto);
    }

    // Função para buscar um produto por ID (opcional)
    public ProdutoModel buscarProdutoPorId(int id) {
        return produtoDao.buscarProdutoPorId(id);
    }
}
