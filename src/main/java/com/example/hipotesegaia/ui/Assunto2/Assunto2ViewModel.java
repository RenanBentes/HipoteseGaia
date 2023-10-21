package com.example.hipotesegaia.ui.Assunto2;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hiptesegaia.R;

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