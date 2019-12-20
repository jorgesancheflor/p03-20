package Clases;

import java.util.Scanner;

public class Circulo 
{	
	//Atributos o miembros dato
	private double radio;
		
	public Circulo(double radio)
	{
		this.radio = radio;
	}
	
///////////////////////////////////////////////////////
	public Circulo()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca radio:");
		radio = entrada.nextDouble();
	}	 
///////////////////////////////////////////////////////
	public Circulo (Circulo copia)
	{
		radio = copia.radio;
	}
/////////////////////////////////////////////////////////
	public double getRadio()
	{
		return radio;
	}
///////////////////////////////////////////////////////
	public void setRadio(double radio) 
	{
		this.radio = radio;
	}
///////////////////////////////////////////
	public double calcularSuperficie()
	{
		return Math.PI*Math.pow(radio ,  2);
	}
}




