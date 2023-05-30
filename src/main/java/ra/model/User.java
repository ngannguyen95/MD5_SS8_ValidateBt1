package ra.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Size(min=5, max = 45,message = "firstName from 5 to 45")
    private String firstName;
    @NotEmpty
    @Size(min=5, max = 45,message = "lastName from 5 to 45")
    private String lastName;
    @Min(value = 18,message = "age from 18")
    private int age;
    @Email(message = "Invalid Email")
    private String email;
    @Pattern(regexp = "^0\\d{9}$",message = "Invalid PhoneNumber")
    private String phoneNumber;
    @NotEmpty
    @Min(value = 6,message = "Password from 6 character")
   private String password;
    public User() {
    }

    public User(Long id,
                @NotEmpty
                @Size(min=5, max = 45)
                String firstName,
                @NotEmpty
                @Size(min=5, max = 45)
                String lastName, int age,
                @Email
                String email,
                @Size(min = 2, max = 10)
                String phoneNumber,
                @NotEmpty
                @Min(6)
                String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
