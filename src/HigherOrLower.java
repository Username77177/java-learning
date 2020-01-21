import java.util.Scanner;

public class HigherOrLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Define new constructor scan

        System.out.println("Привет! Это игра угадай число. У вас 3 попытки");
        int rand_num = (int) (Math.random() * 10 + 1); // Generating new random num in range [1;10]
//        System.out.println(rand_num); //Output rand_num

        int guess = 0;
        int try_again = 0;
        while (try_again < 3)
        {
            System.out.print("Введите целое число: ");
            guess = scan.nextInt();         // Guess of user default
            System.out.print("Вы ввели: "+guess+"\n");
            if (guess < rand_num)
            {
                System.out.println("Загаданное число больше");
            }
            else if (guess > rand_num)
            {
                System.out.println("Загаданное число меньше");
            }
            else
            {
                System.out.println("Вы угадали!");
                break;
            }
            try_again++;
        }
        if (try_again == 3)
        {
            System.out.println("Мне жаль, но вы проиграли!");
            System.out.println("Загаданное число - "+ rand_num);
        }
        else {
            System.out.println("Ура, вы выиграли!");

        }
    }
}
