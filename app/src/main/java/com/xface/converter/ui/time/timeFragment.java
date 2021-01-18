package com.xface.converter.ui.time;

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

import static com.xface.converter.R.id.time1;
import static com.xface.converter.R.id.time2;

public class timeFragment extends Fragment {
    private Spinner sti1,sti2;
    Button conv;
    TextView tv1, tv2;
    private TimeViewModel mViewModel;

    public static timeFragment newInstance() {
        return new timeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        TimeViewModel timeViewModel = new ViewModelProvider(this).get(TimeViewModel.class);
        View clet1 = inflater.inflate(R.layout.time_fragment, container, false);
        sti1 = clet1.findViewById(time1);
        sti2 = clet1.findViewById(time2);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(getContext(), R.array.allTime, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sti1.setAdapter(spinnerAdapter);
        sti2.setAdapter(spinnerAdapter);
        return clet1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(TimeViewModel.class);
        // TODO: Use the ViewModel
    }

}