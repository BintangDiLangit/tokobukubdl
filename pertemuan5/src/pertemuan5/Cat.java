/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author BintangDiLangit
 */
public class Cat extends Feline{
    private static Cat c = new Cat();
    
    
    public void makeNoise(){
        picture = "Cat";
        hunger = true;
        if (hunger==true && picture.equals("Cat")) {
            System.out.println(picture+" sedang ricuh di gedung DPR");
        }else{
            System.out.println(picture+" nolep");
        }
    }
    
    public void eat(){
        picture = "Cat";
        food = "daging onta";
        hunger = true;
        if (hunger == true) {
            String l = "lapar";
            System.out.println(picture+" yang " + l +" "+ "sedang makan " +food);         
        }else{
            System.out.println("Ga makan");
        }
    }
    public void roam(){
        
    }
    
    public static void main(String[] args) {
        c.makeNoise();
        c.eat();
    }
    
}
