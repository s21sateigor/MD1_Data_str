public class MyNodeS<T> {
    private T element;
    private MyNodeS<T> next;
//    private MyNodeS previous;

    public MyNodeS(T element){
        this.element = element;
        this.next = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public MyNodeS<T> getNext() {
        return next;
    }

    public void setNext(MyNodeS<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(this.element);
    }
}
