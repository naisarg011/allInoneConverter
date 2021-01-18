package com.xface.converter.ui.temperatre;

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
import com.xface.converter.ui.power.PowerViewModel;

import static com.xface.converter.R.id.temp1;
import static com.xface.converter.R.id.temp2;

public class tempratureFragment extends Fragment {
    private Spinner st1,st2;
    Button conv;
    TextView tv1, tv2;

    private PowerViewModel mViewModel;


    public static tempratureFragment newInstance() {
       return new tempratureFragment();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        TempratureViewModel tempViewModel = new ViewModelProvider(this).get(TempratureViewModel.class);
        View cle0 = inflater.inflate(R.layout.temprature_fragment, container, false);
        st1 = cle0.findViewById(temp1);
        st2 = cle0.findViewById(temp2);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(getContext(), R.array.allTemp, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        st1.setAdapter(spinnerAdapter);
        st2.setAdapter(spinnerAdapter);
        return cle0;
    }

}