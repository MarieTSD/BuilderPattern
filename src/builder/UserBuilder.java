/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author marie
 */
public class UserBuilder {
    
    private String email;
    private String name;
    private String lasName;
    private String phone;
    private String address;
    
    public UserBuilder() {
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder name(String name, String lasName) {
        this.name = name;
        this.lasName = lasName;
        return this;
    }

    public UserBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(this);
    }
    
    // Getters
    public String getEmail() {
        return email;
    };
    
    public String getNombre() {
        return name;
    };
    
    public String getApellidos() {
        return lasName;
    };
    
    public String getTelefono() {
        return phone;
    };
    
    public String getDireccion() {
        return address;
    };
    
}
