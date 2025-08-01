import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        int total = 1;
        int nums = 0;
        int evenNums = 0;

        System.out.println("Give numbers:");

        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            total = total + number;
            nums++;

            if ( number % 2 == 0) {
                evenNums++;
            }

            if (number == -1) {
                nums--;
                System.out.println("Thx! Bye!");
                break;
            }
        }
        System.out.println("Sum: " + total);
        System.out.println("Numbers: " + nums);
        System.out.println("Average: " + ((double) total / nums));   
        System.out.println("Even: " + evenNums);
        System.out.println("Odd: " + (nums - evenNums));
    }
}

// Model answer by the University of Helsinki:
// import java.util.Scanner;
 
// public class RepeatingBreakingAndRemembering {
 
//     public static void main(String[] args) {
        
//         // This exercise is worth five exercise points, and it is 
//         // gradually extended part by part.
        
//         // If you want, you can send this exercise to the server
//         // when it's just partially done. In that case the server will complain about 
//         // the parts you haven't done, but you'll get points for the finished parts.
        
//         Scanner scanner = new Scanner(System.in);
 
//         int sum = 0;
//         int countOfNumbers = 0;
//         int evenNumbers = 0;
 
//         System.out.println("Give numbers:");
//         while (true) {
//             int number = Integer.valueOf(scanner.nextLine());
//             if (number == -1) {
//                 break;
//             }
 
//             sum += number;
//             countOfNumbers++;
//             if (number % 2 == 0) {
//                 evenNumbers++;
//             }
//         }
 
//         double average = (double) sum / countOfNumbers;
//         int oddNumbers = countOfNumbers - evenNumbers;
//         System.out.println("Thx! Bye!");
//         System.out.println("Sum: " + sum);
//         System.out.println("Numbers: " + countOfNumbers);
//         System.out.println("Average: " + average);
//         System.out.println("Even: " + evenNumbers);
//         System.out.println("Odd: " + oddNumbers);
//     }
// }