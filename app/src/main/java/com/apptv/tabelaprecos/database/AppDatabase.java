package com.apptv.tabelaprecos.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.apptv.tabelaprecos.dao.AnuncioDao;
import com.apptv.tabelaprecos.dao.ProdutoDao;
import com.apptv.tabelaprecos.dao.ProdutoPromocaoDao;
import com.apptv.tabelaprecos.dao.PromocaoDao;
import com.apptv.tabelaprecos.dao.SenhaDao;
import com.apptv.tabelaprecos.models.AnuncioModel;
import com.apptv.tabelaprecos.models.ProdutoModel;
import com.apptv.tabelaprecos.models.ProdutoPromocaoModel;
import com.apptv.tabelaprecos.models.PromocaoModel;
import com.apptv.tabelaprecos.models.SenhaModel;

@Database(entities = {ProdutoModel.class, ProdutoPromocaoModel.class, AnuncioModel.class, PromocaoModel.class, SenhaModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static volatile AppDatabase instance;

    public abstract ProdutoDao produtoDao();
    public abstract AnuncioDao anuncioDao();
    public abstract ProdutoPromocaoDao produtoPromocaoDao();
    public abstract PromocaoDao promocaoDao();
    public abstract SenhaDao senhaDao();

    public static AppDatabase getInstance(Context context) {
        if (instance == null) {
            synchronized (AppDatabase.class) {
                if (instance == null) {
                    instance = Room.databaseBuilder(context.getApplicationContext(),
                                    AppDatabase.class, "app_database")
                            .fallbackToDestructiveMigration() // Se precisar lidar com versões do DB
                            .build();
                }
            }
        }
        return instance;
    }
}
