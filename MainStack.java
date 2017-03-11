package stack;
class Stack {
    private int mSize;
    private int[] stackArray;
    private int top;
    public Stack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;}
    public void addElement(int element) {
        stackArray[++top] = element;}
    public int deleteElement() {
        return stackArray[top--];}
    public int readTop() { //значение на позиции топ
        return stackArray[top]; }
    public boolean isEmpty() { // проверка на пустоту
        return (top == -1);}
    public boolean isFull() { //првоерка на заполненность 
        return (top == mSize - 1);}}
public class MainStack {
    public static void main(String[] args) {
        Stack mStack = new Stack(10);
        mStack.addElement(1);
        mStack.addElement(2);
        mStack.addElement(3);
        mStack.addElement(4);
        mStack.addElement(5);
        mStack.deleteElement(); //удаление с топ позиции
        System.out.print("Стек: ");
        while (!mStack.isEmpty()) {
            int value = mStack.deleteElement();
            System.out.print(value);
            System.out.print(" ");}
            System.out.println("");}}