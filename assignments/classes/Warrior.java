// ─────── 🟢 Core (60 оноо) ───────
// Warrior extends Character

public class Warrior extends Character {

    // 1. shielded хувьсагч - default утга нь false
    protected boolean shielded = false;

    // 2. Байгуулагч (Constructor)
    public Warrior(String name) {
        // Character(name) байгуулагчийг хамгийн эхний мөрөнд дуудна
        super(name);
        this.hp = 150;
        this.maxHp = 150;
        this.mp = 20;
        this.maxMp = 20;
    }

    // 3. shieldBash() функц
    public void shieldBash() {
        this.shielded = true; // Бамбайгаа идэвхжүүлнэ
        System.out.println(this.name + " used Shield Bash! Next damage will be halved.");
    }

    // 4. takeDamage(int amount) - Override хийж байна
    @Override
    public void takeDamage(int amount) {
        if (this.shielded) {
            // Хэрэв бамбайтай бол хохирлыг 2 дахин багасгаж авна
            super.takeDamage(amount / 2);
            this.shielded = false; // Бамбай нэг удаа ашиглагдаад идэвхгүй болно
            System.out.println(this.name + " blocked half the damage with their shield!");
        } else {
            // Бамбайгүй бол хэвийн хохирол авна
            super.takeDamage(amount);
        }
    }
}
