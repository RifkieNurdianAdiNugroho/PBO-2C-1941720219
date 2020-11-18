
package Tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health,int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
       switch (this.level){
           case 1:
               this.health += (20/100 * this.health);
               break;
           case 2:
               this.health += (30/100 * this.health);
               break;
           case 3:
               this.health += (40/100 * this.health);
       }
    }

    @Override
    public void destroyed() {
        this.health -= (20 * this.health/100);
    }
    public String getZombieInfo(){
        String info = super.getZombiInfo();
        return "Walking Zombie Data = \n"+info;
    }
    
}