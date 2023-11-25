package com.example.hipotesegaia.ui.Assunto9;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hipotesegaia.R;

public class Assunto9ViewModel extends ViewModel {

    private final MutableLiveData<Integer> mText;

    public Assunto9ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.Assunto9);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}