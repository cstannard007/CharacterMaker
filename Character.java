import java.util.*;

public class Character{

  String name;
  String[] ability = new String[] {"Str", "Dex", "Con", "Int", "Wis", "Cha"};
  int[] abilityStats = new int [6];
  int[] totalAS = new int [6];
  int[] modifiers = new int [6];

  public void getName(Scanner console){
    this.name = console.next();
  }

  public void randomAbilityStats(){
    for (int i = 0; i < this.abilityStats.length; i++) {
      this.abilityStats[i] = randomStatRoller();
    }
  }

  public int randomStatRoller(){
    int lowest = Dice.D6();
    int sum = 0;
    for (int i = 1; i <= 3 ; i++) {
      int temp = Dice.D6();
      if (temp < lowest) {
        sum += lowest;
        lowest = temp;
      } else {
        sum += temp;
      }
    }
    return sum;
  }

}
