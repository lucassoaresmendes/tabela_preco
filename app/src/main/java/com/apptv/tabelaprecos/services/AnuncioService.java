package com.apptv.tabelaprecos.services;

import android.content.Context;

import com.apptv.tabelaprecos.dao.AnuncioDao;
import com.apptv.tabelaprecos.database.AppDatabase;
import com.apptv.tabelaprecos.models.AnuncioModel;
import java.util.List;

public class AnuncioService {
    private final AnuncioDao anuncioDao;

    public AnuncioService(Context context) {
        AppDatabase db = AppDatabase.getInstance(context);
        this.anuncioDao = db.anuncioDao();
    }

    // Métodos para interagir com o banco de dados
    public List<AnuncioModel> getAllAnuncios() {
        return anuncioDao.getTodosAnuncios();
    }

    public void inserirAnuncio(AnuncioModel anuncio) {
        anuncioDao.inserirAnuncio(anuncio);
    }

    public void atualizarAnuncio(AnuncioModel anuncio) {
        anuncioDao.atualizarAnuncio(anuncio);
    }

    public void deletarAnuncio(AnuncioModel anuncio) {
        anuncioDao.deletarAnuncio(anuncio);
    }
}
