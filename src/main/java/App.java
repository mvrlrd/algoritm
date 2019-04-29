import java.util.Arrays;
import java.util.Date;

public class App {
private static LinkedList linkedList = new LinkedList();

    public static void main(String[] args) {


        linkedList.insert("aa",12);
        linkedList.insert("bb",14);
        linkedList.insertLast("last",110);
        linkedList.insert("cc",16);
        
        linkedList.display();

        linkedList.delete();
        System.out.println();
        linkedList.display();

        System.out.println();
        System.out.println(linkedList.find("bb"));

        linkedList.delete("bb");
        linkedList.display();

//
//        Stack mStack = new Stack(5);
//
//        mStack.push(79);
//        mStack.push(59);
//        mStack.push(59);
//        mStack.push(59);
//
//
////        mStack.deleteElement();
//        System.out.println(mStack.getSize());
//        System.out.print("Стек: ");
//        while (!mStack.isEmpty()) {
//            int value = mStack.pop();
//            System.out.print(value);
//            System.out.print(" ");
//
//        }
//        System.out.println("");
//        System.out.println(mStack.getSize());
//    }
}
    }

