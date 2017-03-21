import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest{
    @Test
    public static void testphoneValidate(){
        Person newPerson = new Person("6503027126");
        boolean result = newPerson.phoneValidate(newPerson.phone);
        // assertEquals(true, result);
        assertTrue(result);
        /*
        assertArrayEquals()
        assertEquals()
        assertTrue() + assertFalse()
        assertNull() + assertNotNull()
        assertSame() and assertNotSame()
        assertThat()
        */
        /*
        any()	Matches anything
        is()	A matcher that checks if the given objects are equal.
        describedAs()	Adds a descrption to a Matcher
        allOf()	Takes an array of matchers, and all matchers must match the target object.
        anyOf()	Takes an array of matchers, and at least one of the matchers must report that it matches the target object.
        not()	Negates the output of the previous matcher.
        equalTo()	A matcher that checks if the given objects are equal.
        instanceOf()	Checks if the given object is of type X or is compatible with type X
        notNullValue() + nullValue()	Tests whether the given object is null or not null.
        sameInstance()	Tests if the given object is the exact same instance as another.
         */
    }
}