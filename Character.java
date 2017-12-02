import java.util.*;

public class Character{

  String name;
  int[] abilityStats = new int [6];

  public void getName(Scanner console){
    this.name = console.next();
  }

  public void randomAbilityStats(){
    for (int i = 0; i < this.abilityStats.length; i++) {
      abilityStats[i] = randomStatRoller();
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
