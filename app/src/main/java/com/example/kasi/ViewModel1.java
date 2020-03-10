package com.example.kasi;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class ViewModel1 extends AndroidViewModel {

    private ListaRepository listaRepository;

    LiveData<List<MyEntity>> listLiveData;

    public ViewModel1(@NonNull Application application) {
        super(application);
        this.listaRepository = new ListaRepository(application);
        this.listLiveData = listaRepository.haeLista();

    }
    public void insert(String teksti) {listaRepository.insert(teksti);}
}