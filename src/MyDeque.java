public class MyDeque<T>
{
    private MyNodeD<T> frontNode;
    private MyNodeD<T> rearNode;
    private int length;

    public MyDeque(){
        frontNode = null;
        rearNode = null;
        length = 0;
    }

    public boolean isEmpty(){
        return frontNode == null;
    }

    public int size(){
        return length;
    }

    public void enqueueAtFront(T element){
        MyNodeD<T> newNode = new MyNodeD<>(element);
        if(isEmpty()){
            rearNode = newNode;
        } else {
            frontNode.setPrevNode(newNode);
            newNode.setNextNode(frontNode);
        }
        frontNode = newNode;
        length++;
    }

    public void enqueueAtEnd(T element){
        MyNodeD<T> newNode = new MyNodeD<>(element);
        if(isEmpty()){
            frontNode = newNode;
        } else {
            rearNode.setNextNode(newNode);
            newNode.setPrevNode(rearNode);
        }
        rearNode = newNode;
        length++;
    }

    public T dequeueFromFront() throws Exception {
        if(isEmpty()){
            throw new Exception("The deque is empty!");
        }
        T element = frontNode.getElement();
        frontNode = frontNode.getNextNode();
        if(frontNode == null){
            rearNode = null;
        } else {
            frontNode.setPrevNode(null);
        }
        length--;
        return element;
    }

    public T dequeueFromEnd() throws Exception {
        if(isEmpty()){
            throw new Exception("The dequeue is empty!");
        }
        T element = rearNode.getElement();
        rearNode = rearNode.getPrevNode();
        if(rearNode == null){
            frontNode = null;
        } else {
            rearNode.setNextNode(null);
        }
        length--;
        return element;
    }

    public void print() {
        MyNodeD<T> tempNodeD = frontNode;
        while(tempNodeD != null){
            System.out.println(tempNodeD.getElement() + " ");
            tempNodeD = tempNodeD.getNextNode();
        }
        System.out.println();
    }

    public void clear(){
        frontNode = null;
        rearNode = null;
        length = 0;
    }
}
