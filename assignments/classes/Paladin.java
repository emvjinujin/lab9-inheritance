// ─────── 🟡 Stretch (30 оноо) ───────
// Paladin extends Warrior  (2 түвшний inheritance)
// shieldBash() Warrior-аас аяндаа өвлөгдөнө — дахиж бичихгүй.

public class Paladin extends Warrior {

  
     * @param name Баатрын нэр
    public Paladin(String name) {
        super(name); 
       
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
