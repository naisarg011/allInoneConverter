package com.xface.converter.ui.pressure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.xface.converter.R;

import static com.xface.converter.R.id.pressure1;
import static com.xface.converter.R.id.pressure2;

public class pressureFragment extends Fragment {
    private Spinner spr1,spr2;
    Button conv;
    TextView tv1, tv2;
    private PressureViewModel mViewModel;

    public static pressureFragment newInstance() {
        return new pressureFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        PressureViewModel pressureViewModel = new ViewModelProvider(this).get(PressureViewModel.class);
        View cle8 = inflater.inflate(R.layout.pressure_fragment, container, false);
        spr1 = cle8.findViewById(pressure1);
        spr2 = cle8.findViewById(pressure2);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(getContext(), R.array.allPress, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spr1.setAdapter(spinnerAdapter);
        spr2.setAdapter(spinnerAdapter);
        return cle8;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PressureViewModel.class);
        // TODO: Use the ViewModel
    }

}