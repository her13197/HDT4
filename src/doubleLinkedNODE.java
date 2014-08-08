public class doubleLinkedNODE<E>{
protected E data;
protected doubleLinkedNODE<E> nextElement;
protected doubleLinkedNODE<E> previousElement;

public doubleLinkedNODE(E v,doubleLinkedNODE<E> next,doubleLinkedNODE<E> previous){
    data = v;
    nextElement = next;
    if (nextElement != null){
        nextElement.previousElement = this;
    }
    previousElement = previous;
    if (previousElement != null){
        previousElement.nextElement = this;
    }
}


    public doubleLinkedNODE(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }
    
        
    public doubleLinkedNODE<E> previous()
    {
        return previousElement;
    }
    
    public void setNext(doubleLinkedNODE<E> v)
    {
        nextElement = v;
    }
    
    public doubleLinkedNODE<E> next()
    {
        return nextElement;
    }
    
    public void setPrevious(doubleLinkedNODE<E> previous)
    {
        previousElement = previous;
    }
    
    public E value()
    {
        return data;
    }
    
    public void setValue(E value)
    {
        data = value;
    }

}