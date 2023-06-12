public abstract class Pokemon {
    private String name;
    private int level;
    private String pokemonType;

//    constructor
    public Pokemon(String name, int level){
        this.name=name;
        this.level=level;
//        this.pokemonType=pokemonType;
    }

//    methode 1
    public void levelUp(){
        this.level++;
        System.out.println("One level up, "+name+" has level "+level);
    }

//    methode 2
    public void levelDown(){
        this.level--;
        System.out.println("Lost one level, "+name+" has level "+level);
    }

//    getter 1
    public String getName() {
        return name;
    }

//    getter 2
    public int getLevel() {
        return level;
    }

    public String getPokemonType(){
        return pokemonType;
    }
//    setter 1
    public void setName(String name) {
        this.name = name;
    }

//    setter 2
    public void setLevel(int level) {
        this.level = level;
    }

    public void setPokemonType(String pokemonType){
        this.pokemonType=pokemonType;
    }

    public void introduce(){
        System.out.println();
        System.out.println("This is "+getName()+" which is a "+getPokemonType()+" Pokemon. The current level is "+getLevel());
    }

}
