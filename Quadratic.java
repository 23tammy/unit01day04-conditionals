class Quadratic {
    public static void main(String[] args) {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);

      if (args.length < 3) {
        System.out.println("provide sufficient arguements.");
      } else {
        if (a == 0) {
          System.out.println("x: " + (c / b));
        } else {
          if (b*b - 4*a*c < 0) {
            System.out.println("No real solutions.");
          } else {
          double x1 = ((b*-1) + Math.sqrt(b*b - 4*a*c)) /(2*a);
          double x2 = ((b*-1) - Math.sqrt(b*b - 4*a*c)) /(2*a);
          System.out.println("x: " + x1 +","+ x2);
          }

        }
        
      }


    }
  }