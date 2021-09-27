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
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    User usuario = new UserBuilder()
        .email("marie.serna@gmail.com")
        .name("Mariela", "Serna")
        .phone("4651046744")
        .address("c\\asdfds").build();  
        System.out.println(usuario.getClass());
  }
    
}
