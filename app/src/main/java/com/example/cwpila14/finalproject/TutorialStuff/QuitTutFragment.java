package com.example.cwpila14.finalproject.TutorialStuff;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cwpila14.finalproject.R;
import com.example.cwpila14.finalproject.StartScreenStuff.MainActivity;

/**
 * Created by cwpila14 on 11/5/2016.
 */

public class QuitTutFragment extends Fragment {

    Button quit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.quit_tut_fragment, container, false);

        this.quit = (Button) rootView.findViewById(R.id.quit_tut);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                getActivity().startActivity(intent);
            }
        });



        return rootView;
    }
}
