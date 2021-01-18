package com.xface.converter.ui.data;

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

import static com.xface.converter.R.id.data1;
import static com.xface.converter.R.id.data2;

public class dataFragment extends Fragment {
    private Spinner sd1,sd2;
    Button conv;
    TextView tv1, tv2;
    private DataViewModel mViewModel;

    public static dataFragment newInstance() {
        return new dataFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        DataViewModel dataViewModel = new ViewModelProvider(this).get(DataViewModel.class);
        View cle3 = inflater.inflate(R.layout.data_fragment, container, false);
        sd1 = cle3.findViewById(data1);
        sd2 = cle3.findViewById(data2);
        ArrayAdapter<CharSequence> spinnAdapter = ArrayAdapter.createFromResource(getContext(),R.array.allData, android.R.layout.simple_spinner_item);
        spinnAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sd1.setAdapter(spinnAdapter);
        sd2.setAdapter(spinnAdapter);
        return cle3;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DataViewModel.class);

    }

}