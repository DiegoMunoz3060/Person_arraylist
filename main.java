/**
 * main
 */
/*
 * Activity 3.7.1
 */
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private Integer age;
    private double height;

    public Person(String name, Integer age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getheight(){
      return height;
    }

    public void setheight(double height){
      this.height = height;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age= " + age +
                ", height = " + height +
                '}';
    }
public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin", 47, 5.8));
        people.add(new Person("Chris", 34, 5.7));
        people.add(new Person("Rajeev", 25, 5.5));
        people.add(new Person("David", 31, 6.1));

        System.out.println("Person List : " + people);
    }

  }
}

  