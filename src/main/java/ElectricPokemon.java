public class ElectricPokemon extends Pokemon{
    private int weight;
    private String firesFrom;

//    constructor
    public ElectricPokemon(String name, int level, int weight, String firesFrom) {
        super(name, level);
        super.setPokemonType("Electric");
        this.weight=weight;
        this.firesFrom=firesFrom;
    }

//    methode 1
    public void printWeight(){
        System.out.println(super.getName()+" has a weight of "+weight+" kg");
    }

//    methode 2
    public void attack(){
        System.out.println(super.getName()+" fires from its "+firesFrom);
    }

//    override 1
    @Override
    public void levelUp(){
        super.setLevel(super.getLevel()+2);
        System.out.println("Extra electric power is used, two levels up, "+super.getName()+" has level "+super.getLevel());
    }

//    getter 1
    public int getWeight(){
        return weight;
    }

//    getter 2
    public String getFiresFrom(){
        return firesFrom;
    }

//    setter 1
    public void setWeight(int weight){
        this.weight=weight;
    }

//    setter 2
    public void setFiresFrom(String firesFrom){
        this.firesFrom=firesFrom;
    }
}
