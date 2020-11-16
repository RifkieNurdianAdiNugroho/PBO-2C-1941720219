
package Tugas;

abstract class Zombie implements Destroyable {
    protected int health,level;
    
    abstract public void heal();

    @Override
    abstract public void destroyed();
    
    String getZombiInfo(){
        return "Health = " + this.health + "\n" + "level = "+this.level;
       
    }
    
}
