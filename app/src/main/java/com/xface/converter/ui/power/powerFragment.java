package com.xface.converter.ui.power;

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

import static com.xface.converter.R.id.power1;
import static com.xface.converter.R.id.power2;

public class powerFragment extends Fragment {
    private Spinner spo1,spo2;
    Button conv;
    TextView tv1, tv2;

    private PowerViewModel mViewModel;

    public static powerFragment newInstance() {
        return new powerFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        PowerViewModel powerViewModel = new ViewModelProvider(this).get(PowerViewModel.class);
        View cle7 = inflater.inflate(R.layout.power_fragment, container, false);
        spo1 = cle7.findViewById(power1);
        spo2 = cle7.findViewById(power2);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(getContext(), R.array.allPower, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spo1.setAdapter(spinnerAdapter);
        spo2.setAdapter(spinnerAdapter);
        return cle7;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PowerViewModel.class);
        // TODO: Use the ViewModel
    }

}