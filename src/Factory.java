/*
Autor: Erick Hernandez    Carné: 13197
Seccion: 21

Nombre de archivo: Factory.java 
Descripcion: clase Factory que 
*/
class Factory<E> {
    
    public Stack<E> getStack(int entry) {
        switch(entry){
            case 1:
                return new StackArrayList<>();
            case 2:
                return new StackVector<E>();
            case 3:
                return new StackList<E>();
        }
        return null;
   }
    
    public list<E> getList(int entry) {
        switch(entry){
            case 1:
                return new singlyLinkedList<>();
            case 2:
                return new doubleLinkedList<E>();
            case 3:
                return new circular<E>();
        }
        return null;
   }
}