import java.util.Scanner;

public class Gpa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a= input.nextDouble();
        methodGPA(a);
    }

    private static void methodGPA(double a) {
        if (a>=93 && a<=100){
            System.out.println("A 4.0");
        }else if(a>=90 && a<=92){
            System.out.println("A- 3.67");
        }else if(a>=87 && a<=89){
            System.out.println("B+ 3.33");
        }else if(a>=83 && a<=86){
            System.out.println("B 3.0");
        }else if(a>=80 && a<=82){
            System.out.println("B- 2.67");
        }else if(a>=77 && a<=79){
            System.out.println("C+ 2.33");
        }else if(a>=70 && a<=76){
            System.out.println("C 2.0");
        }else if(a>=60 && a<=69){
            System.out.println("D 1.0");
        }else if(a>=0 && a<=59){
            System.out.println("F 0.0");
        }else if(a<0 || a>100){
            System.out.println("Incorrect grade!");
        }
    }
}
