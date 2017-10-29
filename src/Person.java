public class Person {
    private static final String USER_NAME = "Pesho";
    private String name;
    private Integer age;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void printName(String name){
        System.out.println(this.name);

//    @Override
//    public String toString();
//    return "Pesho";
    }
}
