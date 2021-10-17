public class MainApp {
    public static void main(String[] args) {
        Student student1 = new Student(1,"bob");
        Student student2 = new Student(2,"joe");
        Student student3 = new Student(3,"joey");

        People people = new People();
        people.add(student1);
        people.add(student2);
        people.add(student3);

        for (Person person : people){
            System.out.println(person.getId());
        }

    }
}
