import java.util.Scanner;

public class YourNameMine {
    public static void main(String[] args) {
        Scanner scn0 = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        int testCases = scn0.nextInt();
        while (testCases > 0) {
            System.out.println("Enter a man's name: ");
            String man = scn.nextLine();
            System.out.println("Enter a woman's name: ");
            String woman = scn2.nextLine();
            testCases--;
            System.out.println(couple(man, woman));
            
        }


    }

    public static String couple(String man, String woman) {
        if (man.length() == woman.length() && man.equals(woman)) {
            return "YES";
        } else if (man.length() == woman.length() && !man.equals(woman)) {
            return "NO";
        } else {
            String outerLoop = null;
            String innerLoop = null;
            if (man.length() < woman.length()) {
                outerLoop = man;
                innerLoop = woman;
            } else {
                outerLoop = woman;
                innerLoop = man;
            }
            String yn = "YES";
            for (int i = 0; i < outerLoop.length(); i++) {
                if (!innerLoop.contains(outerLoop.substring(i, i+1))) {
                    yn = "NO";
                }
            }

            return yn;
        }
        
        
    }
    
}
