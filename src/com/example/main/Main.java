

package com.example.main;
import java.util.Arrays;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our Java Unit 3 Closing CFU");

      /*
        Some activities for Array
      */

        //create an array (not an ArrayList) called favoriteColors that holds five strings with your favoriteColors and print the entire array to the screen.
        String[] favoriteColors = {"Pink","Red","Blue","Black","Yellow"};
        System.out.println(Arrays.toString(favoriteColors));
        //Change the third element of facoriteColors to a different color and print that element to the sceen
        System.out.println(favoriteColors[2]);
        //Declare and initialize and array of type int called numbers to hold 1000 elements (this should be used later in the loop exercise)
        int[] numbers = new int[1000];
        //ArrayList
        //Declare and initialize an ArrayList so that it holds values of type <Double>.
        ArrayList<Double> dblArray = new ArrayList<>();
        //Using the .add() method, add 5 decimal values to the ArrayList and print it to the screen
        dblArray.add(5.10);
        dblArray.add(7.10);
        dblArray.add(3.10);
        dblArray.add(4.10);
        dblArray.add(2.10);
        System.out.println(dblArray);
        //Using the .remove() method, remove the 3rd value in the ArrayList.
        dblArray.remove(2);

        //Print ArrayList to the screen.
        System.out.println(dblArray);
        //Now change the last element in the ArrayList and print the new element to the screen

        dblArray.set(dblArray.size()-1, 0.55);
        System.out.println( dblArray);
    /*
      Some activities for Loops
    */
        // write a for loop that prints out numbers 1-1000 and saves these numbers to the empty array you created earlier
    for(int i=0; i<100; i++){
    numbers[i] =i;
    System.out.println( numbers[i]);
}
        // write a while loop that prints the elements of the array you used in the previous exercise. Take care to avoid infinite looping!
    int j=0;
    while(j<100){
    System.out.println( numbers[j]);
    j++;
}
        //write a do-while loop that does the same.
    int k=0;
    do{
    System.out.println( numbers[k]);
    k++;
    }   while (k<100);
        // write an enhanced for loop that iterates over this array and prints the result of that number modulus(%) 3


    /*
      Some activities for String methods
    */
        // Create two String variables, one holding "Hello" and one holding "world"
    String hello="Hello";
    String world= "World";

        // using String methods, concatenate these strings together with a space between them so that it reads "Hello world" and save the resulting String to a new variable
        String newString = hello.concat(" "+ world);
        System.out.println(newString);
                // then, create a for loop that iterates over your new String and prints each letter out using sout
        for(int l= 0; l < newString.length(); l++) {
            System.out.print(newString.charAt(l)+" ");
        }

        System.out.println();

    /*
      Combination Exercises
    */


        // Create a variable that stores a String with the value "Testing out String methods"
        String methodsVar= "Testing out String methods";

        // Use the String's .split() method with the input of '\s' save an array containing each word of your String variable
        String[] splitString = methodsVar.split( "\n");

        // Using a loop of your choosing, loop through the array of strings and print each word to the screen in all caps, along with its length
        for (String str: splitString) {
            System.out.println(str.toUpperCase()+", Length: "+str.length());
        }

        // CHALLENGE: search the Oracle Documentation to find out how to sort an array, then print the sorted array to the string
        Arrays.sort(splitString);
        System.out.println(Arrays.toString(splitString));
    }
}
