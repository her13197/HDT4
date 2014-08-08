public class circular<E> extends abstractList<E>{

    protected Node<E> tail; 
    protected int count;

    public circular()
    // pre: constructs a new circular list
    {
       tail = null;
       count = 0;
    }

    public void addFirst(E value)
    // pre: value non-null
    // post: adds element to head of list
    {
       Node<E> temp = new Node<E>(value);
       if (tail == null) { // first value added
           tail = temp;
           tail.setNext(tail);
       } else { // element exists in list
           temp.setNext(tail.next());
           tail.setNext(temp);
       }
       count++;
    }


    public void addLast(E value)
    // pre: value non-null
    // post: adds element to tail of list
    {
       // new entry:
       addFirst(value);
       tail = tail.next();
    }


    // lo dificil es quitar el elemento de la cola

    public E removeLast()
    // pre: !isEmpty()
    // post: returns and removes value from tail of list
    {
       Node<E> finger = tail;
       while (finger.next() != tail) {
           finger = finger.next();
       }
       // finger now points to second-to-last value
       Node<E> temp = tail;
       if (finger == tail)
       {
           tail = null;
       } else {
           finger.setNext(tail.next());
           tail = finger;
       }
       count--;
       return temp.value();
    }

    public int size() {
        return count;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E removeFirst() {
        Node<E> finger = tail;
       while (finger.next() != tail) {
           finger = finger.next();
       }
       // finger now points to second-to-last value
       Node<E> temp = tail;
       if (finger == tail)
       {
           tail = null;
       } else {
           finger.setNext(tail.next());
           tail = finger;
       }
       count--;
       return temp.value();
    }

    @Override
    public E remove(E value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void add(E value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E get() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int indexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lastIndexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E get(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E set(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void add(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E remove(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}