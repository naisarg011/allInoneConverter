package com.xface.converter.ui.area;

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

import static com.xface.converter.R.id.area1;
import static com.xface.converter.R.id.area2;

public class areaFragment extends Fragment {
    private Spinner S1,S2;
    Button conv;
    TextView tv1, tv2;

    private AreaViewModel mViewModel;

    public static areaFragment newInstance() {
        return new areaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        AreaViewModel areaViewModel= new ViewModelProvider(this).get(AreaViewModel.class);
        View cle2 = inflater.inflate(R.layout.area_fragment, container, false);
        S1 = cle2.findViewById(area1);
        S2 = cle2.findViewById(area2);
        ArrayAdapter<CharSequence> spinnerAdepter = ArrayAdapter.createFromResource(getContext(), R.array.allArea, android.R.layout.simple_spinner_item);
        spinnerAdepter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        S1.setAdapter(spinnerAdepter);
        S2.setAdapter(spinnerAdepter);
        return cle2;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AreaViewModel.class);

    }

}