package by.yasevich.list;

import java.util.ArrayList;
import java.util.List;

public class ListService {
    private static List <Person> groupList =new ArrayList<>();
    static {
        groupList.add (new Person("anna1", "+1232", "anna@gmail.com"));
        groupList.add (new Person("anna2", "+1232", "anna@gmail.com"));
        groupList.add (new Person("anna3", "+1232", "anna@gmail.com"));
    }
    static public List <Person> retrieveList(){
        return groupList;
    }
    static public void addPerson(Person person) {
        groupList.add(new Person(person));
    }
}
