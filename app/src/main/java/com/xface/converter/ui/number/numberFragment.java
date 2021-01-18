package com.xface.converter.ui.number;

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

import static com.xface.converter.R.id.number1;
import static com.xface.converter.R.id.number2;

public class numberFragment extends Fragment {
    private Spinner sn1,sn2;
    Button conv;
    TextView tv1, tv2;

    private NumberViewModel mViewModel;

    public static numberFragment newInstance() {
        return new numberFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        NumberViewModel numberViewModel = new ViewModelProvider(this).get(NumberViewModel.class);
        View cle6 = inflater.inflate(R.layout.number_fragment, container, false);
        sn1 = cle6.findViewById(number1);
        sn2 = cle6.findViewById(number2);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(getContext(), R.array.allNumber, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sn1.setAdapter(spinnerAdapter);
        sn2.setAdapter(spinnerAdapter);
        return cle6;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(NumberViewModel.class);
        // TODO: Use the ViewModel
    }

}