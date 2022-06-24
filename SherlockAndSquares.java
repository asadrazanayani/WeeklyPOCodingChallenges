import java.util.Scanner;

public class SherlockAndSquares {

    public static int sqBetweenARange(int lower, int upper) {
        int noOfSquares = 0;
        for (int i = lower; i <= upper; i++) {
            double sqrt = Math.sqrt(i); 
            boolean isPerfectSquare = (sqrt - Math.floor(sqrt)) == 0;
            if (isPerfectSquare) {
                noOfSquares++;
            }  
        }
        return noOfSquares;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lower Limit");
        int lower = sc.nextInt();
        System.out.println("Enter Higher Limit");
        int upper = sc.nextInt();
        System.out.println(sqBetweenARange(lower, upper));
        sc.close();
    }
}