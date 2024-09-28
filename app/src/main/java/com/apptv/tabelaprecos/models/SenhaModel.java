package com.apptv.tabelaprecos.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "senha")
public class SenhaModel {
    @PrimaryKey(autoGenerate = true)
    private Integer idSenha;
    private Integer senha;
    private Date dataAtual;

    public Integer getIdSenha() {
        return idSenha;
    }

    public void setIdSenha(Integer idSenha) {
        this.idSenha = idSenha;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }
}
