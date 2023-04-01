package edu.utsa.cs3443.eif833_lab3.model;

/**
 * @author Eric Lopardi (eif833)
 * UTSA CS 3443 - Lab 3
 * Spring 2023
 * a class for the creation of Avenger alias, location, and power
 */

public class Avenger extends Person {

    private String alias;
    private String location;
    private boolean powers;

    /**
     *
     * @param name Passes the Avengers Real name
     * @param alias Passes the Avenger alias name
     * @param heightFt Passes the height in feet
     * @param heightIn Passes the height in inches
     * @param weight Passes the weight of Avenger
     * @param powers Passes if the Avenger has powers or not
     * @param location Passes the current location of Avenger
     */
    public Avenger(String name, String alias, String heightFt, String heightIn, String weight,
                   boolean powers, String location) {
        super(name, heightFt, heightIn, weight);
        this.alias = alias;
        this.location = location;
        this.powers = powers;
    }

    /**
     *
     * @return returns the Alias of the Avenger
     */
    public String getAlias() {
        return alias;
    }

    /**
     *
     * @return returns the Location of the Avenger
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @return Returns if the Avenger has a power or not
     */
    public boolean isPowers() {
        return powers;
    }

    /**
     *
     * @param alias Sets the alias of the Avenger
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     *
     * @param location Sets the Location of the Avenger
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @param powers Sets the Powers or no Powers of the Avenger
     */
    public void setPowers(boolean powers) {
        this.powers = powers;
    }

    /**
     *
     * @return Returns the String of the Alias, Location, Powers, and Super of the Person class
     */
    public String toString() {
        String s = "Alias: " + getAlias() + "Location: " + getLocation() + "Powers: " + isPowers() + "" + super.toString();
        return s;
    }
}
