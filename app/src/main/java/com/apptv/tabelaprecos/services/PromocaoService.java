package com.apptv.tabelaprecos.services;

import android.content.Context;

import com.apptv.tabelaprecos.dao.PromocaoDao;
import com.apptv.tabelaprecos.database.AppDatabase;
import com.apptv.tabelaprecos.models.PromocaoModel;

import java.util.List;

public class PromocaoService {

    private final PromocaoDao promocaoDao;

    public PromocaoService(Context context) {
        AppDatabase db = AppDatabase.getInstance(context);
        this.promocaoDao = db.promocaoDao();
    }

    public void inserirPromocao(PromocaoModel promocao) {
        promocaoDao.insert(promocao);
    }

    public void atualizarPromocao(PromocaoModel promocao) {
        promocaoDao.update(promocao);
    }

    public void deletarPromocao(PromocaoModel promocao) {
        promocaoDao.delete(promocao);
    }

    public PromocaoModel obterPromocaoPorId(int id) {
        return promocaoDao.getPromocaoById(id);
    }

    public List<PromocaoModel> obterTodasPromocoes() {
        return promocaoDao.getAllPromocoes();
    }
}
