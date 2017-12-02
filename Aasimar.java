// Main race
public class Aasimar {
    // Array for stat modifications (Str, Dex, Con, Int, Wis, Cha)
    int[] stats = new int[] {0, 0, 0, 0, 0, 2};
    // Race size
    String size = "Medium";
    // Race speed
    int speed = 30;
    // Race Vision
    String vision = "Darkvision: 60 feet";
    // Special abilities
    String special1 = "Celestial Resistance: Necrotic and radiant damage.";
    String special2 = "Healing Hands: As an action, you can touch a creature and heal a number of hit points equal to your level, once per long rest.";
    String special3 = "Light Bearer: You know the light cantrip. Use charisma if someone tries to dispel it.";
    // languages
    String lang1 = "Common";
    String lang2 = "Celestial";
}
// subrace Aasimar Protector
class SubRaceProtector extends Aasimar {
    // Array for stat modifications (Str, Dex, Con, Int, Wis, Cha)
    int[] subStats = new int[] {0, 0, 0, 0, 1, 0};
    // special subRace
    String subSpecial1 = "Radiant Soul: Starting at 3rd level, you can unleash the divine energy as an action. When you do so, your eyes glimmer and two luminous, ghost-like wings emerge from your back and you gain a flying speed of 30 feet. The transformation lasts for 1 min, and once on each of your turns you can deal extra radiant damage equal to your level, whenever you damage a creature with an attack or spell. You can cancel Radiant Soul with a bonus action, and cannot use it again until you take a long rest.";
}
// subrace Aasimar Scourge
class SubRaceScourge extends Aasimar {
    // Array for stat modifications (Str, Dex, Con, Int, Wis, Cha)
    int[] subStats = new int[] {0, 0, 1, 0, 0, 0};
    // special subRace
    String subSpecial1 = "Radiant Consumption: Starting at 3rd level, you can unleash your divine energy as an action. When you do so, searing light pours out your eyes and mouth for 1 min. During this time, you shed bright light for 10 feet, dim light for another 10 feet. At the end of each your turns, you and all creatures within 10 feet take radiant damage equal to half your level (rounded up). In addition, once on each of your turns, you can deal extra radiant damage to a single creature equal to your level. You can cancel Radiant Consumption as a bonus action and must finish a long rest before you can use this ability again.";
}
// subrace Aasimar Fallen
class SubRaceFallen extends Aasimar {
    // Array for stat modifications (Str, Dex, Con, Int, Wis, Cha)
    int[] subStats = new int[] {1, 0, 0, 0, 0, 0};
    // special subRace
    String subSpecial1 = "Necrotic Shroud: Starting at 3rd level, you can unleash your divine energy as an action, causing your eyes to turn into pools of darkness and two skeletal, ghost-like, flightless wings sprout from your back. The instant you transform, all other creatures within 10 feet that can see you become frightened until the end of your next turn if they fail a Charisma saving throw (DC 8 + your prof bonus + Charisma modifier). The transformation lasts for 1 min, and once on each of your turns you can deal extra necrotic damage equal to your level, whenever you damage a creature with an attack or spell. You can cancel Necrotic Shroud with a bonus action, and cannot use it again until you take a long rest.";
}
