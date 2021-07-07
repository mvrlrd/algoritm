
    public class Stack {
        private int size; //mSize - максимальный размер
        private int[] stackArray;

        public Stack(int maxSize) {
            stackArray = new int[maxSize];
        }
        public void push(int element) {
            try {
                stackArray[size++] = element;
            }catch (IndexOutOfBoundsException e){
            }
        }
        public int pop() {
            return stackArray[--size];
        }
        public int peek() {
            return stackArray[size-1];
        }
        public boolean isEmpty() {
            return (size == 0);
        }
        public boolean isFull() {
            return (size == stackArray.length);
        }
        public int getSize() {
            return size;
        }
    }


