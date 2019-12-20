package Clases;

import java.util.Scanner;
/**
* Esta clase define oel RADIO y la SUPERFICIE de un círculo
* @author: Jorge Sánchez-Flor Sánchez
* @version: 20/12/2019
*/

public class Circulo 
{	
	//Atributos o miembros dato
	private double radio;
		
	public Circulo(double radio)
	{
		this.radio = radio;
	}
/**
* Constructor para el Radio del círculo
* param radio El parámetro radio define el radio del círculo
*/
	
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
	/**
	* Método que devuelve el radio 
	* return El Radio del ciírculo
	*/
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




