package org.lessons.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.lessons.java.library.Libro;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti libri devi inserire?");
		int bookCount = Integer.valueOf(sc.nextLine());
		
		Libro[] libri = new Libro[bookCount];
		
		for(int i = 0; i < bookCount; i++)
		{
			try {
				System.out.print("Titolo: ");
				String titolo = sc.nextLine();
				
				System.out.print("Pagine: ");
				int pagine = Integer.valueOf(sc.nextLine());
				
				System.out.print("Autore: ");
				String autore = sc.nextLine();
				
				System.out.print("Editore: ");
				String editore = sc.nextLine();
				
				Libro l = new Libro(titolo, pagine, autore, editore);
				libri[i] = l;
			}catch (Exception e)
			{
				System.err.println(e.getMessage());
				i--;
			}
			
		}
		
		sc.close();
		
		FileWriter myWriter = null;
		
			try {
				myWriter = new FileWriter("./listalibri.txt", true);
				for(int i = 0; i < bookCount; i++)
				{
					myWriter.write(libri[i].toString() + "\n");
				}
				
			} catch (IOException e) {
				System.err.println("error updating file " + e.getMessage());
			} finally {
				try {
					myWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		File listaLibri = new File("./listalibri.txt");
		Scanner reader = null;
		
		try {
			reader = new Scanner(listaLibri);
			
			while (reader.hasNextLine()) {
			
				String line = reader.nextLine();
				System.out.println(line);
				
			}
		} catch (FileNotFoundException e) {
			
			System.err.println("Error reading file " + e.getMessage());
		}
		
		
	}
}
