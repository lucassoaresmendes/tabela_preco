package com.apptv.tabelaprecos.viewmodels;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.apptv.tabelaprecos.models.ProdutoModel;
import com.apptv.tabelaprecos.services.ProdutoService;

import java.util.List;

public class ProdutoViewModel extends ViewModel {

    private final MutableLiveData<List<ProdutoModel>> produtos = new MutableLiveData<>();

    // Serviço que será usado para buscar dados do backend
    private final ProdutoService produtoService;

    // Construtor do ViewModel
    public ProdutoViewModel(Context context) {
        produtoService = new ProdutoService(context);
        carregarProdutos();
    }

    // Método para carregar os produtos, possivelmente a partir de um serviço
    private void carregarProdutos() {
        List<ProdutoModel> produtosList = produtoService.buscarTodosProdutos();
        produtos.setValue(produtosList); // Atualiza os dados observáveis
    }

    // Método público para expor o LiveData observável na UI
    public LiveData<List<ProdutoModel>> getProdutos() {
        return produtos;
    }

    // Método para recarregar os produtos (pode ser chamado pela UI)
    public void recarregarProdutos() {
        carregarProdutos();
    }
}
