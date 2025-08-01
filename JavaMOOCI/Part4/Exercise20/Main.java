package JavaMOOCI.Part4.Exercise20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, pages, year));
        }

        System.out.println();
        System.out.print("What information will be printed? ");
        String request = scanner.nextLine();
        
        System.out.println();

        for (int i = 0; i < books.size(); i++){
            if (request.equals("everything")){
                System.out.println(books.get(i));
            } else {
                System.out.println(books.get(i).getName());
            }
        }
    }
}

// Model answer
// public static void main(String[] args) {
        
//         // implement here the program that allows the user to enter 
//         // book information and to examine them
 
//         ArrayList<Book> books = new ArrayList<>();
//         Scanner scanner = new Scanner(System.in);
//         while (true) {
//             System.out.print("Name: ");
//             String name = scanner.nextLine();
//             if (name.isEmpty()) {
//                 break;
//             }
 
//             System.out.print("Pages: ");
//             int pages = Integer.valueOf(scanner.nextLine());
//             System.out.print("Publication year: ");
//             int publicationYear = Integer.valueOf(scanner.nextLine());
 
//             books.add(new Book(name, pages, publicationYear));
//         }
 
//         System.out.println("");
 
//         System.out.print("What information will be printed? ");
//         String toBePrinted = scanner.nextLine();
 
//         int index = 0;
//         while (index < books.size()) {
//             Book book = books.get(index);
 
//             if (toBePrinted.equals("everything")) {
//                 System.out.println(book);
//             } else if (toBePrinted.equals("name")) {
//                 System.out.println(book.getName());
//             }
 
//             index++;
//         }
 
//     }