public class MainService
{
    public static void main(String[] args) throws Exception {
        MyStack<Integer> numberMyStack = new MyStack<>();

        System.out.println("--Number Elements--");

//        numberMyStack.top();
//        // exception, the stack is empty
//        numberMyStack.print();

        numberMyStack.push(5);
        numberMyStack.push(6);
        numberMyStack.push(7);
        numberMyStack.push(8);
        numberMyStack.push(9);
        // 5 6 7 8 9
        numberMyStack.print();

        int oneElement = numberMyStack.pop();
        System.out.println("One element: " + oneElement);
        // 9
        numberMyStack.print();

        System.out.println("--Student Elements--");

        MyStack<Student> studentMyStack = new MyStack<>();
        studentMyStack.push(new Student("Aleksandrs", "Petrovs", "010702-21568"));
        studentMyStack.push(new Student("Mihails", "Petrovs", "010703-54744"));
        studentMyStack.push(new Student("Zane", "Petrova", "010700-19929"));
        studentMyStack.push(new Student("Sniedziņš", "Petrovs", "010701-44331"));
        studentMyStack.print();

        Student oneStudent = studentMyStack.pop();
        System.out.println("One student: " + oneStudent);
        //sniedziņš
        studentMyStack.print();

        System.out.println("--Queue Numbers--");
        MyQueue<Integer> numbersQueue = new MyQueue<>();
        numbersQueue.enqueue(5);
        numbersQueue.enqueue(6);
        numbersQueue.enqueue(7);
        numbersQueue.enqueue(8);
        numbersQueue.enqueue(9);
        System.out.println("All queue elements: ");
        numbersQueue.print();

        System.out.println("Dequeued element: " + numbersQueue.dequeue());
        System.out.println("Queue size: " + numbersQueue.size());
        numbersQueue.clear();

        System.out.println("--Queue Students--");
        MyQueue<Student> studentMyQueue = new MyQueue<>();
        studentMyQueue.enqueue(new Student("Aleksejs", "Bērziņš", "010702-67675"));
        studentMyQueue.enqueue(new Student("Liene", "Bērziņa", "010301-67675"));
        studentMyQueue.enqueue(new Student("Andris", "Bērziņš", "010901-75754"));
        System.out.println("All student queue elements: ");
        studentMyQueue.print();
        System.out.println("Dequeued element: " + studentMyQueue.dequeue());
        System.out.println("Queue size: " + studentMyQueue.size());
        studentMyStack.clear();

    }

}
