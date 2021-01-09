package com.xface.converter.ui.angle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.xface.converter.R;
import com.xface.converter.ui.speed.speedFragment;

public class angleFragment extends Fragment {

    private AngleViewModel mViewModel;

    public static speedFragment newInstance() {
        return new speedFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.angle_fragment, container, false);
    }

}