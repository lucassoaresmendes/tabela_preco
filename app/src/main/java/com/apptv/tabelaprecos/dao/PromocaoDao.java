package com.apptv.tabelaprecos.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apptv.tabelaprecos.models.PromocaoModel;

import java.util.List;

@Dao
public interface PromocaoDao {

    @Insert
    void insert(PromocaoModel promocao);

    @Update
    void update(PromocaoModel promocao);

    @Delete
    void delete(PromocaoModel promocao);

    @Query("SELECT * FROM promocao WHERE idPromocao = :id")
    PromocaoModel getPromocaoById(int id);

    @Query("SELECT * FROM promocao")
    List<PromocaoModel> getAllPromocoes();
}
