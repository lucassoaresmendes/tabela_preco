package com.apptv.tabelaprecos.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDateTime;
import java.util.Date;

@Entity(tableName = "produto")
public class ProdutoModel {
    @PrimaryKey(autoGenerate = true)
    private Integer idProduto;
    private String descricao;
    private Boolean status;
    private Date dataInclusao;
    private String descricaoResumida;
    private Float precoOriginal;
    private Float precoPromocional;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public String getDescricaoResumida() {
        return descricaoResumida;
    }

    public void setDescricaoResumida(String descricaoResumida) {
        this.descricaoResumida = descricaoResumida;
    }

    public Float getPrecoOriginal() {
        return precoOriginal;
    }

    public void setPrecoOriginal(Float precoOriginal) {
        this.precoOriginal = precoOriginal;
    }

    public Float getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(Float precoPromocional) {
        this.precoPromocional = precoPromocional;
    }
}
