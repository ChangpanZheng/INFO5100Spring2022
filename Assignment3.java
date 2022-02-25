import java.util.ArrayList;

public class Assignment3 {
    public static void main(String[] args) {

        // In the main function create one instance of SeattlePoliceDepartment This will be publisher
        SeattlePoliceDepartment spd = new SeattlePoliceDepartment();

        // Create 3-4 instances of person.
        Person alice = new Person("Alice", 18);
        Person bruce = new Person("Bruce", 19);
        Person cindy = new Person("Cindy", 20);
        Person david = new Person("David", 21);

        // Subscribe some persons to SeattlePoliceDepartment
        alice.subscribe(spd);
        bruce.subscribe(spd);
        cindy.subscribe(spd);
        david.subscribe(spd);

        // Publish a message from SeattlePoliceDepartment
        spd.NotifyCitizens("Attention! A Robbery is happened on 5th Ave!!");

        // Unsubscribe 1 or 2 users from SeattlePoliceDepartment
        alice.unsubscribe(spd);
        bruce.unsubscribe(spd);

        // Publish the message again.
        spd.NotifyCitizens("Attention! A Robbery is happened on 5th Ave!!");
    }
}
// Create a class called SeattlePoliceDepartment
class SeattlePoliceDepartment {
    ArrayList<Person> people;
    String s;

    public SeattlePoliceDepartment() {
        this.people = new ArrayList<Person>();
    }

    // Create a method called NotifyCitizens which will take a String as argument. This string will be any public notification they want all the citizens to know about
    public void NotifyCitizens(String s) {
        this.s = s;
        for (Person p : people) {
            p.getNotify(this);
        }
    }
}

// Create a class called Person, which will have Name and age as properties. also create a subscribe and unsubscribe functions which will take SeattlePoliceDepartment as argument. Create a method getNotification which will take SeattlePoliceDepartment as argument
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void subscribe(SeattlePoliceDepartment spd) {
        if (!spd.people.contains(this)) {
            spd.people.add(this);
        }
    }

    public void unsubscribe(SeattlePoliceDepartment spd) {
        if (spd.people.contains(this)) {
            spd.people.remove(this);
        }
    }

    public void getNotify(SeattlePoliceDepartment spd) {
        System.out.println("******************************");
        System.out.println("Hi," + this.getName() + "! A Message from Seattle Police Department:");
        System.out.println(spd.s);
        System.out.println("******************************");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
