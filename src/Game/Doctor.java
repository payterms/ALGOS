package Game;

import java.util.Random;

class Doctor extends Hero {


    public Doctor(int heal, String name, int damage, int addHeal) {
        super(heal, name, damage, addHeal);
    }

    public Doctor(String name) {
        super(name,new Random().nextInt(50));
    }

    @Override
    void hit(Hero hero) {
        System.out.println("Доктор не может бить!");
    }

    @Override
    void healing(Hero hero) {
        hero.addHealth(addHeal);
    }
}
