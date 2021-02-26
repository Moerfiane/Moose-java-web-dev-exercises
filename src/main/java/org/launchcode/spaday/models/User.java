package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {
    @NotBlank(message="Cannot be blank")
    @Size(min=6, max=14, message="This has gotta be between 5-15 chars")
    private String username;
    @Email(message="Must be a valid email address")
    private String email;
    @NotBlank(message="Cannot be blank")
    @Size(min=6, message="This must have 6 chars")
    private String password;
    @NotBlank(message="Cannot be blank")
    private String verify;


    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
