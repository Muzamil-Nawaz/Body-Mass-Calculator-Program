package bodymasscalculator;
public abstract class BMISkeleton {
    // Implement this method to make a Person class object and get input of its instances and set them by setters.
     public abstract void createPersonObject();

    /**
     *
     * @param mass
     * this parameter is here passed to provide the additional info about Person regarding calculated BMI.
     */
    public abstract void displayBMI(float mass);
}
