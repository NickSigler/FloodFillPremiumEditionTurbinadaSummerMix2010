public class ListaDuplamenteEncadeada <T> implements InterfaceListaDuplamenteEncadeada <T>
{

    private Node<T> base;
    private Node<T> top;
    private int size = 0;

    @Override
    public boolean isEmpty()
    {
        if(this.size > 0)
        {
            return false;
        }
        return true;
    }

    @Override
    public boolean isFUll()
    {
        return false;
    }

    @Override
    public int getSize()
    {
        return this.size;
    }

    @Override
    public String toString() {
        return "Rodada{" +
                "base=" + base +
                ", top=" + top +
                ", size=" + size +
                '}';
    }

    @Override
    public void add(T value)
    {
        Node<T> celula = new Node<T>(value);
        if(size == 0)
        {
            this.base = celula;
            celula.setPrevious(null);
            celula.setNext(null);
        }
        else if(size == 1)
        {
            this.base.setNext(celula);
            celula.setNext(null);
            celula.setPrevious(this.base);
        }
        else if(size > 1)
        {
            this.top.setNext(celula);
            celula.setNext(null);
            celula.setPrevious(this.top);
        }
        this.top = celula;
        this.size ++;


    }

    @Override
    public Node<T> getNode(int pos) {
        if (pos >= 0 && pos < this.size) {
            Node<T> current = base;
            for (int i = 0; i < pos; i++) {
                current = current.getNext();
            }
            return current;
        } else {
            throw new RuntimeException("Posição inválida na lista");
        }
    }

    @Override
    public T remove(int pos) {
        if (pos >= 0 && pos < this.size) {
            Node<T> nodeToRemove = getNode(pos);

            if (nodeToRemove == base) {
                base = nodeToRemove.getNext();
                if (base != null) {
                    base.setPrevious(null);
                }
            } else if (nodeToRemove == top) {
                top = nodeToRemove.getPrevious();
                if (top != null) {
                    top.setNext(null);
                }
            } else {
                Node<T> previousNode = nodeToRemove.getPrevious();
                Node<T> nextNode = nodeToRemove.getNext();
                previousNode.setNext(nextNode);
                nextNode.setPrevious(previousNode);
            }

            size--;
            return nodeToRemove.getValue();
        } else {
            throw new RuntimeException("Posição inválida na lista");
        }
    }

    // Restante do código

    private void remove(Node<T> node) {
        Node<T> previousNode = node.getPrevious();
        Node<T> nextNode = node.getNext();
        previousNode.setNext(nextNode);
        nextNode.setPrevious(previousNode);
    }
    @Override
    public T get(int pot)
    {
        return null;
    }

    @Override
    public void set(int pos, T value)
    {
        if(pos < this.size)
        {
            Node<T> celula = new Node<>(value);
            int count = 0;
            while(base.getNext() != null)
            {

                base = base.getNext();
                if(pos == count)
                {
                    celula.setPrevious(base);
                    celula.setNext(base.getNext());

                    base.getPrevious().setNext(celula);
                    base.setPrevious(celula);


                }
                else
                {
                    count ++;
                }
            }
        }
        else
        {
            throw new RuntimeException("Posição maior que a lista");
        }



    }
}
