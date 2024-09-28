package com.apptv.tabelaprecos.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.apptv.tabelaprecos.models.AnuncioModel;
import java.util.List;

@Dao
public interface AnuncioDao {

    @Query("SELECT * FROM anuncio")
    List<AnuncioModel> getTodosAnuncios();

    @Query("SELECT * FROM anuncio WHERE idAnuncio = :id")
    AnuncioModel getAnuncioPorId(int id);

    @Insert
    void inserirAnuncio(AnuncioModel anuncio);

    @Update
    void atualizarAnuncio(AnuncioModel anuncio);

    @Delete
    void deletarAnuncio(AnuncioModel anuncio);
}
