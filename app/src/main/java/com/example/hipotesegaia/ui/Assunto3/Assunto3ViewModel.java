package com.example.hipotesegaia.ui.Assunto3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.hipotesegaia.R;

public class Assunto3ViewModel extends ViewModel {

    private final MutableLiveData<Integer> mText;

    public Assunto3ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.Assunto3);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}