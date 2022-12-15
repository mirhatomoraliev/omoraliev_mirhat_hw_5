public class Boss {
    private int health;
    private int damage;
    private String defence;



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public void bossInfo(){
        String bossDefence = this.getDefence()!=null?this.getDefence():"No defence!!!";
        System.out.println("Boss's health:"+this.getHealth()+
                ", damage:" + this.getDamage()+
                ", Defence:"+bossDefence);
    }
}
