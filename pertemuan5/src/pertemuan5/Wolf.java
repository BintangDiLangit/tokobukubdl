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
public class Wolf extends Canine {

    @Override
    public void makeNoise() {
        super.makeNoise(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        super.eat(); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        Wolf w = new Wolf();
        w.picture = "Tiger";
        w.food = "daging onta";
        w.hunger = true;
        w.eat();
        w.makeNoise();
    }
}
