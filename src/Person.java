public class Person {

    static String attr;
    static String groupName;
    private String name;
    private int age;
    private String gender;

    public String getName() {

        return this.name;
    }

    public int getAge() {

        return this.age;
    }

    public String getGender() {

        return this.gender;
    }

    public void setName (String name) {

        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

}