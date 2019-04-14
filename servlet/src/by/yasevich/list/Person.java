package by.yasevich.list;

public class Person {
    String name;
    String phone;
    String email;

    public Person(){}

    public Person (String name, String phone, String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
    public Person(Person person) {
        name = person.name;
        phone = person.phone;
        email = person.email;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name:   "+ name + "    .Login : ." +phone+ "    Password: " +email;
    }
}
