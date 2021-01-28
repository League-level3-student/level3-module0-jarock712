package _03_More_Array_Fun;
import java.util.Random;
public class MoreArrayFun {
	static String[] names = {"Bob","Joe","Jen","Bill","Ben","Jon"};
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
	print(names);
	reverse(names);
	everyOther(names);
	random(names);
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void print(String[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.

	 public static void reverse(String[] s) {
		 for(int i = s.length-1; i >= 0; i--) {
			 System.out.println(s[i]);
		 }
	 }
	 //4. Write a method that takes an array of Strings and prints every other String in the array.
	 public static void everyOther(String[] s) {
		 for(int i = 0; i < s.length; i += 2) {
			 System.out.println(s[i]);
		 }
	 }
	
	 //5. Write a method that takes an array of Strings and prints all the Strings in the array
	 //   in a completely random order. Almost every run of the program should result in a different order.
	 public static void random(String[] s) {
		 int ran = new Random().nextInt(s.length);
		 for(int i = 0; i < s.length; i++) {
			 System.out.println(s[ran]);
			 ran = new Random().nextInt(s.length);
		 }
	 }
}