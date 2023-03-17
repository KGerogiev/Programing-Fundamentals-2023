package Exercise.P06OrderByAge;

public class Person {
    private String name;
    private String id;
    private int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
}
