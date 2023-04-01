package edu.utsa.cs3443.eif833_lab3.controller;
import android.widget.Toast;
import android.view.View;
import java.io.IOException;
import edu.utsa.cs3443.eif833_lab3.model.Team;

/**
 * @author Eric Lopardi (eif833)
 * UTSA CS 3443 - Lab 3
 * Spring 2023
 *
 */

public class AvengersController implements View.OnClickListener {
    String alias;

    /**
     *
     * @param a this parameter passes a String
     */
    public AvengersController (String a) {
        this.alias = a;
    }

    /**
     *
     * @param view this parameter creates the view class
     */
    public void onClick(View view) {
        Team newTeam = new Team(view.getContext());
        try {
            newTeam.loadAvengers();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast t = Toast.makeText(view.getContext(), newTeam.getAvenger(alias).getLocation() , Toast.LENGTH_SHORT);
        t.show();
    }
}
