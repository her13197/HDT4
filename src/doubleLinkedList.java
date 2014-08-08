public class doubleLinkedList<E> extends abstractList<E>{
    protected int count;
    protected doubleLinkedNODE<E> head;
    protected doubleLinkedNODE<E> tail;

    public doubleLinkedList()
    // post: constructs an empty list
    {
       head = null;
       tail = null;
       count = 0;
    }


    public void addFirst(E value)
    // pre: value is not null
    // post: adds element to head of list
    {
       // construct a new element, making it head
       head = new doubleLinkedNODE<E>(value, head, null);
       // fix tail, if necessary
       if (tail == null) tail = head;
       count++;
    }


    public void addLast(E value)
    // pre: value is not null
    // post: adds new value to tail of list
    {
       // construct new element
       tail = new doubleLinkedNODE<E>(value, null, tail);
       // fix up head
       if (head == null) head = tail;
       count++;
    }


    public E removeLast()
    // pre: list is not empty
    // post: removes value from tail of list
    {
       doubleLinkedNODE<E> temp = tail;
       tail = tail.previous();
       if (tail == null) {
           head = null;
       } else {
           tail.setNext(null);
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
        if(!isEmpty()){
            doubleLinkedNODE<E> temp = head;
            head = head.next();
            if(head!= null){
                head.setPrevious(null);
            } else{
                tail = null;
            }
            temp.setNext(null);
            count--;
            return temp.value();
        }else {
            throw new IndexOutOfBoundsException();
        }
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