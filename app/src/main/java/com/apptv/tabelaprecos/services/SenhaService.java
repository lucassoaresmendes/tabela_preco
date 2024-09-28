package com.apptv.tabelaprecos.services;

import android.content.Context;

import com.apptv.tabelaprecos.dao.SenhaDao;
import com.apptv.tabelaprecos.database.AppDatabase;
import com.apptv.tabelaprecos.models.SenhaModel;

import java.util.List;

public class SenhaService {

    private final SenhaDao senhaDao;

    public SenhaService(Context context) {
        AppDatabase db = AppDatabase.getInstance(context);
        this.senhaDao = db.senhaDao();
    }

    public void inserirSenha(SenhaModel senha) {
        senhaDao.insert(senha);
    }

    public void atualizarSenha(SenhaModel senha) {
        senhaDao.update(senha);
    }

    public void deletarSenha(SenhaModel senha) {
        senhaDao.delete(senha);
    }

    public SenhaModel obterSenhaPorId(int id) {
        return senhaDao.getSenhaById(id);
    }

    public List<SenhaModel> obterTodasSenhas() {
        return senhaDao.getAllSenhas();
    }
}
