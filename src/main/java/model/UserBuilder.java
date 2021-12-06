/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.IUserBuilder;

/**
 *
 * @author joang
 */
public class UserBuilder implements IUserBuilder{
    private int iduser;
    private String name, lastname, email, password;

    public UserBuilder() {
        iduser = 0; // Valor por default ya que el campo en la db es auto_increment
    }
    
    public UserBuilder withIduser(int iduser) {
        this.iduser = iduser;
        return this;
    }
    
    public UserBuilder withName(String name) {
        this.name = name;
        return this;
    }
    
    public UserBuilder withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }
    
    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }
    
    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public User build() {
        User user = new User();
        
        user.setIduser(this.iduser);
        user.setName(this.name);
        user.setLastname(this.lastname);
        user.setEmail(this.email);
        user.setPassword(this.password);
        
        return user;
    }
    
}
