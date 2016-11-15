package com.example.cwpila14.finalproject.BioStuff;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.cwpila14.finalproject.R;

/**
 * Created by cwpila14 on 11/4/2016.
 */

public class BioFragment extends Fragment {

    ImageView checkMarkOne;
    ImageView checkMarkTwo;
    Boolean selected;

    public boolean genderSelected() {
        return selected;
    }

    ImageButton boy;
    ImageButton girl;

    EditText playerName;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.bio_fragment, container, false);

        this.checkMarkOne = (ImageView) rootView.findViewById(R.id.checkmark1);
        this.checkMarkTwo = (ImageView) rootView.findViewById(R.id.checkmark2);

        this.boy = (ImageButton) rootView.findViewById(R.id.boy);
        this.girl = (ImageButton) rootView.findViewById(R.id.girl);

        this.playerName = (EditText) rootView.findViewById(R.id.playerName);

        checkMarkOne.setVisibility(View.INVISIBLE);
        checkMarkTwo.setVisibility(View.INVISIBLE);
        selected = false;

        boy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selected = true;
                checkMarkOne.setVisibility(View.VISIBLE);
                checkMarkTwo.setVisibility(View.INVISIBLE);

            }
        });

        girl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selected = true;
                checkMarkOne.setVisibility(View.INVISIBLE);
                checkMarkTwo.setVisibility(View.VISIBLE);
            }
        });

        return rootView;
    }




}
