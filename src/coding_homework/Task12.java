package coding_homework;

import java.util.Scanner;
//NB! mul loeb tuhikute arvu, aga vaja protsent valja printida!!!POOLIK!
/*Write an application that reads a text from the user (type String)
 and counts a percentage of occurrences of a space character.*/
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        char[] count = text.toCharArray();
            int space = 0;
         int characterCount = 0;

            for (int i = 0; i < text.length(); i++ ){
                if (Character.isSpaceChar(count[i])){
                  space++;
                }
                if(text.charAt(i) != ' '){
                    characterCount++;
                }
    }
     //   System.out.println("Occurrences of space character: " + space);
      //  System.out.println("Occurrences of other characters: " + characterCount);


 int allCharacters = space + characterCount;
 int percentage = 100*space/allCharacters;
        System.out.println("Percentage of occurrences of a space character is: " + percentage + " %.");


        }
    }

