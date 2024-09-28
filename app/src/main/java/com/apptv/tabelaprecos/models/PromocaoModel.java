package com.apptv.tabelaprecos.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "promocao")
public class PromocaoModel {
    @PrimaryKey(autoGenerate = true)
    private Integer idPromocao;
    private Date dataInicial;
    private Date dataFinal;
    private Boolean dataIndeterminada;
    private Float desconto;
    private Float valorDesconto;
    private Float precoPromocional;
    private Boolean inativa;
    private Integer idExterno;
    private Float maximoCupom;
    private Float leva;
    private Float paga;
    private Boolean brinde;
    private String descricao;

    public Integer getIdPromocao() {
        return idPromocao;
    }

    public void setIdPromocao(Integer idPromocao) {
        this.idPromocao = idPromocao;
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

    public Boolean getDataIndeterminada() {
        return dataIndeterminada;
    }

    public void setDataIndeterminada(Boolean dataIndeterminada) {
        this.dataIndeterminada = dataIndeterminada;
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }

    public Float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Float getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(Float precoPromocional) {
        this.precoPromocional = precoPromocional;
    }

    public Boolean getInativa() {
        return inativa;
    }

    public void setInativa(Boolean inativa) {
        this.inativa = inativa;
    }

    public Integer getIdExterno() {
        return idExterno;
    }

    public void setIdExterno(Integer idExterno) {
        this.idExterno = idExterno;
    }

    public Float getMaximoCupom() {
        return maximoCupom;
    }

    public void setMaximoCupom(Float maximoCupom) {
        this.maximoCupom = maximoCupom;
    }

    public Float getLeva() {
        return leva;
    }

    public void setLeva(Float leva) {
        this.leva = leva;
    }

    public Float getPaga() {
        return paga;
    }

    public void setPaga(Float paga) {
        this.paga = paga;
    }

    public Boolean getBrinde() {
        return brinde;
    }

    public void setBrinde(Boolean brinde) {
        this.brinde = brinde;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}