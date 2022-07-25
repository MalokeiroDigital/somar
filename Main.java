import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Soma soma = new Soma();

    int num1;
    int num2;
    
    System.out.println("Informe um número: ");
    num1 = scanner.nextInt();
    soma.setNum1(num1);

    System.out.println("Informe um número: ");
    num2 = scanner.nextInt(); 

    System.out.println("Soma = " + soma.somar(num1, num2));
    scanner.close();
    
  }
}