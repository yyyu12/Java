class EmptyCollectionException extends Exception {
    EmptyCollectionException(String message) {
        super(message);
    }
}


public class Stack<T> {
    
    private final int DEFAULT_CAPACITY = 100;
    private int top;
    private T[] stack;

    private void expandCapacity() {
		T[] larger = (T[])(new Object[stack.length*2]);

		for (int index=0; index < stack.length; index++)
			larger[index] = stack[index];

		stack = larger;
	}

    public Stack() {
        top = -1;
        stack = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    public void push (T element) {
		top++;
		if (top+1 == stack.length) {
			this.expandCapacity();
		}
		stack[top] = element;
	}

    public T pop() throws EmptyCollectionException {
		if (top == -1) throw new EmptyCollectionException("Empty stack");

		T first = stack[top];
		top--;
		return first;

	}

    public T peek() throws EmptyCollectionException {
		if (top == -1) throw new EmptyCollectionException("Empty stack");

		return stack[top];
	}

    public int size() {
		return top+1;
	}

    public String toString() {
		if (top == -1) {
			return "The stack is empty.";
		}
		else {
			StringBuilder result = new StringBuilder();
            result.append("Stack: ");
			for (int i = top; i > 0; i--) {
                result.append(stack[i]);
                result.append(", ");
			}
            result.append(stack[0]);
            result.append('.');
			return result.toString();
		}
	}

    public static void main(String[] args) {
        Stack<String> S = new Stack<String>();
		
		S.push("one");
		S.push("two");
		S.push("three");
		S.push("four");
		S.push("five");
		S.push("six");
		S.push("seven");
		S.push("eight");
		S.push("nine");
		
		if (S.size() == 9) {
			System.out.println("Test 1 passed - size()");
		} else {
			System.out.println("Test 1 failed - size()");
		}
		
		try {
            String firstElem = S.peek();
            if (firstElem.equals("nine")) {
                System.out.println("Test 2 passed - peek()");
            } else {
                System.out.println("Test 2 failed - peek()");
            }
        }
        catch (EmptyCollectionException e) {
            System.out.println(e.getMessage());
        }
		
		// Pop several elements.
        try {
            for (int i = 0; i < 5; i++) {
                S.pop();
            }
        }
        catch (EmptyCollectionException e) {
            System.out.println(e.getMessage());
        }

		try {
            String firstElem = S.peek();
		    if (firstElem.equals("four")) {
			    System.out.println("Test 3 passed - pop()");
		    } else {
			    System.out.println("Test 3 failed - pop()");
		    }
        }
        catch (EmptyCollectionException e) {
            System.out.println(e.getMessage());
        }
		
		String toStr = S.toString();
		System.out.println(S);
		
		if (toStr.equals("Stack: four, three, two, one.")) {
			System.out.println("Test 4 passed - toString()");
		} else {
			System.out.println("Test 4 failed - toString()");
		}
		
		// Pop the remaining elements.
        try {
            for (int i = 0; i < 4; i++) {
                S.pop();
            }
        }
        catch (EmptyCollectionException e) {
            System.out.println(e.getMessage());
        }

		toStr = S.toString();
		System.out.println(S);

		if (toStr.equals("The stack is empty.")) {
			System.out.println("Test 5 passed - toString()");
		} else {
			System.out.println("Test 5 failed - toString()");
		}
    }

}
