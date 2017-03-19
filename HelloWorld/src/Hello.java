/**
 * Created by Valentynka on 3/18/17.
 */
public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, world!");
        int myNum = 12;
        String myName = "Valentyna";
        System.out.println("Hello, "+myName+"!");
        float f = 4.5f;
        Person newPerson = new Person();
    }
}
class Person{
    // primitive | protected | public
    String phone;
}