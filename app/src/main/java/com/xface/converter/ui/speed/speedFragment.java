package com.xface.converter.ui.speed;

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

import static com.xface.converter.R.id.speed1;
import static com.xface.converter.R.id.speed2;

public class speedFragment extends Fragment {
    private Spinner spd1,spd2;
    Button conv;
    TextView tv1, tv2;
    private SpeedViewModel mViewModel;

    public static speedFragment newInstance() {
        return new speedFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        SpeedViewModel speedViewModel = new ViewModelProvider(this).get(SpeedViewModel.class);
        View cle9 = inflater.inflate(R.layout.speed_fragment, container, false);
        spd1 = cle9.findViewById(speed1);
        spd2 = cle9.findViewById(speed2);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(getContext(), R.array.allSpeed, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spd1.setAdapter(spinnerAdapter);
        spd2.setAdapter(spinnerAdapter);
        return cle9;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SpeedViewModel.class);
        // TODO: Use the ViewModel
    }

}