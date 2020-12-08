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
public class Hippo extends Animal {


    public static void main(String[] args) {
        Hippo h = new Hippo();
        h.picture = "Hippo";
        h.food = "daun";
        h.hunger = false;
        h.eat();
        h.makeNoise();
    }
}
