public class Main {
    public static void main(String[] args) {

        String bulleIt = "Print a BulletedList:\n"+
                "\t\u2022 First Point\n "+
                "\t\t\u2022 Sub Point ";
        System.out.println(bulleIt);

        String textBlock = """
                Print a Bulleted List: 
                      \u2022 First Point 
                         \u2022 Sub Point """;
        System.out.println(textBlock);

        int age = 35;
        //System.out.printf an alternative to .println and .print
        System.out.printf("Your age is %d%n", age);
        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        //will throw an exception java.util.IllegalFormatConversionException withotu float or double
        System.out.printf("Your age is %.2f%n", (float)age);
        
        for(int i=1; i<10000; i*=10){
            System.out.printf("Printing %6d %n", i);
        }
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}


//Some common escape sequences:
//An escape sequence starts with a backslash. Java has several but must commmon are shown in the
//slide:

// \t Insert a tab character
// \n Insert a new line character
// \" Insert a double quote character
// \\ Insert a backslash character


//At their most complex, format specifiers that the form shown here.
// %[argument_index$][flag][width][.precision]conversion
//They start with percent sign, and end with conversion symbol, and have lots of options in between
//We've looked at one conversion type d, which is the symbol used for a decimal integer value.





