/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supershoptask;

/**
 *
 * @author Naima
 */
public class UserPart {
     
    int userId;
    String name;

    public UserPart(String name) {
        this.name = name;
//        userId += 1;
    }

    public  int getUserId() {
        return userId;
    }

    public  void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return   name ;
    }
    
    
    
}
