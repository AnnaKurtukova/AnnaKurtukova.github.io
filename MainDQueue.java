package dqueue;
class Deque {
       int size; int head; int tail; int[] data;
         Deque(int size) {
data = new int [this.size = size];}  
         void pushBack(int value) {
if (++tail == size)
tail = 0;
data[tail] = value;}
int popBack() { //извлеч 
int ret = data[tail];
if (--tail < 0)
tail = size - 1;
return ret;}
      void pushFront(int value) { //добавить
          data[head] = value;
      if (--head < 0) head = size - 1;}
int popFront() {if (++head == size)
head = 0; return data[head];}
boolean isEmpty() {
return head == tail;}}
public class MainDQueue {
    public static void main(String[] args) {
        Deque mDeque = new Deque(10);
       mDeque.pushBack(1); mDeque.pushFront(2);  
        System.out.print("Стек: ");
        while (!mDeque.isEmpty()) {
            int value = mDeque.popFront();
            System.out.print(value);
            System.out.print(" ");}
            System.out.println("");}}