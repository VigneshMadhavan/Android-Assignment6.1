package com.vigneshtraining.assignment61;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WelcomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WelcomeFragment extends Fragment {

    public static final String NAME = "WelcomeFragment";

    private TextView txtOut;


    public WelcomeFragment() {
        // Required empty public constructor
    }

    public void setMessage(String msg){

        txtOut.setText(msg);

    }


    public static WelcomeFragment newInstance() {
        WelcomeFragment fragment = new WelcomeFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_welcome, container, false);
        txtOut= (TextView) view.findViewById(R.id.txtOut);
        txtOut.setMovementMethod(new ScrollingMovementMethod());

        return view;
    }

}
