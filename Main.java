import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> arr1 = new ArrayList<String>();
    ArrayList<String> arr2 = new ArrayList<String>();

    String word = "";
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!word.equals("STOP"))
    {
      word = sc.nextLine();
      arr1.add(word);
    }
    arr1.remove(arr1.size()-1);
    System.out.println("Enter the letter to search for");
    String letter = sc.nextLine();
    System.out.println("Search for " + letter + ": " + countSecondInitial(arr1, letter));

    word = "";
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!word.equals("STOP"))
    {
      word = sc.nextLine();
      arr2.add(word);
    }
    arr2.remove(arr2.size()-1);
    System.out.println("Enter the String to search for");
    String target = sc.nextLine();
    System.out.println("Search for " + target + ": " + searchSecond(arr2, target));
  }

  /** Returns the number of Strings in the ArrayList that has the letter
   * as the second letter in that word.
   * Precondition: The arr is not null, and is not empty.
   * Precondition: The letter is exactly one letter.
   */
  public static int countSecondInitial(ArrayList<String> arr, String letter)
  {
    int count = 0;
    for (String word : arr){
      if (word.substring(1,2).equals(letter)){
        count++;
      }
    }
    return count;
  }

  /** Returns the index of the second occurrence of target within the ArrayList
   * If the target is not found, or is only found once, then -1 is returned.
   * Precondition: Neither arr nor target are null.  The arr is non-empty.
   */
  public static int searchSecond(final ArrayList<String> arr, String target)
  {
    int count = 0;
    for (int i = 0; i < arr.size(); i++){
      if (arr.get(i).equals(target)){
        count++;
      }
      if (count >= 2){
        return i;
      }
    }
    return -1;
  }
}
