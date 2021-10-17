import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for(Person person : personList){
            if (person.getId()==id){
                return person;
            }
        }
        return null;
    }

    public Boolean contains(Person person){
        for(Person personInList : personList){
            if (person.getId()==person.getId()){
                return true;
            }
        }
        return false;
    }

    public void remove(Person person){
        if (personList.contains(person)){
            personList.remove(person);
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public double count(){
        return personList.size();
    }

    public Person[] toArray(){
        return (Person[]) personList.toArray();

    }


    @Override
    public Iterator<Person> iterator() {
        return personList.listIterator();
    }


}
