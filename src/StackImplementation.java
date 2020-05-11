public class StackImplementation {
    int size;
    int arr[];
    int top;

    StackImplementation(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int element) {
        if (!this.isFull()) {
            top++;
            arr[top] = element;
            System.out.println("Pushed Element: "+ element);
        }
        else {
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        if (!this.isEmpty()) {
            int returnedEle = top;
            top--;
            System.out.println("Poped element: " + arr[returnedEle]);
            return arr[returnedEle];
        }
        System.out.println("Stack is empty");
        return -1;
    }

    public int peek() {
        if (!this.isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public static void main(String[] args){
        StackImplementation stackImplementation = new StackImplementation(10);
        System.out.println("-------------------------");
        stackImplementation.push(100);
        stackImplementation.push(200);
        stackImplementation.push(300);
        stackImplementation.push(400);
        System.out.println("-------------------------");
        System.out.println(stackImplementation.peek());
        stackImplementation.pop();
        stackImplementation.pop();
        stackImplementation.pop();
        stackImplementation.pop();
        stackImplementation.pop();
        System.out.println(stackImplementation.isEmpty());
        System.out.println(stackImplementation.isFull());
    }
}
