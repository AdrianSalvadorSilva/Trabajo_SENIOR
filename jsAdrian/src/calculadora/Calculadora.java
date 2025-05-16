package calculadora;

public class Calculadora {
double num1, num2;

public Calculadora() {
	
}
public Calculadora(double x, double y) {
	this.num1 = x;
	this.num2 = y;
}
public double sumar() {
	return this.num1 + this.num2;
}
}
