/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_9;

import java.util.Scanner;
public class P_9 {

    	public static void main(String[] args) 
	{
		Scanner Ed = new Scanner(System.in);
		
		System.out.println("Ingresa tu edad: ");
		int ed = Ed.nextInt();
		
		if (ed >= 18 && ed <= 99)
		{
		    System.out.println("Eres mayor de edad.");
		}else if(ed < 18)
		{
		    System.out.println("Eres menor de edad.");
		}else 
		{
		    System.out.println("¿Es una broma?. \nIngresa una edad valida.");
		} 
        }
}