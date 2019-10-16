package com.vcs.lects.l18.cleancode.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class MyAvesomeAverageMashineTurboWeeeee {
	@SuppressWarnings("resource")
	private static double countingAvgeragesFromVariosTextFiles(String file) throws IOException {


		File File = new File(file);

		if (File.exists()) {
			Reader reader = new FileReader(File);

				BufferedReader buffReader = new BufferedReader(reader);
				String line = buffReader.readLine();

				System.out.println("Failo turinys:");
				int counter = 0;

			Integer avg = 0;
		while (null != line && !line.isEmpty()) {
		avg += Integer.getInteger(line);
		System.out.println("" + ++counter + " ) " + line);
		line = buffReader.readLine();}
		buffReader.close();
			System.out.println("Pabaiga");
			return avg;

		}

		if (!File.exists()) {
		if (File.createNewFile()) 
		System.out.println("Sukure: " + File.getAbsolutePath()); else 
		System.out.println("Egzistuoja: " + File.getAbsolutePath());
			
		FileWriter fw = new FileWriter(File, true);
		Random roma = new Random();
		int x = roma.nextInt(200);
		int y = roma.nextInt(250);
		for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
		fw.write(roma.nextInt(Integer.MAX_VALUE));
		fw.write("\n");}}
		File ff = new File(file);
		BufferedReader buffReader = new BufferedReader(new FileReader(ff));
		String line = buffReader.readLine();
		Integer avg = 0;

		while (null != line && !line.isEmpty()) {
		avg += Integer.getInteger(line);
		line = buffReader.readLine();
		}

		fw.flush();
		fw.close();
		return avg / (x + y);
		}
		
		return -0.00; /* it should mean error*/}
	
		public static void main(String[] args) throws IOException {
		System.out.println(countingAvgeragesFromVariosTextFiles("aaa.txt"));}
}
