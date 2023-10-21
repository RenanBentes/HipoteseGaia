package com.example.hipotesegaia.ui.Assunto6;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.hiptesegaia.R;

public class Assunto6ViewModel extends ViewModel {

    private final MutableLiveData<Integer> mText;

    public Assunto6ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.Assunto6);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}