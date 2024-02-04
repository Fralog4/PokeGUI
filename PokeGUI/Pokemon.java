public class Pokemon{
    private int Health;
    private int Attack;
    private int Defence;
    private String Type;
    private String Name;
    private String Region;
    public Pokemon(int health, int attack, int defence,String type,String name,String region){    //constructor 
        this.Health=health;
        this.Attack=attack;
        this.Defence=defence;
        this.Type=type;
        this.Name=name;
        this.Region=region;
    }
    public void setHealth(int health){  //setters and getters
        Health=health;
    }
    public int getHealth(){
        return Health;
    }
    public void setAttack(int attack){
        Attack=attack;
    }
    public int getAttack(){
        return Attack;
    }
    public void setDefence(int defence){
        Defence=defence;
    }
    public int getDefence(){
        return Defence;
    }
    public void setType(String type){
        Type=type;
    }
    public String getType(){
        return Type;
    }
    public void setName(String name){
        Name=name;
    }
    public String getName(){
        return Name;
    }
    public void setRegion(String region){
        Region=region;
    }
    public String getRegion(){
        return Region;
    }

    public String sayHello(){
        if(Name=="Pikachu"){
            return "When it is angered, it immediately discharges the energy stored in the pouches in its cheeks.";

        } else if(Name=="Lucario"){
            return "It’s said that no foe can remain invisible to Lucario, since it can detect auras even those of foes it could not otherwise see.";
        } else if(Name=="Charizard"){
            return "If Charizard becomes truly angered, the flame at the tip of its tail burns in a light blue shade";
        } else if(Name=="Luxray"){
            return "It can see clearly through walls to track down its prey and seek its lost young.";
        } else if(Name=="Alakazam"){
            return "It has an incredibly high level of intelligence. Some say that Alakazam remembers everything that ever happens to it, from birth till death.";
        }
        return "Hello";
    }
}
