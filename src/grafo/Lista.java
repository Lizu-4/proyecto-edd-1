/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo;

/**
 *
 * @author Liz
 */
public class Lista<T> {

    private Nodo head;
    private int size;

    public Lista() {
        this.head = null;
        this.size = 0;
    }

    /**
     * @return the head
     */
    public Nodo getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Nodo head) {
        this.head = head;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public Nodo insertFinal(Object data){
        Nodo node = new Nodo(data);
        if(isEmpty()){
            setHead(node);
        }else{
            Nodo pointer = getHead();
            while(pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        size++;
        return node;
    }
}
