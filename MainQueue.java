package queue;
class Queue {
int size;
int head; // голова
int tail; // хвост
int[] data;
Queue(int size) {
data = new int [this.size = size];}
void addElement(int value) {
if (++tail == size)
tail = 0;
data[tail] = value;}
int extract() //извлечение
{if (++head == size)
head = 0;
return data[head];}
boolean deleteElement() {return head == tail;}}
public class MainQueue {
    public static void main(String[] args) {
        Queue mQueue = new Queue(10);
        mQueue.addElement(1);
        mQueue.addElement(2);  mQueue.addElement(3);
        mQueue.addElement(4);  mQueue.addElement(5);
        mQueue.deleteElement(); //удаление с топ позиции
        System.out.print("Стек: ");
        while (!mQueue.deleteElement()) {
            int value = mQueue.extract();
            System.out.print(value);
            System.out.print(" ");}
            System.out.println("");}}