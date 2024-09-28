package com.apptv.tabelaprecos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.apptv.tabelaprecos.R;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Set up button listeners
        view.findViewById(R.id.btn_contador).setOnClickListener(v -> openCounter());
        view.findViewById(R.id.btn_promocao).setOnClickListener(v -> openPromotions());
        view.findViewById(R.id.btn_tabela_preco).setOnClickListener(v -> openPriceTable());
    }

    private void openCounter() {
        Intent intent = new Intent(getActivity(), ContadorSenhaActivity.class);
        startActivity(intent);
    }

    private void openPromotions() {
        Intent intent = new Intent(getActivity(), PromocaoActivity.class);
        startActivity(intent);
    }

    private void openPriceTable() {
        Intent intent = new Intent(getActivity(), TabelaPrecosActivity.class);
        startActivity(intent);
    }
}
