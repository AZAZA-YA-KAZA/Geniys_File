import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FiveExeption, NoVowelsException {

        Scanner in = new Scanner(System.in);
/*        int a = in.nextInt(), t = 0;
        while (a != 0){
            t += a % 10;
            a /= 10;
        }*/
/*        System.out.println(a/b);
        if (b == 2){
            throw new IllegalArgumentException("b is 2"); //выводит ошибку с комм b is 2
        }
        String str = in.next();*/
/*        int aa = 0;
        try {
            workWithString(str);
            System.out.println("hello");//при ош уже не выводит
        }catch (NumberFormatException e){//(указ тип ош)
            aa = 1;
        }finally {
            System.out.println("END--");//по завершении выводит
        }
        System.out.println(aa);*/
/*        checkOdd(1);*/
        String str = in.next().toLowerCase();
        try {
            String qq = "euioa";
            boolean f = true;
            for (char i : str.toCharArray()) {
                if (qq.contains(String.valueOf(i))) {
                    f = false;
                    break;
                }
            }
            if (f){
                haveglas(str);
            }
        }catch (NoVowelsException e){//(указ тип ош)
            haveglas(str);
            System.out.println("have ochibka");
        }finally {
            System.out.println("END--");//по завершении выводит
        }
    }

    private static void haveglas(String str) throws NoVowelsException{
        throw new NoVowelsException("no ENG glassniy");
    }

    private static void fivesumm(int t) throws FiveExeption{//если сумма 5 - ошибка
        if (t == 5){
            throw new FiveExeption("sum is five");
        }
    }

    private static void workWithString(String str) throws  NumberFormatException {//throws - указываем тип ошибки который может возникнуть
        int c = Integer.parseInt(str);
    }
    //проверка на чётность числа
    private static void checkOdd(int x) throws ArithmeticException{
        if (x % 2 == 0){
            throw new ArithmeticException("a is odd");
        }
    }
}