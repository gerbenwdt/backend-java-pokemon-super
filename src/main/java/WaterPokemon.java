public class WaterPokemon extends Pokemon{
    private String propel;
    private int attackDistance;

//    constructor
    public WaterPokemon(String name, int level,String propel, int attackDistance) {
        super(name, level);
        super.setPokemonType("Water");
        this.propel=propel;
        this.attackDistance=attackDistance;
    }

//    methode 1
    public void usePropel(){
        System.out.println(super.getName()+" uses its "+propel+" to move around in the water.");
    }

//    methode 2
    public void attack(){
        System.out.println(super.getName()+" attacks its opponent at "+attackDistance+" centimeters distance.");
    }

//    override 1
    @Override
    public void levelDown(){
        super.setLevel(super.getLevel()-2);
        System.out.println("Water pressure was too low, lost two levels, "+super.getName()+" has now level "+super.getLevel());
    }

//    getter 1
    public String getPropel(){
        return propel;
    }

//    getter 2
    public int getAttackDistance(){
        return attackDistance;
    }

//    setter 1
    public void setPropel(String propel){
        this.propel=propel;
    }

//    setter 2
    public void setAttackDistance(int attackDistance){
        this.attackDistance=attackDistance;
    }

}
