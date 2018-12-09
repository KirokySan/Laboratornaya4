package com.epam.kira_demidova.collection;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.epam.kira_demidova.collection.CSVReader;
import com.epam.kira_demidova.collection.RunnerLogic;
public class Mainer {

	public static void main(String[] args) {

		String fileName = "Наборы.txt";
		try {
			CSVReader fileReader = new CSVReader(fileName);
			List<Set<Integer>> sets = fileReader.readListSets();
			new RunnerLogic().doLogic(sets);
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
}