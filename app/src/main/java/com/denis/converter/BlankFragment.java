package com.denis.converter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class BlankFragment extends Fragment {

    EditText edit1;
    Button btnUsdtoUan;
    Button btnEurtoUsd;
    Button btnEurtoUan;
    Button btnUantoEur;
    Button btnUantoUsd;
    Button btnUsdtoEur;
    TextView tvRes;

    public BlankFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        edit1 = (EditText) view.findViewById(R.id.edit1);
        btnUsdtoUan = (Button) view.findViewById(R.id.btnUsdtoUan);
        btnEurtoUsd = (Button) view.findViewById(R.id.btnEurtoUsd);
        btnEurtoUan = (Button) view.findViewById(R.id.btnEurtoUan);
        btnUantoEur = (Button) view.findViewById(R.id.btnUantoEur);
        btnUantoUsd = (Button) view.findViewById(R.id.btnUantoUsd);
        btnUsdtoEur = (Button) view.findViewById(R.id.btnUsdtoEur);
        tvRes = (TextView) view.findViewById(R.id.tvRes);
        btnUsdtoUan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1)*28.3;
                    String s3 = String.format(s1+" USD to UAH = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(container.getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });

        btnEurtoUsd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res =Double.parseDouble(s1)*1.19;
                    String s3 = String.format(s1+" EUR to USD = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(container.getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });
        btnEurtoUan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res =Double.parseDouble(s1)*33.54;
                    String s3 = String.format(s1+" EUR to UAN = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(container.getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });

        btnUantoEur.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res =Double.parseDouble(s1)*0.03;
                    String s3 = String.format(s1+" UAH to EUR = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(container.getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });

        btnUantoUsd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res =Double.parseDouble(s1)*0.035;
                    String s3 = String.format(s1+" UAH to USD = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(container.getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });

        btnUsdtoEur.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res =Double.parseDouble(s1)*0.84;
                    String s3 = String.format(s1+" USD to EUR = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(container.getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });

        return view;
    }
}