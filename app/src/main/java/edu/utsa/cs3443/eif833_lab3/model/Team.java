package edu.utsa.cs3443.eif833_lab3.model;

/**
 * @author Eric Lopardi (eif833)
 * UTSA CS 3443 - Lab 3
 * Spring 2023
 * a class for loading the Avengers from the csv file
 */

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Team {

    ArrayList<Avenger> team;
    Context context;

    /**
     * Constructor that passes a context
     */
    public Team (Context c) {
        team = new ArrayList<Avenger>();
        this.context = c;
    }

    /**
     * Loads the Avengers from the CSV file
     * @throws IOException
     */
    public void loadAvengers() throws IOException {
        InputStream inputStreamObj = context.getAssets().open("data.csv");
        BufferedReader bRead = new BufferedReader(new InputStreamReader(inputStreamObj));
        String flLine = bRead.readLine();
        while (flLine != null) {
            Avenger avenger;
            String[] label = flLine.split(",");
            avenger = new Avenger(label[0], label[1], label[3], label[4], label[5], Boolean.parseBoolean(label[6]), label[7]);
            team.add(avenger);
            flLine = bRead.readLine();
            }
            bRead.close();

    }

    /**
     * Gets the Avengers through iterations of loop
     * @param alias passes the Alias of the Avenger entered
     * @return returns the value
     */
    public Avenger getAvenger(String alias) {
        int saveValue = 0;
        int iter = 0;
        while (iter < team.size()) {
            if (team.get(iter).getAlias().equalsIgnoreCase(alias)) {
                saveValue = iter;
                break;
            }
            iter++;
        }
        return team.get(saveValue);
    }

    /**
     *
     * @return returns the String of the Team of the Avengers
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < team.size(); i++) {
            s += team.get(i).toString();
        }
        return s;
    }
}
