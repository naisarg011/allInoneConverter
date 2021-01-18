package com.xface.converter.ui.energy;

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

import static com.xface.converter.R.id.energy1;
import static com.xface.converter.R.id.energy2;

public class energyFragment extends Fragment {
    private Spinner se1,se2;
    Button conv;
    TextView tv1, tv2;
    private EnergyViewModel mViewModel;

    public static energyFragment newInstance() {
        return new energyFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       EnergyViewModel energyViewModel = new ViewModelProvider(this).get(EnergyViewModel.class);
        View cle4 = inflater.inflate(R.layout.energy_fragment, container, false);
        se1 = cle4.findViewById(energy1);
        se2 = cle4.findViewById(energy2);
        ArrayAdapter<CharSequence> spinAdapter = ArrayAdapter.createFromResource(getContext(),R.array.allEnergy, android.R.layout.simple_spinner_item);
        spinAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        se1.setAdapter(spinAdapter);
        se2.setAdapter(spinAdapter);
        return cle4;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(EnergyViewModel.class);
        // TODO: Use the ViewModel
    }

}