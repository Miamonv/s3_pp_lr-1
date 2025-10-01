import java.util.Scanner;

class Input{
    /**
     * отримує необхідну кількість чисел Люка від користувача або з командного рядка
     *
     * @param args аргументи командного рядка, які можуть містити число number
     * @return скільки чисел Люка потрібно генерувати
     */
    public int getN(String[] args){
        int number;
        if (args.length > 0){
            number = Integer.parseInt(args[0]);
        }
        else {
            System.out.println("Введіть кількість чисел Люка: ");
            Scanner input = new Scanner(System.in);    //для читання з клавіатури

            number =  input.nextInt();
            input.close();
        }
        return number;
    }
}

public class Main {
    /**
     * основна логіка запуску інших методів
     */
    void main(String[] args) {
        int number;

        Input enter = new Input();      //введення
        number = enter.getN(args);

        LucasNumbers calculator = new LucasNumbers();   //запуск обчислень
        System.out.println("Сума чисел Люка на заданому діапазоні: " + calculator.countLukasNumbers(number)2);

    }
}
