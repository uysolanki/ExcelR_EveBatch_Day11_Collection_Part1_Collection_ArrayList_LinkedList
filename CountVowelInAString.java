package day10.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountVowelInAString {
	
	static int vowelCounter;
	static List<Character> vowels= 
	new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

	public static void main(String[] args) {
	String s1="Java Full Stack Developer";
	
//	vowels=new ArrayList();
//	vowels.add('a');
//	vowels.add('e');
//	vowels.add('i');
//	vowels.add('o');
//	vowels.add('u');
//	vowels.add('A');
//	vowels.add('E');
//	vowels.add('I');
//	vowels.add('O');
//	vowels.add('U');
//	
	
	for(int i=0; i<s1.length();i++)
	{
			if(vowels.contains(s1.charAt(i)))
			vowelCounter++;
	}
	
	System.out.println("Number of Vowels are "+vowelCounter);
}

}
