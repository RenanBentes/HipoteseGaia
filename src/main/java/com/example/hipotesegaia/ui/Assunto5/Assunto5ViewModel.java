package com.example.hipotesegaia.ui.Assunto5;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hiptesegaia.R;

public class Assunto5ViewModel extends ViewModel {

    private final MutableLiveData<Integer> mText;

    public Assunto5ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.Assunto5);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}