import java.util.Arrays;
import java.util.Date;

public class App {


    public static void main(String[] args) {
        Stack mStack = new Stack(5);

        mStack.push(79);
        mStack.push(59);
        mStack.push(59);
        mStack.push(59);


//        mStack.deleteElement();
        System.out.println(mStack.getSize());
        System.out.print("Стек: ");
        while (!mStack.isEmpty()) {
            int value = mStack.pop();
            System.out.print(value);
            System.out.print(" ");

        }
        System.out.println("");
        System.out.println(mStack.getSize());
    }
}
    }

