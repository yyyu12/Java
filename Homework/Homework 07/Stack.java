import java.util.NoSuchElementException;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class Stack {
	/**
	 * constant to represent the default capacity of the array
	 */
	private final int DEFAULT_CAPACITY = 100;

	/**
	 * int that represents both the number of elements and the next
	 * available position in the array
	 */
	private int top;  

	/**
	 * array of generic elements to represent the stack
	 */
	private int[] stack;

	/**
	 * Creates an empty stack using the default capacity.
	 */
	public Stack() {
		top = -1;
		stack = new int[DEFAULT_CAPACITY];
	}

	/**
	 * Adds the specified element to the top of this stack, expanding
	 * the capacity of the stack array if necessary.
	 * @param element int element to be pushed onto stack
	 */
	public void push (int element) {
		top++;
		if (top+1 == stack.length) {
			this.expandCapacity();
		}
		stack[top] = element;
	}

	/**
	 * Removes the element at the top of this stack and returns a
	 * reference to it. Throws a NoSuchElementException if the stack
	 * is empty.
	 * @return T element removed from top of stack
	 * @throws NoSuchElementException if a pop is attempted on empty stack
	 */
	public int pop() throws NoSuchElementException {
		if (top == -1) throw new NoSuchElementException("Empty stack");

		int first = stack[top];
		top--;
		return first;

	}

	/**
	 * Returns true if this stack is empty and false otherwise. 
	 * @return boolean true if this stack is empty, false otherwise
	 */
	public boolean empty() {
		return top == -1;

	}

	/**
	 * Returns the number of elements in this stack.
	 * @return int the number of elements in this stack
	 */
	public int size() {
		return top+1;
	}

	/**
	 * Returns a string representation of this stack. 
	 * @return String representation of this stack
	 */
	public String toString() {
		if (top == -1) {
			return "The stack is empty.";
		}
		else {
			String result = "Stack: ";
			for (int i = top; i > 0; i--) {
				result += stack[i] + ", ";
			}
			result += stack[0] + ".";
			return result;
		}
	}

	/**
	 * Creates a new array to store the contents of this stack with
	 * twice the capacity of the old one.
	 */
	private void expandCapacity() {
		int[] larger = new int[stack.length*2];

		for (int index=0; index < stack.length; index++)
			larger[index] = stack[index];

		stack = larger;
	}

    @Test
    public void testPushAndPop() {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        assertEquals(2, s.pop());
        assertEquals(1, s.pop());
    }

    @Test
    public void testEmpty() {
        Stack s = new Stack();
        assertTrue("Newly constructed stack is not empty", s.empty());
    }

    @Test
    public void testStackWithOneElementNotEmpty() {
        Stack s = new Stack();
        s.push(1);
        assertFalse("Stack with one element is empty", s.empty());
    }

    @Test
    public void testPopEmptyStack() {
        Stack s = new Stack();
        NoSuchElementException thrown = assertThrows("Pop empty stack does not throw errors", NoSuchElementException.class, () -> {s.pop();});
        assertEquals("Empty stack", thrown.getMessage());
    }

    @Test
    public void testSize() {
        Stack s = new Stack();
        assertEquals(0, s.size());
        s.push(1);
        assertEquals(1, s.size());
    }

    @Test
    public void testRemoveLastElement() {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.pop();
        s.pop();
        assertEquals(0, s.size());
    }

}