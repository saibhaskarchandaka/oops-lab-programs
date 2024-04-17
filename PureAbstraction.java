import java.util.*;
interface Animal { 
	 void makeSound(); 
     } 


class Dog implements Animal { 


	public void makeSound() 
	{ 
		System.out.println("Dog - barks"); 
	} 
} 
class Cat implements Animal{
    public void makeSound()
    {
        System.out.println("Cat - meows");
    }
}



public class PartialAbstraction { 
	
	public static void main(String[] args) 
	{ 
		Dog puppy = new Dog(); 
	    Cat kittens = new Cat();
		puppy.makeSound(); 
		kittens.makeSound();
	} 
}
