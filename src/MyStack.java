public class MyStack<T>
{
    private MyNodeS<T> topNode;
    private int length;

    public MyStack(){
        this.topNode = null;
        this.length = 0;
    }

    public boolean isFull(){
        return false;
    }

    public boolean isEmpty(){
        return this.topNode == null;
    }

    public int size(){
        return this.length;
    }

    public void push(T element){
        MyNodeS<T> newNode = new MyNodeS<>(element);
        newNode.setNext(this.topNode);
        this.topNode = newNode;
        this.length++;
    }

    public T pop() throws Exception {
        if(isEmpty()){
            throw new Exception("The stack is empty!");
        }
        T element = this.topNode.getElement();
        this.topNode = this.topNode.getNext();
        this.length--;
        return element;
    }

    public T top() throws Exception{
        if(isEmpty()){
            throw new Exception("The stack is empty!");
        }
        return this.topNode.getElement();
    }

    public void print(){
        MyNodeS<T> tempNodeS = this.topNode;
        while(tempNodeS != null){
            System.out.print(tempNodeS.getElement() + " ");
            tempNodeS = tempNodeS.getNext();
        }
        System.out.println();
    }

    public void clear(){
        this.topNode = null;
        this.length = 0;
    }
}
