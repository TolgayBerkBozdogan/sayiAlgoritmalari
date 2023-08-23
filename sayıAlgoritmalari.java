import java.util.Scanner;

public class sayıAlgoritmalari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, basValue, i = 0,result, total = 0;
        System.out.print("Sayıyı Giriniz: ");
        number = input.nextInt();
        int tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            tempNumber /= 10;
            i++;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result =1;
            for (int a = 1; a <= i; a++) {
                result *= basValue;
            }
            total += result;
            tempNumber /= 10;
        }
        System.out.println(total);

        if (total == number) {
            System.out.println(number + " sayısı bir amstrong sayısıdır.");
        } else {
            System.out.println(number + " sayısı bir amstrong sayısı değildir.");
        }


    }
}
