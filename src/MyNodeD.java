public class MyNodeD<T> {
    private T element;
    private MyNodeD<T> nextNode;
    private MyNodeD<T> prevNode;

    public MyNodeD(T element) {
        this.element = element;
        this.nextNode = null;
        this.prevNode = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public MyNodeD<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyNodeD<T> nextNode) {
        this.nextNode = nextNode;
    }

    public MyNodeD<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(MyNodeD<T> prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
