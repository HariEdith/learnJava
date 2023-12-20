package learnJava.Encapsulation;

class Person {
    private String name;
    private int age;   
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

  
    public void setAge(int age) {
        if (age >= 0) {
        	
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
   }

public class EncapMain {
	public static void main(String[] args) {
        Person person = new Person("Hari", 22);


        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        
    }

}
