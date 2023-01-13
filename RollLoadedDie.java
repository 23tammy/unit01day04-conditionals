public class RollLoadedDie {
    public static void main(String[] args) {
      
        double roll = Math.random();
      if (roll <= (.625)) {
        System.out.println((Math.round(roll*6))+1);
      } else {
        System.out.println(6);
      }
    }
  }