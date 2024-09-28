package com.apptv.tabelaprecos.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apptv.tabelaprecos.models.ProdutoPromocaoModel;

import java.util.List;

@Dao
public interface ProdutoPromocaoDao {

    @Insert
    long inserirProdutoPromocao(ProdutoPromocaoModel produtoPromocao);

    @Query("SELECT * FROM produto_promocao")
    List<ProdutoPromocaoModel> buscarTodosProdutoPromocao();

    @Query("SELECT * FROM produto_promocao WHERE idProdutoPromocao = :id")
    ProdutoPromocaoModel buscarProdutoPromocaoPorId(int id);

    @Update
    int atualizarProdutoPromocao(ProdutoPromocaoModel produtoPromocao);

    @Delete
    int deletarProdutoPromocao(ProdutoPromocaoModel produtoPromocao);
}
