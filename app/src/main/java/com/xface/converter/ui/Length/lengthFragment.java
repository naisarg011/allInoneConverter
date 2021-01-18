package com.xface.converter.ui.Length;

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

import static com.xface.converter.R.id.length1;
import static com.xface.converter.R.id.length2;

public class lengthFragment extends Fragment {
    private Spinner sl1,sl2;
    Button conv;
    TextView tv1, tv2;
    private LengthViewModel mViewModel;

    public static lengthFragment newInstance() {
        return new lengthFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        LengthViewModel lengthViewModel = new ViewModelProvider(this).get(LengthViewModel.class);
        View cle5 = inflater.inflate(R.layout.length_fragment, container, false);
        sl1 = cle5.findViewById(length1);
        sl2 = cle5.findViewById(length2);
        ArrayAdapter<CharSequence> spAdapter = ArrayAdapter.createFromResource(getContext(),R.array.allLength,android.R.layout.simple_spinner_item);
        spAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sl1.setAdapter(spAdapter);
        sl2.setAdapter(spAdapter);
        return cle5;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(LengthViewModel.class);
        // TODO: Use the ViewModel
    }

}