package com.example.cwpila14.finalproject.BioStuff;

import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cwpila14.finalproject.R;

/**
 * Created by cwpila14 on 11/4/2016.
 */

public class ContinueButtonFragment extends Fragment {

    Button continueButton;
    EditText playerName;
    private String player_name;

    ImageView checkMarkOne;
    ImageView checkMarkTwo;

    BioFragment b = new BioFragment();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.continue_button_fragment, container, false);

        this.continueButton = (Button) rootView.findViewById(R.id.continueButton);

        this.playerName = (EditText) rootView.findViewById(R.id.playerName);
        playerName.setText("");

        this.checkMarkOne = (ImageView) rootView.findViewById(R.id.checkmark1);

        this.checkMarkTwo = (ImageView) rootView.findViewById(R.id.checkmark2);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getActivity(), StarterPokemonActivity.class);
                //getActivity().startActivity(intent);
                if (playerName.getText().toString().equals("")){
                    Toast.makeText(getContext(), "You need to enter a player name", Toast.LENGTH_LONG).show();
                }
                else if (checkMarkOne.getVisibility() == View.INVISIBLE && checkMarkTwo.getVisibility() == View.INVISIBLE){
                    Toast.makeText(getContext(), "You need to select a gender", Toast.LENGTH_LONG).show();
                }
                else {
                    //player_name = playerName.getText().toString();
                    Intent intent = new Intent(getActivity(), StarterPokemonActivity.class);
                    getActivity().startActivity(intent);
                }


            }
        });

        return rootView;
    }

    private boolean isEmpty(EditText myeditText) {
        return myeditText.getText().toString().trim().length() == 0;
    }
}
