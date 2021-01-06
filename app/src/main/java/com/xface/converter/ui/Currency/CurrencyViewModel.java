package com.xface.converter.ui.Currency;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CurrencyViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public CurrencyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Currency fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}