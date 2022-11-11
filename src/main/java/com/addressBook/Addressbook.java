package com.addressBook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import javax.swing.filechooser.FileFilter;
import com.opencsv.CSVWriter;

public class Addressbook {

	public void writeAddressBook() throws IOException {

		FileWriter outputfile = new FileWriter(
				"C:\\Users\\menad\\OneDrive\\Desktop\\Blabz practice problem\\Day2Problems\\Addressbook\\src\\main\\java\\com\\addressBook\\demo.txt");

		// create CSVWriter object filewriter object as parameter
		CSVWriter writer = new CSVWriter(outputfile);

		// create a List which contains String array
		ArrayList<String[]> addrsBook = new ArrayList<String[]>();
		addrsBook.add(new String[] { "FirstName", "LastName", "City", "State", "Zip", "Email" });
		addrsBook.add(new String[] { "Nadeem", "Akhtar", "saran", "Bihar", "841301", "me.nadeem55@gmailcom" });
		addrsBook.add(new String[] { "Aasif", "sayeed", "BLR", "KA", "23547", "asif.s@gmail.com" });
		addrsBook.add(new String[] { "Amit", "kumar", "Patna", "Bihar", "800001", "amit@gmail" });
		writer.writeAll(addrsBook);

		writer.writeAll(addrsBook);

//	         // closing writer connection
		writer.close();

	}

	public void readAddressBook() throws IOException, Exception {

		FileReader filereader = new FileReader(
				"C:\\Users\\mesha\\OneDrive\\Desktop\\Day-27\\Day-27AddressBook\\src\\main\\java\\com\\AddressBook\\CSV\\FileWritten.txt");

		// create csvReader object and skip first Line
		CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
		List<String[]> allData = csvReader.readAll();

		// print Data
		for (String[] row : allData) {
			for (String cell : row) {
				System.out.print(cell + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------");

	}

	public static void main(String[] args) throws Exception {
		Addressbook obj = new Addressbook();
		obj.writeAddressBook();
		obj.readAddressBook();

	}

}