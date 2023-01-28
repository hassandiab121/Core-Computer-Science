import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import  edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item>{
     private Item[] randQueue;
     private int rear = 0;
     private int size = 0;
    private  int[] memory = new int[100];

     private  int randomItem;



     // construct a queue
    public RandomizedQueue(){ randQueue =(Item[]) new Object[8]; }

    // is the randomized queue empty?
    public boolean isEmpty(){
        return rear == 0 ;
    }

    // return the number of items on the randomized queue
    public int size(){
        return size;
    }



    // add the item
    public void enqueue(Item item){
        if (item == null)
            throw new IllegalArgumentException();


        if (size() == randQueue.length -2 || (rear == randQueue.length ))
        {
            resizing(randQueue.length*2);
        }


        randQueue[rear] = item;
            rear++;
            size++;

        if (memory.length == size)
        {
            int[] newMemory = new int[memory.length+100];
            for (int counter = 0; counter< memory.length; counter++)
            {
                newMemory[counter] = memory[counter];
            }
            memory = newMemory;
        }


    }


    // remove and return a random item
    public Item dequeue(){

        if(size() == 0)
            throw  new NoSuchElementException();
        size--;
        Item removedItem;
            // generate a random  valid index from ordinary Queue
           do {
                   randomItem = StdRandom.uniform(0, rear);
                   removedItem = randQueue[randomItem];
             }
            while (  randQueue[randomItem] == null );

            while ( (randomItem == rear -1 || randQueue[rear-1] == null) && size() != 0)
                rear--;

            randQueue[randomItem] = null;
            if (memory[randomItem] == 1)
                memory[randomItem] =0;


            if (size() < randQueue.length / 4) {
                resizing(randQueue.length / 2);
            }



        return removedItem;
    }


    // return a random item (but not remove it)
    public Item sample(){
        if (size() == 0)
            throw new NoSuchElementException();

        // generate a random  valid index from ordinary Queue
        do {
            randomItem = StdRandom.uniform(0, rear);


        } while (randQueue[randomItem] == null);


        return randQueue[randomItem];
    }

     // function return iterator
    public Iterator<Item> iterator(){return  new Iterat();}



    // class for implement iterator
    private class Iterat implements Iterator{

        private int wizard = 0;

        @Override
        public boolean hasNext() {
            return wizard < size();
        }

        @Override
        public Object next() {
            if (wizard >= rear)
                throw new NoSuchElementException();
            Item current = null;
             do {
                 randomItem = StdRandom.uniform(0,rear);
             }while (!checkIndex(randomItem) || randQueue[randomItem] == null);
             current = randQueue[randomItem];
            wizard++;
            return current;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


    private  boolean checkIndex(int x){
        if (memory[x] == 0)
        {
            memory[x] = 1;
            return true;
        }
        return false;

    }


    // dynamic array supporting
    private void resizing(int capacity){
        int front = 0;
        Item[] resizingArr = (Item[]) new Object[capacity];

        for (int counter = 0; counter < size(); counter++ )
        {
            resizingArr[counter] = randQueue[front];

            if (resizingArr[counter] == null)
            {
                counter--;
                //StdOut.println(resizingArr[counter]);
            }

            ++front;

        }

        rear = size();
        randQueue =resizingArr;
    }




    public static void main(String[] args){

    }
}
