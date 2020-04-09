package app.Patient;

import app.BloodData.BloodData; 

public class Patient {

    private int idNumber;
    private int age;
    private char bloodType;
    private char rhFactor;

    BloodData bloodInformation = new BloodData();

    public Patient(){
        idNumber = 0;
        age = 0;
        bloodType = bloodInformation.getBloodType();
        rhFactor = bloodInformation.getRhFactor();
    }

    public BloodData() {
        bloodType = 'O';
        rhFactor = '+';
    }

    public BloodData(char bloodType, char rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    /**
     * @param bloodType the bloodType to set
     */
    public void setBloodType(char bloodType) {
        this.bloodType = bloodType;
    }

    /**
     * @param rhFactor the rhFactor to set
     */
    public void setRhFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }

    /**
     * @return the bloodType
     */
    public char getBloodType() {
        return bloodType;
    }

    /**
     * @return the rhFactor
     */
    public char getRhFactor() {
        return rhFactor;
    }

}