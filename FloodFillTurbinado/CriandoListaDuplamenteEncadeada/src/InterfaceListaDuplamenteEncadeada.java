public interface InterfaceListaDuplamenteEncadeada <T>
{
    public boolean isEmpty();
    public boolean isFUll();
    public int getSize();

    public void add(T value);
    public T remove(int  pos);


    public Node<T> getNode(int pos);
    public T get(int pot);
    public void set(int pos, T value);  



}
