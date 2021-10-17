import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        Person bob = new Person(1,"bob");
        Assert.assertEquals(bob.getId(),1);
        Assert.assertEquals(bob.getName(),"bob");
    }

    @Test
    public void testSetName(){
        Person bob = new Person(1,"bob");
        bob.setName("joey");
        Assert.assertEquals("joey",bob.getName());
    }
}
