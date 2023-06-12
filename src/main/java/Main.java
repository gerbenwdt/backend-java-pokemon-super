public class Main {
    public static void main(String[] args){
        FirePokemon charmander = new FirePokemon("Charmander", 34, "Blaze", 300);
        FirePokemon charmeleon = new FirePokemon("Charmeleon",53,"Blaze",500);
        WaterPokemon squirtle = new WaterPokemon("Squirtle",36,"Tail", 270);
        WaterPokemon wartortle = new WaterPokemon("Wartortle",87,"Ears",534);
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur",17,"Poison","Overgrow");
        GrassPokemon ivysaur = new GrassPokemon("Ivysaur",47,"Poison","Overgrow");
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 23,6,"Cheeks");
        ElectricPokemon raichu = new ElectricPokemon("Raichu",56,30, "Cheeks");

//        Charmander
        charmander.introduce();
        charmander.useAbility();
        charmander.levelUp();

//        Charmeleon
        charmeleon.introduce();
        charmeleon.useAbility();
        charmeleon.useFlameSize();
        charmeleon.levelDown();

//        Squirtle
        squirtle.introduce();
        squirtle.usePropel();
        squirtle.attack();
        squirtle.levelUp();

//        Wartortle
        wartortle.introduce();
        wartortle.usePropel();
        wartortle.attack();
        wartortle.levelDown();

//        Bulbasaur
        bulbasaur.introduce();
        bulbasaur.levelDown();
        bulbasaur.secAttack();

//        Ivysaur
        ivysaur.introduce();
        ivysaur.levelUp();
        ivysaur.useAbility();

//        Pikachu
        pikachu.introduce();
        pikachu.levelUp();
        pikachu.printWeight();

//        Raichu
        raichu.introduce();
        raichu.levelDown();
        raichu.attack();

    }
}
