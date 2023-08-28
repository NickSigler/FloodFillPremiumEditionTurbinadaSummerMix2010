public class  Node <T>
{
    private Node<T> previous;
    private T data;
    private Node<T> next;

    //-------------------------------Métodos---------------------------------------




    public Node(T value)
    {
        this.data = value;
        this.previous = null;
    }
    public Node(T value, T next)
    {
        this.data = value;
        this.previous = null;
        this.next = (Node<T>) next;

    }
    public Node(T value, T next, T previous)
    {
        this.data = value;
        this.previous = (Node<T>) previous;
        this.next = (Node<T>) next;
    }
    public Node<T> getPrevious()
    {
        return previous;
    }

    public void setPrevious(Node<T> previous)
    {
        this.previous = previous;
    }
    public Node<T> getNext()
    {

        return next;
    }
    public void setNext(Node<T> next)
    {
        this.next = next;
    }

    public T getValue()
    {
        return this.data;
    }
}
