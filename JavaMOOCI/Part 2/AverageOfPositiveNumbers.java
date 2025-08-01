
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int total = 0;
        int nums = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
 
            if (number > 0){
                nums = 1 + nums;
                total = total + number;
            } else if (number == 0){
                break;
            }
            
        }
        if (total == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the positive numbers entered: " + ((double) total / nums));   
        }
    }
}

// Suggested solution:
// public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
 
//         int count = 0;
//         int sum = 0;
//         while (true) {
//             int number = Integer.valueOf(scanner.nextLine());
 
//             if (number == 0) {
//                 break;
//             }
 
//             if (number < 0) {
//                 continue;
//             }
 
//             count = count + 1;
//             sum = sum + number;
//         }
 
//         if (count == 0) {
//             System.out.println("Cannot calculate the average");
//         } else {
//             System.out.println(1.0 * sum / count);
//         }
//     }
