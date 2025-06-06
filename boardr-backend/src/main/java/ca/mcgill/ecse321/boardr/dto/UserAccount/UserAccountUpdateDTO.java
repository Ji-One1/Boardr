package ca.mcgill.ecse321.boardr.dto.UserAccount;

public class UserAccountUpdateDTO {

    private String name;
    private String email;
    private String password;

    public UserAccountUpdateDTO() {
        // Default constructor needed for JSON deserialization
    }

    public UserAccountUpdateDTO(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
