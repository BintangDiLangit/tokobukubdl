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
public class Animal {
    String picture;
    String food;
    boolean hunger;
    String boundaries;
    String location;
    
    public void makeNoise(){
        System.out.println("Kucinge bengok2");
    }
    public void eat(){
        if (hunger == true) {
            String l = "lapar";
            System.out.print(picture+" yang " + l +" "+ "sedang makan " +food);         
        }else{
            System.out.println("Ga makan");
        }
    }
    public void sleep(){
        System.out.println(picture +" suka rebahan di "+location);
    }
    public void roam(){
        System.out.println(picture + " sedang "+boundaries+ " untuk menandai daerah kekuasaannya");
        
    }
}
