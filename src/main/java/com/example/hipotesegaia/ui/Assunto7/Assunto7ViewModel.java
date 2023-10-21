package com.example.hipotesegaia.ui.Assunto7;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.hiptesegaia.R;

public class Assunto7ViewModel extends ViewModel {

    private final MutableLiveData<Integer> mText;

    public Assunto7ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.Assunto7);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}