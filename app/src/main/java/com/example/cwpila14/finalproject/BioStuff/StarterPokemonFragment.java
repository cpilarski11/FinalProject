package com.example.cwpila14.finalproject.BioStuff;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.cwpila14.finalproject.GameStuff.MainGameActivity;
import com.example.cwpila14.finalproject.R;

/**
 * Created by cwpila14 on 11/4/2016.
 */

public class StarterPokemonFragment extends Fragment {

    private String fire;
    private String water;
    private String grass;

    ImageButton bulb;
    ImageButton charm;
    ImageButton squir;

    private String starter;
    private AlertDialog mDialog;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.starter_pokemon_fragment, container, false);

        fire = "Charmander";
        water = "Squirtle";
        grass = "Bulbasaur";

        this.bulb = (ImageButton) rootView.findViewById(R.id.Bulbasaur);
        this.squir = (ImageButton) rootView.findViewById(R.id.Squirtle);
        this.charm = (ImageButton) rootView.findViewById(R.id.Charmander);

        bulb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starter = grass;

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Choose Your Pokemon!");
                builder.setMessage(R.string.grass_pokemon);
                builder.setCancelable(false);
                builder.setNegativeButton(R.string.cancel_label,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // dismiss dialog box
                            }
                        });
                // show the dialog
                builder.setPositiveButton(R.string.choose_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getActivity(), MainGameActivity.class);
                        getActivity().startActivity(intent);
                    }
                });
                //mDialog.setTitle("About the Game");
                mDialog = builder.show();

            }
        });

        squir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starter = water;
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Choose Your Pokemon!");
                builder.setMessage(R.string.water_pokemon);
                builder.setCancelable(false);
                builder.setNegativeButton(R.string.cancel_label,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // dismiss dialog box
                            }
                        });
                // show the dialog
                builder.setPositiveButton(R.string.choose_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getActivity(), MainGameActivity.class);
                        getActivity().startActivity(intent);
                    }
                });
                //mDialog.setTitle("About the Game");
                mDialog = builder.show();
            }
        });

        charm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starter = fire;

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Choose Your Pokemon!");
                builder.setMessage(R.string.fire_pokemon);
                builder.setCancelable(false);
                builder.setNegativeButton(R.string.cancel_label,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // dismiss dialog box
                            }
                        });
                // show the dialog
                builder.setPositiveButton(R.string.choose_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getActivity(), MainGameActivity.class);
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
