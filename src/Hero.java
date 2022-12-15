public class Hero {
    private int health;
    private int damage;
    private String superPower;

    public Hero (int health, int damage){
        this.health = health;
        this.damage = damage;
    }
    public Hero (int health, int damage, String superPower){
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }


    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void infoOfHeroes (){
        String superPower = this.superPower != null ? this.superPower : "No super power";
        System.out.println("Hero's health:" + this.getHealth() +
                ", Damage:"+this.getDamage()+
                ", super power:"+superPower);
    }

}
