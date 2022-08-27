public class Person implements IPerson{

    private String Name;
    private String Surname;
    private int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Person(String Name, String Surname, int Age){
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
    }
    @Override
    public void introduceYourself() {
        System.out.println("Hi,my name is "+Name + " " +Surname +" and I am " + Age +" years old.");
    }
}
