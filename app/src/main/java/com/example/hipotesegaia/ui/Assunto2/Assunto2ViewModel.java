package com.example.hipotesegaia.ui.Assunto2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hipotesegaia.R;

public class Assunto2ViewModel extends ViewModel {

    private final MutableLiveData<Integer> mText;
    public Assunto2ViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue(R.string.Assunto2);
    }

    public MutableLiveData<Integer> getText() {
        return mText;
    }
}