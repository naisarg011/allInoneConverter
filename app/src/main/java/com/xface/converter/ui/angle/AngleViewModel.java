package com.xface.converter.ui.angle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AngleViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public AngleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Angle fragment");
    }
    public LiveData<String> getText() {
        return mText;
    }
}