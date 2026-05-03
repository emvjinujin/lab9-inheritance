// ─────── 🟢 Core (60 оноо) ───────
// Mage extends Character

public class Mage extends Character {



    public Mage(String name) {
      
        super(name); 
        
        // Mage-ийн стат тохиргоо: Цус бага, Мана их
        this.hp = 80;
        this.maxHp = 80;
        this.mp = 120;
        this.maxMp = 120;
    }


   
    public void castFireball(Character target) {
     
        if (this.mp >= 30) {
            // 2. Манаа зарцуулна
            this.mp -= 30;
            
         
            if (target != null) {
                target.takeDamage(40);
                System.out.println(this.name + " cast Fireball on " + target.getName() + "!");
            }
        } 
        
    }


    @Override
    public String toString() {
        return "🧙 " + super.toString();
    }
}
