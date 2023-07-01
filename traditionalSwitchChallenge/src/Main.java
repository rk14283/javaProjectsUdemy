public class Main {
    public static void main(String[] args) {
        char alphabet = 'X';

        switch (alphabet){
            case 'A':
                System.out.println("Able is able");
                break;
            case 'B':
                System.out.println("Baker is baker");
                break;
            case 'C':
                System.out.println("C for charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("Easy is easy");
                break;
            default:
                System.out.println("Letter" + alphabet +" was not found in the switch.");
                break;
        }



    }
}





//Switch challenge, we'll be using NATO alphabet to replace character or letter, with NATO's standardized word for that letter


//In radio transmissions the word car, "C", "A", "R", would be read, "Charlie Able Roger", for clarity
//We'll take a single character, and return the matching word from the NATO phonetic alphabet, shown on this slide
//We'll just do this for the letters A, through E

//Switch challenge
// Create a new char variable
//Use the traditional switch statement (with a colon in case labels) that tests the value in the variable from Step 1
    //Create cases for the characters A,B,C, D and E
    //Display a message in each case block, with the letter and the NATO word, then break.
    //Add a default block, which displays the letter with a message not found.


