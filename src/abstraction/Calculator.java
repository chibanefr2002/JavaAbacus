package abstraction;

public abstract class Calculator implements Abacus {
 public void addNumbers(){
	 System.out.println("we can add two numbers");
 }
 public void substract(){
	 System.out.println("we can substract two numbers");
 }
 public abstract void multiply();
 
 public abstract void division();
 
}
