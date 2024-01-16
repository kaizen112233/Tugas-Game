/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;
public class Game {
    public static void main(String[] args) {
        Player hero = new Player();
        Player vigo = new Player();
        
        hero.name = "Adi";
        hero.speed = 60;
        hero.healthPoint = 0;
        
        vigo.name = "vigo";
        vigo.speed = 60;
        vigo.healthPoint = 0;
        vigo.damage = 55;
        
        
        vigo.run();
        vigo.attack();
        vigo.armor= 0;
        vigo.armor();
        
        
        if(hero.isDead()){
            System.out.println("Game Over");
        }
        
    }
    
}
