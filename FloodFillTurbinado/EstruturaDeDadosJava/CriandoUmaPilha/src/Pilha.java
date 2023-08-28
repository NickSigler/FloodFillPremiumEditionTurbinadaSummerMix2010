public class Pilha <T> implements InterfacePilha <T>
{

    private Integer top = -1;
    private T[] data;

    public Pilha(int size)
    {
        this.data = (T[]) new Object[size];
    }

    @Override
    public void push(T data)
    {
        if (!isFull())
        {
            top ++;
            this.data[top] = data;
        }
        else
        {
            throw new RuntimeException("Array cheia");
        }

    }

    @Override
    public T pop()
    {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        } else {
            T poppedData = data[top]; // Salva o elemento que será removido
            data[top] = null; // Remove o elemento da pilha
            top--; // Decrementa o índice do topo

            return poppedData; // Retorna o elemento que foi removido
        }
    }


    @Override
    public void clear()
    {
        for(int i = 0; i < data.length; i++)
        {
            data[i] = null;
        }
        System.out.println("Itens removidos");

        top = -1;
    }

    @Override
    public boolean isFull()
    {
        return (top == data.length - 1) ? true : false;
    }

    @Override
    public boolean isEmpty()
    {
        return top == -1;
    }

    public T getData()
    {
        return data[top];
    }


}
