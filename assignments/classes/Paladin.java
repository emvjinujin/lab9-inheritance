public class Paladin extends Warrior {

    public Paladin(String name) {
        super(name); // Одоо Warrior(name)-ийг олж чадах тул алдаа заахгүй

        // Paladin-ийн тусгай утгуудыг шинэчилнэ
        this.hp = 180;
        this.maxHp = 180;
    }

    public void heal(int amount) {
        if (amount > 0) {
            this.hp = Math.min(this.maxHp, this.hp + amount);
            System.out.println(this.name + " healed for " + amount + " HP.");
        }
    }
}