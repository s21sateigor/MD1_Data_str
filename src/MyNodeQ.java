public class MyNodeQ<T>
{
    private T element;
    private MyNodeQ<T> next;

    public MyNodeQ(T elemet){
        this.element = elemet;
        this.next = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public MyNodeQ<T> getNext() {
        return next;
    }

    public void setNext(MyNodeQ<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
