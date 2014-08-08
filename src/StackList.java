
import javax.swing.JOptionPane;

/*
Autor: Erick Hernandez    Carné: 13197
Seccion: 21

Nombre de archivo: StackList.java 
Descripcion: clase StackList que 
*/
public class StackList<E> extends AbstractStack<E> {
    public Factory Factor = new Factory();
    protected list<E> data = Factor.getList(opc());
    int op;
    
    public int opc(){
        boolean conti=true;
        while(conti == true){
           op = Integer.parseInt(JOptionPane.showInputDialog("\n1)Simple\n2)Doble\n3)Circular"));
           if(op>=1 || op <=3){
               conti = false;
           }
        }
        return op;
    }
    

    public void push(E item)
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
    	data.addFirst(item);
    }

    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return data.removeFirst();
    }
    
    public E peek()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
    	return data.get(size() - 1);
    }
    
    public int size()
    // post: returns the number of elements in the stack
    {
    	return data.size();
    }
    
    public boolean empty()
    // post: returns true if and only if the stack is empty
    {
    	return size() == 0;
    } 

}
