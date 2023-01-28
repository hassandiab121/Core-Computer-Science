import java.util.Iterator;
import java.util.NoSuchElementException;


public class Deque<Item>  implements Iterable<Item>{

    private class node {
        Item value = null;
        node next;

        node previous;

    }
     // class implement iterator
    private class Iterat implements Iterator<Item>{
        //pointer to first item in queue
       private node wizerd = first;


        public boolean hasNext() {
            return wizerd != null;
        }

        @Override
        public Item next() {
            if (wizerd == null || size() == 0)
                throw new NoSuchElementException();

            Item retrn = (Item) wizerd.value;
                wizerd = wizerd.next;
                return retrn;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }



    private node first = new node();
    private node last = new node();
    private int size;




    public Deque(){first = last;}


    public boolean isEmpty(){ return  size == 0 ;}

    public int size(){return size;}

    public void addFirst(Item value) {
        if (value == null)
            throw new IllegalArgumentException();

        // you try to add an item at the front of the queue
        if(size() == 0)
                first.value = value;

        else {
            node current = new node();
            current.value = value;
            current.next = first;
            first.previous = current;
            first = current;
        }
        size++;

    }


    public void addLast(Item value){
        if (value == null)
            throw new IllegalArgumentException();
        // you try to add an item at the last of the queue
        if(size() == 0)
            last.value = value;
        else {
            node current = new node();
            current.value = value;
            current.next = null;
            current.previous = last;
            last.next = current;
            last = current;
        }

        size++;

    }
    // you try to remove the first item from queue
    public Item removeFirst(){
        Item val = null;
        if (size == 0)
            throw new NoSuchElementException();




        val = (Item) first.value;
        if (size() > 1)
           first = first.next;

        first.previous = null;
        size--;


       return val;
    }

    // you try to remove the last item from queue
    public Item removeLast(){
        Item val = null;
        if (size == 0)
            throw new NoSuchElementException();


        val = (Item) last.value;
        if (size() > 1)
            last = last.previous;
        last.next = null;
        size--;

        return val;
    }

    // iterator
     public Iterator<Item> iterator() {
        return new Iterat();
    }

    public static void main(String[] args) {
        Deque<Integer> q1 = new Deque<>();
        q1.addFirst(5);
        q1.addFirst(6);
        q1.addFirst(8);
        q1.addFirst(10);
        q1.removeLast();

        for (int a : q1) {
            System.out.println(a);
        }

    }

    }

