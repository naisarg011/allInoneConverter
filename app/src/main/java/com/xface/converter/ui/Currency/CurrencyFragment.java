package com.xface.converter.ui.Currency;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.xface.converter.R;

import static com.xface.converter.R.id.text_Curr;

public class CurrencyFragment extends Fragment {
    private Spinner Sp1,sp2;
    private Button conv;
    private TextView tv1,tv2;
    Number mum1;

    public CurrencyFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        com.xface.converter.ui.Currency.CurrencyViewModel currencyViewModel = new ViewModelProvider(this).get(CurrencyViewModel.class);
        View cle = inflater.inflate(R.layout.fragment_currency2, container, false);
        final TextView textView = cle.findViewById(text_Curr);
        currencyViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return cle;



    }
}
