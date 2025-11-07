//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                name = name.toUpperCase();
                int rounds = Integer.parseInt(args[1]);
                int nameLength = name.length();
                for (int i = 0; i < nameLength; i++) {
                        char letter = name.charAt(i);
                        if (letter == 'A' || letter == 'E' || letter == 'F' || letter == 'H' || letter == 'I' || letter == 'L' 
                        || letter == 'M' || letter == 'N' || letter == 'O' || letter == 'R' || letter == 'S' || letter == 'X') {
                          System.out.println("Give me an " + letter + ": " + letter + "!");      
                        } else {                         
                                System.out.println("Give me a " + letter + ": " + letter + "!");
                        }
                } 
                System.out.println("What does that spell?");
                for (int count = 0; count < rounds; count++) {
                     System.out.println(name + "!!!");   
                }
        }
}
