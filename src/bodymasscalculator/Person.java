package bodymasscalculator;

import java.text.DecimalFormat;

public class Person extends PersonSkeleton{
    float weight,height;
    String name;
    Person(){
        
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public String getName(){
        return this.name;
    }
    public float getWeight(){
        return this.weight;
    }
    public float getHeight(){
        return this.height;
    }
    public String toString(){
        DecimalFormat df = new DecimalFormat("#0.00");
        String s=name+" weights:"+getWeight()+" and "+getHeight()+" tall \n Your BMI is "+df.format(calculateBMI());
        
        return s;
    }
    public float calculateBMI(){
        float mass =0;
        mass = (weight/(height*height))*703;
        return mass;
        
    }

    
}
