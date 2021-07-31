package bodymasscalculator;

import java.util.Scanner;

public class BodyMassIndex extends BMISkeleton{
    static Person p;
    @Override
    public void createPersonObject(){
        
        
    }

    
    public  void displayBMI(float mass) {
        if(mass >= 16 && mass < 18.5)
            System.out.println("You are Considered as Underwweight.");
        else if(mass >= 18.5 && mass <25)
            System.out.println("You are Considered as Heavy.");
        else if(mass >=25 && mass < 30)
            System.out.println("You are Considered as Overweight.");
        else if(mass >= 30)
            System.out.println("You are Considered as Obese.");   
    }
    public static void main(String [] args){
        BodyMassIndex bmi = new BodyMassIndex();
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your first name?  ");
        String name = sc.next();
        System.out.print("How much do you weigh(in pounds)? ");
        float weight = sc.nextFloat();
        System.out.print("How tall are you(in inches)? ");
        float height = sc.nextFloat();
        Person p = new Person();
        p.setName(name);
        p.setHeight(height);
        p.setWeight(weight);
        System.out.println(p);
        bmi.displayBMI(p.calculateBMI());
        
            
    }
    
    
}
