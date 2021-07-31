package bodymasscalculator;

abstract class PersonSkeleton {
    // Formula for calculating BodyMassIndex of a Person is weight(lb)/height(inches) * 703(to convert in kg/m2).
    //( weight in pounds divided by height in inches squares) .
    abstract float calculateBMI();
    
}
