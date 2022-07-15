package strintbools;

import java.util.ArrayList;

public class StrIntBool {
    // 3 attributes
    String fruit;
    int number;
    boolean truefalse;

    public StrIntBool(String fruit, int number, boolean given_bool) {
        this.fruit = fruit;
        this.number = number;
        this.truefalse = given_bool;
    }

    public void addAChosenWordAndAppend(StrIntBool givenobject) {
        String chosenWord = givenobject.fruit;
        ArrayList<Character> collectionOfLetters = new ArrayList();
        System.out.println("The fruit is: " + fruit);
        char firstLetter = fruit.charAt(0);
        System.out.println("The first character of the fruit is: " + firstLetter);
        char lastLetter = fruit.charAt(fruit.length() - 1);
        System.out.println("The last character of the fruit is: " + lastLetter);
        collectionOfLetters.add(firstLetter);
        collectionOfLetters.add(lastLetter);
        System.out.println("The collection of letters in the fruit are: ");

        for (int i = 0; i < collectionOfLetters.size(); i++) {
            System.out.println(collectionOfLetters.get(i));
        }

        //char first = collectionOfLetters.get(0);
        for (char eachletter : collectionOfLetters) {
            System.out.println(eachletter);
        }

        System.out.println("\n" + "The chosen word is: " + chosenWord);

        String appendCharacters = firstLetter + chosenWord + lastLetter;
        System.out.println("The final appended word is: " + appendCharacters);

        System.out.println(this.number);
        System.out.println(givenobject.number);
        System.out.println(this.truefalse);
        System.out.println(givenobject.truefalse);
    }

    public String toString() {
        return fruit + Integer.toString(number) + Boolean.toString(truefalse);
    }
}
