package com.example.hipotesegaia.ui.Assunto8;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hiptesegaia.R;

public class Assunto8ViewModel extends ViewModel {

    private final MutableLiveData<Integer> mText;

    public Assunto8ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.Assunto8);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}