package Unit21;


public class Dog 
{
    String name, breed; //vars
    
    //constructor
    public Dog() {
    }
    public Dog(String n, String b) {
        
    name = n;
    breed = b;
    
    }
    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    
    
}
