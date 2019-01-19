package come.brite.other;

public class FindIndexOfAnArray {

	public static int findIndex(int[] array, int num) {
		
		int startIndex = 0;
		int endIndex = array.length-1;
		while (startIndex < endIndex) {
			if (array[startIndex] == num) {

				return startIndex;

			} else {
				startIndex++;
			}
			if (array[endIndex] == num) {

				return endIndex;

			} else {
				endIndex--;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

		// find the index of 5
		System.out.println("Index position of 5 is: " + findIndex(my_array, 5));

		// find the index of 7
		System.out.println("Index position of 7 is: " + findIndex(my_array, 7));
	}

}
