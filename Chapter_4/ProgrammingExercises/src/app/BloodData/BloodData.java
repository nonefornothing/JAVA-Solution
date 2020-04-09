package app.BloodData;

public class BloodData {

    private char bloodType;
    private char rhFactor;

    public BloodData() {
        bloodType = 'O';
        rhFactor = '+';
    }

    public BloodData(char bloodType,char rhFactor){
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