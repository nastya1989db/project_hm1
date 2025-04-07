package task1_hm;

import java.util.Scanner;

    public class TaskNew1 {

        public static void main(String[] args) {
            // N1. Программа должна запрашивать у пользователя ввод двух целых чисел:
            // N2. Программа должна проверять введённые числа на соответствие типу int и
            // выводить сообщение об ошибке, если введены неверные данные.
            // N3. Если оба числа корректны, программа должна вычислить их сумму, разность,
            // произведение и частное (если делитель не равен нулю).

            // объявляем и инициализируем переменные:
            int number = 0;
            int count = 0;
            String typeNumber;
            int firstNumber = 0;
            int secondNumber = 0;


            //№1
            // цикл для повторного ввода данных, если были введены неверные значения
            do {
                count++;
                //Программа запрашивает ввод двух целых чисел с клавиатуры
                Scanner sc = new Scanner(System.in);

                System.out.println("Input " + count + " number: ");
                //printResult(firstNumber, secondNumber); // Передаем числа в метод для получения результата
                // №2 Программа проверяет введённые числа на соответствие типу int и
                // выводить сообщение об ошибке, если введены неверные данные.
                if (sc.hasNextInt()) {
                    if (count == 1) {
                        firstNumber = sc.nextInt();
                    }
                    if (count == 2) {
                        secondNumber = sc.nextInt();
                    }

                } else {
                    count --;
                    System.out.println("Mistake! You entered the wrong number");
                }
            } while (count < 2);

            printResult(firstNumber, secondNumber); // Передаем числа в метод для вычисления
        }
        //№3 Если оба числа корректны, программа вычислит их сумму, разность,
        // произведение и частное (если делитель не равен нулю).
        public static void printResult (int firstNumber, int secondNumber) {
            //System.out.println("Summa: " + (firstNumber + secondNumber));
            System.out.println("+: " + (firstNumber + secondNumber));
            //System.out.println("Subtraction: " + (firstNumber - secondNumber));
            System.out.println("-: " + (firstNumber - secondNumber));
            System.out.println("*: " + (firstNumber * secondNumber));
            if (secondNumber == 0){
                System.out.println("/: Error: can't be divided by zero");
            } else {
                double result = (double) firstNumber / secondNumber;
                //System.out.println("/: " + (firstNumber / secondNumber) + "," + (firstNumber % secondNumber));
                System.out.println("/: " + result);
            }
        }
    }


