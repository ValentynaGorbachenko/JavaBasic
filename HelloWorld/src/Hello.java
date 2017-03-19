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
        Person newPerson = new Person("(650)302-7126");
        System.out.println(newPerson.phone);
        System.out.println("From the Hello class "+newPerson.phoneValidate(newPerson.phone));
        System.out.println("From the Hello class "+newPerson.phoneValidate("(650)302-7126"));
        System.out.println("From the Hello class "+newPerson.phoneValidate("650-302-7126"));
        System.out.println("From the Hello class "+newPerson.phoneValidate("(650)-302-7126"));
        System.out.println("From the Hello class "+newPerson.phoneValidate("650.302.7126"));
        System.out.println("From the Hello class "+newPerson.phoneValidate("650 302 7126"));
        System.out.println("From the Hello class "+newPerson.phoneValidate("6503027126"));
        System.out.println("From the Hello class "+newPerson.phoneValidate("650 3027126"));
    }
}
