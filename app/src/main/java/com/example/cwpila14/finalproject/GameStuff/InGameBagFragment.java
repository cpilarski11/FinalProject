package com.example.cwpila14.finalproject.GameStuff;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.cwpila14.finalproject.R;

/**
 * Created by cwpila14 on 11/13/2016.
 */

public class InGameBagFragment extends Fragment {

    ImageButton bag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.bag_fragment, container, false);

        this.bag = (ImageButton) rootView.findViewById(R.id.YourItems);

        bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BagActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return rootView;
    }
}
