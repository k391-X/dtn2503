package Json;

public class User {
    private String name;
    private int age;
    private String address;
    private String email;

    // Constructor công khai không tham số
    public User() {}

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setAddress(String address) { this.address = address; }
    public void setEmail(String email) { this.email = email; }
}

