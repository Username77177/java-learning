import java.util.Scanner;

public class HigherOrLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Define new constructor scan
        String yon = "";
        do {
            System.out.println("Привет! Это игра угадай число. У вас 3 попытки"); // Print this string
            int rand_num = (int) (Math.random() * 10 + 1); // Generating new random num in range [1;10]
//        System.out.println(rand_num); //Output rand_num

            int guess = 0;
            int try_again = 0;
            while (try_again < 3) {
                System.out.print("Введите целое число: ");
                guess = scan.nextInt(); // Guess of user default
                System.out.print("Вы ввели: " + guess + "\n");
                if (guess < rand_num) { // First condition
                    System.out.println("Загаданное число больше");
                } else if (guess > rand_num) { // Second condition
                    System.out.println("Загаданное число меньше");
                } else { //Third condition
                    System.out.println("Вы угадали!");
                    break;
                }
                try_again++; // Incrementation of try_again value (try_again += 1)
            }
            if (try_again == 3) { // If you guess the number more than 3 times, you will lose
                System.out.println("Мне жаль, но вы проиграли!");
                System.out.println("Загаданное число - " + rand_num); // Print rand_num
            } else { // Else: you guess the number less than 3 times
                System.out.println("Ура, вы выиграли!");
            }
            System.out.println("Попробовать ещё раз? (y - да; любое другое значение - нет)");
            yon = scan.next();
        } while(yon.equalsIgnoreCase("y")); // If yon == y or yon == Y, value will be true
        // In another case: false
    }

}
