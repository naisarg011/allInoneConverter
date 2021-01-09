package com.xface.converter.ui.temperatre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.xface.converter.R;
import com.xface.converter.ui.power.PowerViewModel;

public class tempratureFragment extends Fragment {

    private PowerViewModel mViewModel;


    public static tempratureFragment newInstance() {
       return new tempratureFragment();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.temprature_fragment, container, false);
    }

}