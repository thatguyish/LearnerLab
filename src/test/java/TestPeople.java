import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        Student student1 = new Student(1,"bob");
        Student student2 = new Student(2,"jane");
        People people = new People();
        people.add(student1);
        people.add(student2);
        Assert.assertEquals(2,people.count(),0);
    }
    @Test
    public void testRemove(){
        Student student1 = new Student(1,"bob");
        Student student2 = new Student(2,"jane");
        People people = new People();
        people.add(student1);
        people.add(student2);
        people.remove(student1);
        Assert.assertEquals(1,people.count(),0);
    }
    @Test
    public void testFindById(){
        Student student1 = new Student(1,"bob");
        Student student2 = new Student(2,"jane");
        People people = new People();
        people.add(student1);
        people.add(student2);
        Assert.assertEquals(student1,people.findById(1));
    }

}
