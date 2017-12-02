import java.util.*;
import javax.swing.*;

public class CharacterMakerMain{

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    printSheet(console);
  }

  public static void printSheet(Scanner console){
    System.out.println("What is your character's name");
    Character character = new Character();
    character.getName(console);
    character.randomAbilityStats();
    SubRaceHighElf race = new SubRaceHighElf();
    System.out.println(race.race);
    for (int i = 0; i < 6; i++) {
      character.totalAS[i] = character.abilityStats[i] + race.stats[i] + race.subStats[i];
      System.out.println(character.ability[i] + "  "  + character.totalAS[i]);
    }
    System.out.println("Speed " + race.speed + "ft." + " / " + race.speed / 5 + " squares");
    System.out.println("You speak " + race.lang);
    System.out.println(race.special + "\n" + race.subSpecial);
  }
}
