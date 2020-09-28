package com.PenguinGangT2.Backend.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    @Id
    private String id;

    @NotBlank
    @Size(max = 30)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(max = 40)
    private String password;

    @NotBlank
    private int accountPoints;

    public String getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return username;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public int getAccountPoint(){
        return accountPoints;
    }
    public void setUsername(int accountPoints){
        this.accountPoints = accountPoints;
    }

    


    
}