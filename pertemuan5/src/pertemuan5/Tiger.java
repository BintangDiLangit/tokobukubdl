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
public class Tiger extends Feline {

    @Override
    public void makeNoise() {
        super.makeNoise(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        super.eat(); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.picture = "Tiger";
        t.food = "daging onta";
        t.hunger = true;
        t.eat();
        t.makeNoise();
    }
}
