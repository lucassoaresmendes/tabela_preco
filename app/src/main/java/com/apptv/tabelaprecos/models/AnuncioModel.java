package com.apptv.tabelaprecos.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDateTime;
import java.util.Date;

@Entity(tableName = "anuncio")
public class AnuncioModel {
    @PrimaryKey(autoGenerate = true)
    private Integer idAnuncio;
    private Date dataInicial;
    private Date dataFinal;
    private String codigoImagem;
    private String tempoExibicao;

    public Integer getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(Integer idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getCodigoImagem() {
        return codigoImagem;
    }

    public void setCodigoImagem(String codigoImagem) {
        this.codigoImagem = codigoImagem;
    }

    public String getTempoExibicao() {
        return tempoExibicao;
    }

    public void setTempoExibicao(String tempoExibicao) {
        this.tempoExibicao = tempoExibicao;
    }
}