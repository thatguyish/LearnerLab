import org.junit.Test;
import org.junit.Assert;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student student = new Student(1,"bob");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(1,"bob");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student(1,"bob");
        student.learn(20);
        Assert.assertEquals(20,student.getTotalStudyTime(),0);
    }
}
