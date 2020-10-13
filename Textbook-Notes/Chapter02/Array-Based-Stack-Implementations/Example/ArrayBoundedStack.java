public class ArrayBoundedStack<T> implements StackInterface<T>

{

	protected final int DECAP = 100;
	protected T[] elements;
	protected int topIndex = -1;

	public ArrayBoundedStatck()
	{
		elements = (T[]) new Object[DEFCAP];
	}
	
	public ArrayBoundedStack(int maxSize)
	{
		elements = (T[]) new Object[maxSize];
	}

}
