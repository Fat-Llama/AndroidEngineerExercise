package uk.co.connorglennon.androidengineerexercise;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import uk.co.connorglennon.androidengineerexercise.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountDetailsFragment extends Fragment {


    public AccountDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_account_details, container, false);
    }

}
