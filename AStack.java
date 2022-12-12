package coen352.a3;

public class AStack<E> implements ADTStack<E> {


	/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
*/



  private static final int defaultSize = 10;

  private int maxSize;            // Maximum size of stack
  private int top;                // Index for top Object
  private E [] listArray;         // Array holding stack

  /** Constructors */
  public AStack() { this(defaultSize); }
  @SuppressWarnings("unchecked") // Generic array allocation

  public
  AStack(int size) {
    maxSize = size;
    top = 0; 
    listArray = (E[])new Object[size];   // Create listArray
  }

  /** Reinitialize stack */
  public void clear() { top = 0; }

  /** Push "it" onto stack */
  public void push(E it) {
    assert top != maxSize : "Stack is full";
    for(int i = 0; i < this.length(); i++)
    {
      if(it.equals(listArray[i]))
        return;
    }
    listArray[top] = it;
    ++top;
  }

  /** Remove and top element */
  public E pop() {
    assert top != 0 : "Stack is empty";
    E value = listArray[--top];
    
    return value;
  }

  /** @return Top element */
  public E topValue() {
    assert top != 0 : "Stack is empty";
    return listArray[top-1];
  }

  /** @return Stack size */
  public int length() { return top; }

//Extra stuff not printed inb the book.

  
  
  
  
  
  
  public String toString()
  {
    StringBuffer out = new StringBuffer((length() + 1) * 4);
    out.append("< ");
    for (int i = top-1; i >= 0; i--) {
      out.append(listArray[i]);
      out.append(" ");
    }
    out.append(">");
    return out.toString();
 }
}
