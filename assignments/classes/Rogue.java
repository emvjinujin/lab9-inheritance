// ─────── 🟢 Core (60 оноо) ───────
// Rogue extends Character
// ─────── 🔴 Bonus (10 оноо) ───────
// Rogue класс FINAL байх ёстой. Жишээ: "public final class Rogue ..."

public final class Rogue extends Character {

 
    public Rogue(String name) {
       
        super(name);
        
        this.hp = 100;
        this.maxHp = 100;
        this.mp = 40;
        this.maxMp = 40;
    }

    
    public void sneakAttack(Character target) {
        if (target != null) {
            target.takeDamage(50);
            System.out.println(this.name + " performed a Sneak Attack on " + target.getName() + "!");
        }
    }
}
