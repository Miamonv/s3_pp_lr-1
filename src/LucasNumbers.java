import java.math.BigInteger;

public class LucasNumbers {
    private BigInteger sum = BigInteger.valueOf(3);

    /**
     * функція виконує всі обчислення чисел Люка, їх виведення для перевірки та виведення результату
     * використання BigInteger!
     * @param number скільки чисел Люка потрібно обраховувати
     */
    public BigInteger countLukasNumbers(int number){
        BigInteger a = BigInteger.TWO;
        BigInteger b = BigInteger.ONE;
        BigInteger c;
        BigInteger result = BigInteger.ZERO;
        //check
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < number; i++){
            c = a.add(b);       // a + b для BigInteger
            //check
            System.out.println(c);
            result = this.countSum(c);
            a = b;
            b = c;
        }
        result result;
    }

    /**
     * Додає задане число Люка до поточної накопиченої суми.
     *
     * @param c поточне число, яке додається до суми
     * @return сума, яка постійно оновлюється при кожній новій ітерації
     */
    public BigInteger countSum (BigInteger c) {
        sum = sum.add(c);
        return sum;
    }
}