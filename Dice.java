import java.util.*;

public class Dice{

  static int D4(){
    Random rand = new Random();
    return rand.nextInt(4)+1;
  }

  static int D6(){
    Random rand = new Random();
    return rand.nextInt(6)+1;
  }

  static int D8(){
    Random rand = new Random();
    return rand.nextInt(8)+1;
  }

  static int D10(){
    Random rand = new Random();
    return rand.nextInt(10)+1;
  }

  static int D12(){
    Random rand = new Random();
    return rand.nextInt(12)+1;
  }

  static int D20(){
    Random rand = new Random();
    return rand.nextInt(20)+1;
  }

  static int D100(){
    Random rand = new Random();
    return rand.nextInt(100)+1;
  }
}
