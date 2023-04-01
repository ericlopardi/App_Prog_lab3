package com.example.eif833_lab3new;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import edu.utsa.cs3443.eif833_lab3.controller.AvengersController;

/**
 * @author Eric Lopardi (eif833)
 * UTSA CS 3443 - Lab 3
 * Spring 2023
 *
 */

public class MainActivity extends AppCompatActivity {

    /**
     *  Creation of the buttons for the application
     * @param savedInstanceState Parameter for the bundle class
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AvengersController spiderMan = new AvengersController("Spiderman");
        AvengersController hulk = new AvengersController("Hulk");
        AvengersController captainAmerica = new AvengersController("Captain America");
        AvengersController godOfThunder = new AvengersController("God Of Thunder");

        Button spiderManButton = findViewById(R.id.Spidermanbutton);
        Button hulkButton = findViewById(R.id.Hulkbutton);
        Button captainAmericaButton = findViewById(R.id.CaptainAmericabutton);
        Button thorButton = findViewById(R.id.Thorbutton);

        spiderManButton.setOnClickListener(spiderMan);
        hulkButton.setOnClickListener(hulk);
        captainAmericaButton.setOnClickListener(captainAmerica);
        thorButton.setOnClickListener(godOfThunder);
    }
}