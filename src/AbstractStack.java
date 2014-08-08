/*
Autor: Erick Hernandez    Carné: 13197
Seccion: 21

Nombre de archivo: AbstractStack.java 
Descripcion: clase AbstractStack que 
*/
abstract public class AbstractStack<E> implements Stack<E> {
     public boolean empty()
   // post: regresa true si el stack esta vacio
   {
      return size() == 0;
   }
}