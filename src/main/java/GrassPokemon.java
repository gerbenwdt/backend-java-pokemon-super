public class GrassPokemon extends Pokemon{
    private String secondaryAttack;
    private String ability;

//  constructor
    public GrassPokemon(String name, int level, String secondaryAttack, String ability) {
        super(name, level);
        super.setPokemonType("Grass");
        this.secondaryAttack=secondaryAttack;
        this.ability=ability;
    }

//    methode 1
    public void secAttack(){
        System.out.println(super.getName()+" has a secondary weapon which is "+secondaryAttack);
    }

//    methode 2
    public void useAbility(){
        System.out.println(super.getName()+" can use the ability "+ability+" to increase power.");
    }

//    override 1
    @Override
    public void levelDown(){
        System.out.println("Secondary attack "+secondaryAttack+" is used, no levels lost. "+super.getName()+" has level "+super.getLevel());
    }

//    getter 1
    public String getSecondaryAttack(){
        return secondaryAttack;
    }

//    getter 2
    public String getAbility(){
        return ability;
    }

//    setter 1
    public void setSecondaryAttack(String secondaryAttack){
        this.secondaryAttack=secondaryAttack;
    }

//    setter 2
    public void setAbility(String ability){
        this.ability=ability;
    }

}
