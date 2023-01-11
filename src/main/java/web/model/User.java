package web.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Table(name = "mydbtest.users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //@NotEmpty (message = "Please, enter your name")
    @Size(max = 40, message = "name must be from 2 to 40 symbols")
    private String name;

    //@NotEmpty (message = "Please, enter your surname")
    @Size(max = 40, message = "surname must be from 2 to 40 symbols")
    private String lastname;
    //@NotEmpty
    @Min(0)
    @Max(120)
    private int age;

    /*@NotEmpty (message = "Please, enter your email")
    @Size(max = 100, min = 5, message = "e-mail is not correct")
    @Email (message = "e-mail is not valid")*/
    private String email;

   // @NotEmpty (message = "Please, enter you password")
    @Size(max = 30, message = "password must be from 2 to 30 symbols")
    private String password;


    public User() {
    }
    public User(int id, String name, String lastname, int age, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
