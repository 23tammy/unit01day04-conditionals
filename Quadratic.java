class Quadratic {
    public static void main(String[] args) {
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
      double c = Double.parseDouble(args[2]);

      if (args.length < 3) {
        System.out.println("provide sufficient arguements.");
      } else {
        if (a == 0) {
          System.out.println("x: " + ((c*-1) / b));
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