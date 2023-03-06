import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class App1 {

    /*
    Queue : You use a queue when elements are added and removed in a specific order. Queues are typically used
    for sorting elements prior to processing them. Java Queue interface orders the element in FIFO(First In First Out)
    manner. In FIFO, first element is removed first and last element is removed at last.

    PriorityQueue - ArrayDeque

    PriorityQueue
    The PriorityQueue class provides the facility of using queue. But it does not orders the elements in FIFO
    manner. The elements of the priority queue are ordered according to their natural ordering defined by the
    Comparable interface.

    ArrayDeque : it provides a way to apply resizealbe array in addition to the implementation of the Deque interface.
    It is also known as Array Double Ended Queue or Array Deck. This is a special kind of array that grows and allows
    users to add or remove an element from both the sides of the queue. It's not ThreadSafe.

    Methods :

    add(object) add elements to the queue
    offer(object) insert the specified element into this queue
    remove() removes the head of this queue
    element() retrieves, but does not remove, the head of this queue
    peek() retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
    poll() retrieves and removes the head of this queue, or returns null if this queue is empty

    +

    addFirst() The method inserts particular element at the beginning of the deque
    addLast() The method inserts particular element at the end of the deque. It is similar to add() method
    removeFirst() : The method returns first element and also removes it
    removeLast() : The method returns last element and also removes it

     */

    public static void main(String[] args) {

//        Queue<AccessCard> queue = new PriorityQueue<>();
//
//        queue.add(new AccessCard("Adam", 5));
//        queue.add(new AccessCard("Joe", 3));
//        queue.add(new AccessCard("Kevin", 7));
//
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.offerFirst(0);
        deque.offerFirst(-1);
        deque.offerLast(4);

//        deque.removeLast();
        deque.removeFirst();

        for(Integer num : deque)
            System.out.println(num);

    }
}
