/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

public class Player {
    String name;
    int speed,healthPoint,damage,armor;
    
    //method
    void run(){
        System.out.println(name+" is Running ...");  
        System.out.println("Speed "+speed);
    }
    
    void attack(){
        System.out.println(name+" is Attacking");
        System.out.println("Damage :"+damage);
        healthPoint-=damage;
    }
    
    void armor(){
        System.out.println(name +" Get attacked  ");
        System.out.println(   "armor - "+ damage);
        System.out.println("Defend bar : "+armor);
    }
    
    boolean isDead(){
        if(healthPoint<=0)return true;
        return false;
     
    }
    
    
    
       
}
