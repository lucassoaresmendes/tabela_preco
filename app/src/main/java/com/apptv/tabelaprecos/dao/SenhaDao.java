package com.apptv.tabelaprecos.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apptv.tabelaprecos.models.SenhaModel;

import java.util.List;

@Dao
public interface SenhaDao {

    @Insert
    void insert(SenhaModel senha);

    @Update
    void update(SenhaModel senha);

    @Delete
    void delete(SenhaModel senha);

    @Query("SELECT * FROM senha WHERE idSenha = :id")
    SenhaModel getSenhaById(int id);

    @Query("SELECT * FROM senha")
    List<SenhaModel> getAllSenhas();
}
