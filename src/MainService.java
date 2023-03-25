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
    }
}
