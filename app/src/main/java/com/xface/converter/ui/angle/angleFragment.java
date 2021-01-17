package com.xface.converter.ui.angle;

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

import static com.xface.converter.R.id.angle1;
import static com.xface.converter.R.id.angle2;

public class angleFragment extends Fragment {
    private Spinner s1,s2;
    Button conv;
    TextView tv1, tv2;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        AngleViewModel angleViewModel = new ViewModelProvider(this).get(AngleViewModel.class);
        View cle1 = inflater.inflate(R.layout.angle_fragment, container, false);
        s1 = cle1.findViewById(angle1);
        s2 = cle1.findViewById(angle2);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(getContext(), R.array.allangle, android.R.layout.simple_spinner_item);
       spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
       s1.setAdapter(spinnerAdapter);
       s2.setAdapter(spinnerAdapter);
        return cle1;

    }

}