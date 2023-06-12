public class FirePokemon extends Pokemon{
    private String ability;
    private int flameSize;

//    constructor
    public FirePokemon(String name, int level, String ability, int flameSize) {
        super(name, level);
        super.setPokemonType("Fire");
        this.ability=ability;
        this.flameSize=flameSize;
    }

//    methode 1
    public void useAbility(){
        System.out.println(super.getName()+" is using "+ability+" to attack is opponent.");
    }

//    methode 2
    public void useFlameSize(){
        System.out.println(super.getName()+" is at level "+super.getLevel()+" and is using a flame of "+flameSize+" centimeters to attack its opponent.");
    }

//    override 1
    @Override
    public void levelUp(){
        super.setLevel(super.getLevel()+flameSize/10);
        System.out.println("Extra fire power is used, "+flameSize/10+" levels up, "+super.getName()+" has level "+super.getLevel());
    }

//    getter 1
    public String getAbility(){
        return ability;
    }

//    getter 2
    public int getFlameSize(){
        return flameSize;
    }

//    setter 1
    public void setAbility(String ability){
        this.ability=ability;
    }

//    setter 2
    public void setFlameSize(int flameSize){
        this.flameSize=flameSize;
    }

}
