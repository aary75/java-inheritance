// Creating the class Animal, Dog, Cat, Bird to show the impact of inheritance

class Animal{
    public String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
       System.out.println("Some general animal sound");
    }

    public void info(){
       System.out.println(name + " with age " + age);
    }
}

// Class Dog
class Dog extends Animal{
     
    public Dog(String name, int age){
       super(name, age);
    }

    @Override
    public void makeSound(){
      System.out.println(name + " bark");
    }
}

// Class Cat
class Cat extends Animal{
      
     public Cat(String name, int age){
        super(name, age);
     }

     public void makeSound(){
         System.out.println(name + " meow");
     }
}

// Class Bird
class Bird extends Animal{
 
    public Bird(String name, int age){
       super(name, age);
    }

    public void makeSound(){
         System.out.println(name + " chirp");
    }
}


// Main class
public class AnimalHierarchy{
    public static void main(String[] args){
      
      // Creating objects
      Dog dog = new Dog("Bruno",2);
      Cat cat = new Cat("Dixcy", 3);
      Bird bird = new Bird("Pigeo",10);

      // functions 
      dog.makeSound();
      dog.info();

      cat.makeSound();
      cat.info();

      bird.makeSound();
      bird.info();
  }
}


// Output: 
// Bruno bark
// Bruno with age 2
// Dixcy meow
// Dixcy with age 3
// Pigeo chirp
// Pigeo with age 10
 
