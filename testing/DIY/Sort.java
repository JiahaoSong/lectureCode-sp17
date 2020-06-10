public class Sort {
	/** Swap two items in the array */
	private static void swap(String[] x, int pos1, int pos2)
	{
		String temp = x[pos1];
		x[pos1] = x[pos2];
		x[pos2] = temp;
	}

	private static int indexOfMin(String[] x, int start, int end)
	{
		int min_pos = start;
		for (int i = start + 1; i < end; i++)
		{
			if (x[min_pos].compareTo(x[i]) >= 0)
			{
				min_pos = i;
			}
		}
		return min_pos;
	}

	private static void sortAux(String[] x, int start, int end)
	{
		if (start == end)
		{
			return;
		}
		// Find the smallest item
		int min_pos = indexOfMin(x, start, end);
		// Move it to the front
		swap(x, start, min_pos);
		// Sort the rest of the array
		sortAux(x, start + 1, end);
	}

	/** Sorts strings destructively. */
	public static void sort(String[] x) {
		sortAux(x, 0, x.length);
	}

	/** Prints out all strings in x. */
	public static void print(String[] x) {
		for (int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + " ");
		}

		System.out.println();
	}

	/** Outputs the command line arguments
	 * in alphabetical order. */
	public static void main(String[] args) {
		sort(args);
		print(args);
	}
}