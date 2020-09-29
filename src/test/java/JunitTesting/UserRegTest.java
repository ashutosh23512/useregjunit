/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JunitTesting;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;

public class UserRegTest {
    @Test 
    public void testSomeLibraryMethod() {
        UserReg classUnderTest = new UserReg();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    public void FirstNameWhenProperTrue()
    {
    	UserReg userValidator = new UserReg();
    	Assert.assertTrue(userValidator.validatefirstname("Ashutosh"));
    }
    public void FirstNameWhenNotProperFalse()
    {
    	UserReg userValidator = new UserReg();
    	Assert.assertTrue(userValidator.validatefirstname("ashutosh"));
    }
    public void LastNameWhenProperTrue()
    {
    	UserReg userValidator = new UserReg();
    	Assert.assertTrue(userValidator.validatelastname("Aggarwal"));
    }
    public void LastNameWhenNotProperFalse()
    {
    	UserReg userValidator = new UserReg();
    	Assert.assertTrue(userValidator.validatelastname("aggarwal"));
    }
    public void EmailWhenProperTrue()
    {
    	UserReg userValidator = new UserReg();
    	Assert.assertTrue(userValidator.validateemail("ashutosh@gmail.com"));
    }
    public void EmailWhenNotProperFalse()
    {
    	UserReg userValidator = new UserReg();
    	Assert.assertTrue(userValidator.validateemail("ashutosh@@gmail.com"));
    }
    public void PhoneNoWhenProperTrue()
    {
    	UserReg userValidator = new UserReg();
    	Assert.assertTrue(userValidator.validatephno("91 9888823512"));
    }
    public void PhoneNoWhenNotProperFalse()
    {
    	UserReg userValidator = new UserReg();
    	Assert.assertTrue(userValidator.validatephno("9198888235122"));
    }
    public void PasswordWhenProperTrue()
    {
    	UserReg userValidator = new UserReg();
    	Assert.assertTrue(userValidator.validatepass("Zxcvbnm@2"));
    }
    public void PasswordWhenNotProperFalse()
    {
    	UserReg userValidator = new UserReg();
    	Assert.assertTrue(userValidator.validatepass("zzzzzzzz"));
    }
    public void whensad() {
    	UserReg userValidator = new UserReg();
       String mood=userValidator.analysemood("This is Sad Message");
       Assert.assertEquals("SAD",mood);
    }
    public void whennotsad() {
    	UserReg userValidator = new UserReg();
       String mood=userValidator.analysemood("This is happy Message");
       Assert.assertEquals("HAPPY",mood);
    }
}
