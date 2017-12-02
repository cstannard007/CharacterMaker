// Fighter class
public class Fighter {
    // 1d10 Hit Dice per fighter level
    int hitDie = 10;
    // hit points at 1st level
    String HPFirst = "10 + your Constitution modifier";
    // hit points at higher levels
    String HPAfter = "1d10";
    String HPAlternative = "6 + your Constitution modifier per fighter level after 1st";
    // Saving Throw Proficiency array (Str, Dex, Con, Int, Wis, Cha)
    boolean[] saves = new boolean[] {true, false, true, false, false, false};
    // Proficiencies
    String ProfArmor = "Light Armor, Medium Armor, Heavy Armor, shields";
    String ProfWeapons = "simple Weapons, martial Weapons";
    String ProfTools = "";
    String profSkills = "Choose two skills from Acrobatics, Animal Handling, Athletics, History, Insight, Intimidation, Perception, and Survival";
    // starting Equipment
    String EquipChoice1 = "(a) Chain Mail or (b) leather, Longbow, and 20 Arrows";
    String EquipChoice2 = "(a) a martial weapon and a Shield or (b) two martial Weapons";
    String EquipChoice3 = "(a) a Light Crossbow and 20 bolts or (b) two handaxes";
    String EquipChoice4 = "(a) a Dungeoneer's Pack or (b) an Explorer's Pack";
    // alternative starting money
    String AlternativeEquip = "You may start with 5d4 x 10 gp to buy your own Equipment.";
    // array for fighter feats per level
    int[] level = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int[] profBonus = new int[] {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6};
    String[] bonusFeats = new String[] {"Fighting Style, Second Wind", "Action Surge (one use)", "Martial Archetype", "Ability Score Improvement", "Martial Archetype feature", "Ability Score Improvement", "Indomitable (one use)", "Martial Archetype feature", "Extra Attack (2)", "Ability Score Improvement", "Indomitable (two uses)", "Ability Score Improvement", "Martial Archetype feature", "Ability Score Improvement", "Action Surge (two uses), Indomitable (three uses)", "Martial Archetype feature", "Ability Score Improvement", "Extra Attack (3)"};
    // array for fighting styles (Archery, Defense, Dueling, Great Weapon Fighting, Protection, Two Weapon Fighting)
    String[] fightingStyles = new String[] {"Archery: You gain a +2 bonus to Attack rolls you make with Ranged Weapons.", "Defense: While you are wearing armor, you gain a +1 bonus to AC.", "Dueling: When you are wielding a melee weapon in one hand and no other Weapons, you gain a +2 bonus to Damage Rolls with that weapon.", "Great Weapon Fighting: When you roll a 1 or 2 on a damage die for an Attack you make with a melee weapon that you are wielding with two hands, you can reroll the die and must use the new roll, even if the new roll is a 1 or a 2. The weapon must have the Two-Handed or Versatile property for you to gain this benefit.", "Protection: When a creature you can see attacks a target other than you that is within 5 feet of you, you can use your reaction to impose disadvantage on the Attack roll. You must be wielding a Shield.", "Two Weapon Fighting: When you engage in two-weapon fighting, you can add your ability modifier to the damage of the second Attack."};
    String secondWind = "Second Wind: You have a limited well of stamina that you can draw on to protect yourself from harm. On Your Turn, you can use a Bonus Action to regain hit points equal to 1d10 + your fighter level. Once you use this feature, you must finish a short or Long Rest before you can use it again.";
    String actionSurge = "Action Surge: Starting at 2nd level, you can push yourself beyond your normal limits for a moment. On Your Turn, you can take one additional action on top of your regular action and a possible Bonus Action. Once you use this feature, you must finish a short or Long Rest before you can use it again. Starting at 17th level, you can use it twice before a rest, but only once on the same turn.";
    // martial Archetypes
    public void ArcheTypes() {
        String Champion = "The archetypal Champion focuses on the development of raw physical power honed to deadly perfection. Those who model themselves on this archetype combine rigorous Training with physical excellence to deal devastating blows.";
        String ImprovedCritical = "Beginning when you choose this archetype at 3rd level, your weapon attacks score a critical hit on a roll of 19 or 20.";
        String RemarkableAthlete = "Starting at 7th level, you can add half your proficiency bonus (round up) to any Strength, Dexterity, or Constitution check you make that doesn’t already use your proficiency bonus. In addition, when you make a running long jump, the distance you can cover increases by a number of feet equal to your Strength modifier.";
        String AdditionalFightingStyle = "At 10th level, you can choose a second option from the Fighting Style class feature.";
        String SuperiorCritical = "Starting at 15th level, your weapon attacks score a critical hit on a roll of 18–20.";
        String Survivor = "At 18th level, you attain the pinnacle of resilience in battle. At the start of each of your turns, you regain hit points equal to 5 + your Constitution modifier if you have no more than half of your hit points left. You don’t gain this benefit if you have 0 hit points.";
    }
}
