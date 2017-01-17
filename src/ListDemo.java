import java.util.*;

/**
 * Created by Brian on 1/17/17.
 */
public class ListDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        Student bob = new Student("Bob", "Bobberson", 44);
        Student jane = new Student("Jane", "Janeway", 33);
        Student pat = new Student("Pat", "Pathews", 44);

        // arrayList of students
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(bob);
        students.add(jane);
        students.add(pat);

        // iterating across an arrayList with a for loop
        int total = 0;
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getFirstName());
            total += students.get(i).getAge();
        }
        System.out.println("Average is " + (total / students.size()));

        // example of using iterator syntax to iterate across an ArrayList
        Iterator studentIterator = students.iterator();
        while(studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }

        // create a new map, storing the arrayList to the "students" key on the map
        Map codeupPeople = new HashMap();
        codeupPeople.put("students", students);

        // iterating across a Map using the iterator object
        // iterator object iterates any collection
        Iterator entries = codeupPeople.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            String key = (String)entry.getKey();
            List value = (List)entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
        }
    }
}
