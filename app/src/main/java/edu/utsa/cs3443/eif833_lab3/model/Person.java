package edu.utsa.cs3443.eif833_lab3.model;

/**
 * @author Eric Lopardi (eif833)
 * UTSA CS 3443 - Lab 3
 * Spring 2023
 * a class for the creation of Avenger real name, height, and weight
 */


abstract class Person {

    private String name;
    private String heightFt;
    private String heightIn;
    private String weight;

    /**
     *
     * @param name Passes the name of the Avenger
     * @param heightFt Passes the height of the Avenger in Feet
     * @param heightIn Passes the height of the Avenger in Inches
     * @param weight Passes the weight of the Avenger
     */
    public Person (String name, String heightFt, String heightIn, String weight) {
        this.name = name;
        this.heightFt = heightFt;
        this.heightIn = heightIn;
        this.weight = weight;
    }

    /**
     *
     * @return returns the name of the Avenger
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Sets the name of the Avenger
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Returns the height of the Avenger in feet
     */
    public String getHeightFt() {
        return heightFt;
    }

    /**
     *
     * @param heightFt Sets the height of the Avenger in feet
     */
    public void setHeightFt(String heightFt) {
        this.heightFt = heightFt;
    }

    /**
     *
     * @return Returns the height of the Avenger in inches
     */
    public String getHeightIn() {
        return heightIn;
    }

    /**
     *
     * @param heightIn Sets the height of the Avenger in inches
     */
    public void setHeightIn(String heightIn) {
        this.heightIn = heightIn;
    }

    /**
     *
     * @return Returns the weight of the Avenger
     */
    public String getWeight() {
        return weight;
    }

    /**
     *
     * @param weight Sets the weight of the Avenger
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     *
     * @return Returns the String of the name, height, and weight of the Avenger
     */
    public String toString() {
        String s = "Name: " + getName() + "Height: " + getHeightFt() + "'" + getHeightIn() + "Weight: " + getWeight();
        return s;
    }
}
