
package exam1;


public class Exam1 {


    public static void main(String[] args) {
       Person person1 = new Person("Regie", 18, "Philippines");
       
        System.out.println("Original Profile:");
        System.out.println(person1.getName() + "\n" + person1.getAge() + "\n" + person1.getCountry());
        
        person1.setName("Regina");
        person1.setAge(20);
        person1.setCountry("South Korea");
        
        System.out.println("\nModified Profile:");
        System.out.println(person1.getName() + "\n" + person1.getAge() + "\n" + person1.getCountry());
        
    }
    
}
