package com.example.hipotesegaia.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("   O Projeto Hipótese de Gaia tem o objetivo de compartilhar o conhecimento Científico das Ciências Exatas e da Terra." );
    }

    public LiveData<String> getText() {
        return mText;
    }
}