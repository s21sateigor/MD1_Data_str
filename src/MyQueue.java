public class MyQueue<T>
{
    private MyNodeQ<T> frontNode;
    private MyNodeQ<T> rearNode;
    private int length;

    public MyQueue(){
        this.frontNode = null;
        this.rearNode = null;
        this.length = 0;
    }

    public boolean isFull(){
        return false;
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(T element){
        MyNodeQ<T> newNode = new MyNodeQ<>(element);
        if(isEmpty()){
            frontNode = newNode;
            rearNode = newNode;
        } else {
            rearNode.setNext(newNode);
            rearNode = newNode;
        }
        length++;
    }

    public T dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("The queue is empty!");
        }
        T dequeuedElement = frontNode.getElement();
        frontNode = frontNode.getNext();
        length--;
        if(isEmpty()){
            rearNode = null;
        }
        return dequeuedElement;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("The queue is empty!");
            return;
        }
        MyNodeQ tempNodeQ = frontNode;
        while(tempNodeQ != null){
            System.out.println(tempNodeQ.getElement() + " ");
            tempNodeQ = tempNodeQ.getNext();
        }
        System.out.println();
    }

    public void clear(){
        frontNode = null;
        rearNode = null;
        length = 0;
    }


}
