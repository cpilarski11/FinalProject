package com.example.cwpila14.finalproject.GameStuff;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.cwpila14.finalproject.R;

/**
 * Created by cwpila14 on 11/13/2016.
 */

public class InGamePokecenterFragment extends Fragment{

    ImageButton pokecenter;
    AlertDialog mDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pokecenter_fragment, container, false);

        this.pokecenter = (ImageButton) rootView.findViewById(R.id.PokeCenter);

        pokecenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("PokeCenter");
                builder.setMessage(R.string.pokecenter_label);
                builder.setCancelable(false);
                builder.setNegativeButton(R.string.thankyou,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // dismiss dialog box
                            }
                        });
                mDialog = builder.show();

            }
        });

        return rootView;
    }
}
