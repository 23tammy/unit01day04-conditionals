// this is pretty close to perfect. But I have OCD and am a former math teacher, so probability is really important to me:
// I think rolling a 1, and rolling a 5, are less likely than other numbers. Because of the line with Math.round in it
// do you agree? if so, do you know how to fix it?
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