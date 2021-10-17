import org.junit.Test;
import org.junit.Assert;
public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(1,"bob");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(1,"bob");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(1,"bob");
        Student student = new Student(1,"joe");
        instructor.teach(student,20);

        Assert.assertEquals(20,student.getTotalStudyTime(),0);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(1,"bob");
        Student student1 = new Student(1,"joe");
        Student student2 = new Student(2,"samantha");
        Student[] students = {student1,student2};
        instructor.lecture(students,20);

        Assert.assertEquals(10,student1.getTotalStudyTime(),0);
        Assert.assertEquals(10,student2.getTotalStudyTime(),0);
    }
}
