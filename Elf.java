public class Elf{

  // Array for stat modifications (Str, Dex, Con, Int, Wis, Cha)
  int[] stats = new int[] {0, 2, 0, 0, 0, 0};
  // Race size
  String size = "Medium";
  // Race speed
  int speed = 30;
  // Race vision
  String vision = "Darkvision: 60 feet";
  // Array for skill prof.
  boolean[] skill = new boolean[18];
  // Racial abilities
  String special1 = "Fey Ancestry: You have advantage on saving throws against being charmed, and magic can’t put you to sleep.";
  String special2 = "Trance: Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is \"trance.\") While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.";
  // Race languages
  String lang1 = "Common";
  String lang2 = "Elven";

  public Elf(){
    // skill prof. Perception
    skill[12] = true;
  }

}

// subrace High Elf
class SubRaceHighElf extends Elf{

  int[] SubStats = new int[] {0, 0, 0, 1, 0, 0};
  String subSpecial1 = "Cantrip: You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.";
  String langBonus;
}

// subrace Wood Elf
class SubRaceWoodElf extends Elf{

  int[] SubStats = new int[] {0, 0, 0, 0, 1, 0};
  String subSpecial1 = "Elf Weapon Training: You have proficiency with the longsword, shortsword, shortbow, and longbow.";
  String subSpecial2 = "Mask of the Wild: You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena.";
  int speed = 35;

}

// subrace Eladrin
class SubRaceEladrin extends Elf{

  int[] SubStats = new int[] {0, 0, 0, 1, 0, 0};
  String subSpecial1 = "Elf Weapon Training: You have proficiency with the longsword, shortsword, shortbow, and longbow.";
  String subSpecial2 = " Fey Step: You can cast the misty step spell once using this trait. You regain the ability to do so when you finish a short or long rest.";
}
