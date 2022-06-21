package midtermexam_versiona_extensioncode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Fundamentals of software design and development
 *
 * @author Matteo Piraino
 */
public class TestUserProfile {
             public static void main(String[] args){
                 UserProfile profile1 = new UserProfile("Matteo","Adventure");
   System.out.println("Account has been created with Name:" + profile1.getUserID() +
           " and favourite genre as:" + profile1.getGenre());
             }
}
