import java.math.BigDecimal;
import java.util.Scanner;
public class P03ExactSumOfRealNumbers {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        byte countNumbers = Byte.parseByte(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <= countNumbers ; i++) {

            BigDecimal currentNum = new BigDecimal(scanner.nextLine());
            sum = sum.add(currentNum);
        }
        System.out.println(sum);

        //??   System.out.printf("??", sum);

    }
}
