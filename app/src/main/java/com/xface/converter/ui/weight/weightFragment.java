package com.xface.converter.ui.weight;

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

import static com.xface.converter.R.id.weight1;
import static com.xface.converter.R.id.weight2;

public class weightFragment extends Fragment {

    private WeightViewModel mViewModel;
    private Spinner sw1,sw2;
    Button conv;
    TextView tv1, tv2;
    public static weightFragment newInstance() {
        return new weightFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        WeightViewModel weightViewModel = new ViewModelProvider(this).get(WeightViewModel.class);
        View clew = inflater.inflate(R.layout.weight_fragment, container, false);
        sw1 = clew.findViewById(weight1);
        sw2 = clew.findViewById(weight2);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(getContext(), R.array.allWeight, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sw1.setAdapter(spinnerAdapter);
        sw2.setAdapter(spinnerAdapter);
        return clew;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(WeightViewModel.class);
        // TODO: Use the ViewModel
    }

}