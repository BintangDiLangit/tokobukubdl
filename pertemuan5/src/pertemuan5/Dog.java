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
public class Dog extends Canine{
    private static Dog d = new Dog();
        @Override
    public void makeNoise() {
        picture = "Dog";
        hunger = true;
        if (hunger==true && picture.equals("Cat")) {
            System.out.println(picture+" sedang ricuh di gedung DPR");
        }else{
            System.out.println(picture+" nolep");
        }
    }

    @Override
    public void eat() {
        super.eat(); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        d.eat();
        d.makeNoise();
        d.roam();
    }
}
