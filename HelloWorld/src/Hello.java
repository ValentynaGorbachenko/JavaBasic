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
        System.out.println(newPerson.phoneValidate(newPerson.phone));
    }
}
class Person{
    // primitive | protected | public
    public String phone;
    public boolean phoneValidate(String phone){
        boolean valid = true;
        String pattern = "\\(\\d{3}\\)\\d{3}\\-\\d{4}";
        System.out.println("This is from sout "+phone.matches(pattern));
        if (!phone.matches(pattern)){
            valid = false;
        }
        return valid;
    };
    public Person (String phone2){
        this.phone = phone2;
    }
}