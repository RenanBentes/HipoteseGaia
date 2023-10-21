package com.example.hipotesegaia.ui.Assunto1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.hiptesegaia.R;

public class Assunto1ViewModel extends ViewModel {
    private final MutableLiveData<Integer> mText;
    public Assunto1ViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue(R.string.Assunto1);
    }

    public MutableLiveData<Integer> getText() {
        return mText;
    }
}