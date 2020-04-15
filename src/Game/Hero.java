package Game;

import java.util.Random;

abstract class Hero {

    protected int health;
    protected String name;
    protected int damage;
    protected int addHeal;
    Random random = new Random();

    public Hero(int health, String name, int damage, int addHeal) {
        this.health = health;
        this.name = name;
        this.damage = damage;
        this.addHeal = addHeal;
    }

    public Hero(String name, int addHeal) {
        this.health = 300 - random.nextInt(100);
        this.name = name;
        this.damage = 0;
        this.addHeal = addHeal;
    }

    public Hero(String name) {
        this.health = 300 - random.nextInt(100);
        this.name = name;
        this.damage = 100 - random.nextInt(100);
        this.addHeal = 100 - random.nextInt(100);
    }

    abstract void hit(Hero hero);

    abstract void healing(Hero hero);

    void causeDamage(int damage) {
        if(health < 0) {
            System.out.println("Герой уже мертвый!");
        } else {
            health -= damage;
        }

    }

    public int getHealth() {
        return health;
    }

    void addHealth(int health) {
        this.health += health;
    }

    void info() {

        System.out.println(name + " " + (health < 0 ? "Герой мертвый" : health) + " " + damage + " " + addHeal);
    }
}
