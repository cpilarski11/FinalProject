package com.example.cwpila14.finalproject.StartScreenStuff;

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

import com.example.cwpila14.finalproject.BioStuff.BioActivity;
import com.example.cwpila14.finalproject.R;
import com.example.cwpila14.finalproject.TutorialStuff.TutorialActivity;

/**
 * Created by cwpila14 on 11/1/2016.
 */

public class StartupFragment extends Fragment {

    private Button newGame = null;
    private Button about = null;
    private AlertDialog mDialog = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.button_fragment, container, false);

        this.newGame = (Button) rootView.findViewById(R.id.StartButton);
        this.about = (Button) rootView.findViewById(R.id.AboutButton);

        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BioActivity.class);
                getActivity().startActivity(intent);

            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("About the Game");
                builder.setMessage(R.string.About);
                builder.setCancelable(false);
                builder.setNegativeButton(R.string.ok_label,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // dismiss dialog box
                            }
                        });
                // show the dialog
                builder.setPositiveButton(R.string.tutorial_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getActivity(), TutorialActivity.class);
                        getActivity().startActivity(intent);
                    }
                });
                //mDialog.setTitle("About the Game");
                mDialog = builder.show();

            }
        });

        return rootView;
    }
}
