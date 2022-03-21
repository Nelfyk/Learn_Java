import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float num1=getNumber();
        float num2=getNumber();//2123
        char operation=getOperation();
        float result=calc(num1,num2,operation);

        System.out.print(num1);
        System.out.print(operation);
        System.out.print(num2 + "=" + result);

    }

    static float getNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите число: ");
        if (sc.hasNextFloat()){
            return sc.nextFloat();
        }
        else {
            System.out.println("Неккоректный ввод.");
            return getNumber();
        }
    }
    static char getOperation(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите номер операции: \n1.Сложение \n2.Вычитание \n3.Умножение \n4.Деление \n");
        if (sc.hasNextInt()) {
            switch (sc.nextInt()) {
                case 1:
                    return '+';
                case 2:
                    return '-';
                case 3:
                    return '*';
                case 4:
                    return '/';
                default:
                    System.out.println("Некорректный ввод.");
                    return getOperation();

            }
        }
        else {
            System.out.println("Некорректный ввод.");
            return getOperation();
        }
    }
    static float calc(float num1, float num2, char operation){
        switch (operation){
            case '+': return num1+num2;
            case '-': return num1-num2;
            case '*': return num1*num2;
            case '/':
                if (num2!=0){
                    return num1/num2;
                }
                else {
                    System.out.println("ДЕЛЕНИЕ НА НОЛЬ - НЕВОЗМОЖНО.");
                    return Float.NaN;
                }
            default: return 0;
        }
    }
}