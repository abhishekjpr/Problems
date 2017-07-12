package com.top20.alg.assignments.hashmapandset;

import java.io.*;
import java.util.HashSet;

public class WordSpelledIncorrectly {
	
	HashSet<String> set;
	private BufferedReader br;

	public WordSpelledIncorrectly() {
		set = new HashSet<String>();
		prepareHashSet();
	}

	public boolean prepareHashSet(){
        try{
            File f = new File("C:\\Users\\abhgoyal\\Google Drive\\Dicionary.txt");
            if(!f.exists()){
                System.out.println("Dictionary not found..!!");
                return false;
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            String line = br.readLine();
            while(line!=null){
                set.add(line);
                line = br.readLine();
            }
            br.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

	public void displayWords(File file){
        if(!file.exists()){
            System.out.println("File not exists");
            return;
		}
        try{
            if(!file.exists()){
                System.out.println("File not exists");
                return;
            }
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            if(set == null){
                System.out.println("Matching file not found..!!");
            }
            String line = br.readLine();
            while(line!=null){
                if(!set.contains(line))
                    System.out.println(line);
                line = br.readLine();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

	public static void main(String... args) {
		String fileName = "C:\\Users\\abhgoyal\\Google Drive\\input.txt";
		WordSpelledIncorrectly w = new WordSpelledIncorrectly();
		w.displayWords(new File(fileName));
	}
}