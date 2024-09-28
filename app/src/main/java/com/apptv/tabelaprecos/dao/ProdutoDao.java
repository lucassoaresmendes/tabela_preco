package com.apptv.tabelaprecos.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apptv.tabelaprecos.models.ProdutoModel;

import java.util.List;

@Dao
public interface ProdutoDao {

    @Insert
    long inserirProduto(ProdutoModel produto);

    @Update
    int atualizarProduto(ProdutoModel produto);

    @Delete
    int deletarProduto(ProdutoModel produto);

    @Query("SELECT * FROM produto")
    List<ProdutoModel> buscarTodosProdutos();

    @Query("SELECT * FROM produto WHERE idProduto = :id LIMIT 1")
    ProdutoModel buscarProdutoPorId(int id);
}
