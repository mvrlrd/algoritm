import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    static int  a=0;
    static int b=25;
    public static void main(String[] args) throws Exception{
        int value;
        Tree theTree = new Tree();
//        theTree.insert(5);
//        theTree.insert(1);
//        theTree.insert(3);
//        theTree.insert(6);
//        theTree.insert(10);
//        theTree.insert(12);
        theTree.insert(a + (int) (Math.random() * b));
        theTree.insert(a + (int) (Math.random() * b));
        theTree.insert(a + (int) (Math.random() * b));
        theTree.insert(a + (int) (Math.random() * b));
        theTree.insert(a + (int) (Math.random() * b));
        theTree.insert(a + (int) (Math.random() * b));
        theTree.insert(a + (int) (Math.random() * b));
        theTree.insert(a + (int) (Math.random() * b));
        theTree.insert(a + (int) (Math.random() * b));
        theTree.insert(a + (int) (Math.random() * b));


        theTree.displayTree();

        while(true){
            System.out.print("Enter first letter of show, ");
            System.out.print("insert, find, delete, or traverse: ");
            int choice = getChar();
            switch(choice){
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    theTree.insert(7);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if(found != null){
                        System.out.print("Found: ");
                    }
                    found.display();
                    System.out.print("\n");
                    break;
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

}
