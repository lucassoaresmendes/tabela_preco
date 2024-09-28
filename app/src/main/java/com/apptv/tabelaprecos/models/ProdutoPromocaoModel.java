package com.apptv.tabelaprecos.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "produto_promocao")
public class ProdutoPromocaoModel {
    @PrimaryKey(autoGenerate = true)
    private Integer idProdutoPromocao;
    private Integer idPromocao;
    private Integer idProduto;
    private Integer quantidade;
    private Float estoqueMin;
    private Float precoPromocional;
    private String tempoExibicao;

    public Integer getIdProdutoPromocao() {
        return idProdutoPromocao;
    }

    public void setIdProdutoPromocao(Integer idProdutoPromocao) {
        this.idProdutoPromocao = idProdutoPromocao;
    }

    public Integer getIdPromocao() {
        return idPromocao;
    }

    public void setIdPromocao(Integer idPromocao) {
        this.idPromocao = idPromocao;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(Float estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public Float getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(Float precoPromocional) {
        this.precoPromocional = precoPromocional;
    }

    public String getTempoExibicao() {
        return tempoExibicao;
    }

    public void setTempoExibicao(String tempoExibicao) {
        this.tempoExibicao = tempoExibicao;
    }
}
