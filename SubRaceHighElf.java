public class RaceElf{

  int[] stat1 = new int[6];
  int speed;
  String size;
  boolean[] skill = new boolean[18];
  String racialAbilities;
  String languages;

  public RaceElf(){
    this.stat1[2] = 2;
    this.speed = 30;
    this.size = "Medium";
    this.skill[12] = true;
    this.racialAbilities = "Darkvision \nFey Ancestry \nTrance";
    this.languages = "Languages: Common, Elvish";

  }

}
