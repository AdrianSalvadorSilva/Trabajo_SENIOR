package calculadora;

public class TestCalculadora {

public  static void main(String[] args ) {
 Calculadora casio = new Calculadora(8,7);
 System.out.println("el numero se: " +casio.num1+"el 2° numero" +casio.num2+" el resultado de la suma se: "+(casio.num1+ casio.num2) );
 System.out.println("el numero se: " +casio.num1+"el 2° numero" +casio.num2+" el resultado de la multiplicacion se: "+(casio.num1* casio.num2) );
 System.out.println("el numero se: " +casio.num1+"el 2° numero" +casio.num2+" el resultado de la divicion  se: "+(casio.num1/ casio.num2) );

}
}
