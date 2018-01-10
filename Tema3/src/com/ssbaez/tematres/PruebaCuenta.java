package com.ssbaez.tematres;

import java.util.Scanner;

public class PruebaCuenta {
	
	public static void main(String[] args){
		
		double deposito;
		
		//Se instancia objetos Cuenta
		Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
		Cuenta cuenta2 = new Cuenta("Jhon Blue", -7.53);
		Scanner input = new Scanner(System.in);
		
		System.out.printf("El nombre de la cuenta1 es: %s%n", 
				cuenta1.obtenerNombre());
		System.out.printf("El saldo es: %.2f%n%n", 
				cuenta1.obtenerSaldo());
		
		System.out.printf("El nombre de la cuenta2 es: %s%n", 
				cuenta2.obtenerNombre());
		System.out.printf("El saldo es: %.2f%n%n", 
				cuenta2.obtenerSaldo());
		
		System.out.print("Ingrese cantidad a depositar para cuenta 1: ");
		deposito = input.nextDouble();
		System.out.printf("%nSumado %.2f al saldo de cuenta 1%n%n", deposito);
		cuenta1.depositar(deposito);
		
		System.out.printf("Saldo de %s: $%.2f%n",
				cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s: $%.2f%n%n",
				cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
		
		System.out.print("Ingrese cantidad a depositar para cuenta 2: ");
		deposito = input.nextDouble();
		System.out.printf("%nSumado %.2f al saldo de cuenta 2%n%n", deposito);
		cuenta2.depositar(deposito);
		
		System.out.printf("Saldo de %s: $%.2f%n", 
				cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("Saldo se %s: %.2f%n%n",
				cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
		
		System.out.print("Ingrese la cantidad a retirar de la cuenta 1: ");
		double montoRetiro = input.nextDouble();
		System.out.printf("%nRestado %.2f al saldo de cuenta 1%n%n", montoRetiro);
		cuenta1.retirar(montoRetiro);
		
		System.out.printf("Saldo de %s: $%.2f%n",
				cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s: $%.2f%n%n",
				cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
		
		System.out.print("Ingrese la cantidad a retirar de la cuenta 2: ");
		montoRetiro = input.nextDouble();
		System.out.printf("%nRestado %.2f al saldo de cuenta 2%n%n", montoRetiro);
		cuenta2.retirar(montoRetiro);
		
		System.out.printf("Saldo de %s: $%.2f%n",
				cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s: $%.2f%n",
				cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
		
	}

}
