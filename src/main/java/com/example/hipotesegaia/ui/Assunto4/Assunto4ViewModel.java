package com.example.hipotesegaia.ui.Assunto4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hiptesegaia.R;

public class Assunto4ViewModel extends ViewModel {

    private final MutableLiveData<Integer> mText;

    public Assunto4ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.Assunto4);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}