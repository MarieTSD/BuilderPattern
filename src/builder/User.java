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
public class User {
    
    private String email;
    private String name;
    private String lasName;
    private String phone;
    private String address;
    
    private User(){}
    
    User(UserBuilder builder) {
        if (builder.getEmail() == null) {
            throw new IllegalArgumentException("email es requerido");
        }
        this.email = builder.getEmail();
        this.name = builder.getNombre();
        this.lasName = builder.getApellidos();
        this.phone = builder.getTelefono();
        this.address = builder.getDireccion();
    }
   
}
