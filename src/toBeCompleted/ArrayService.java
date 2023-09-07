package toBeCompleted;

public class ArrayService {
	/**
	 * 
	 * @param data
	 * @param item
	 * @return the first index at which target exists
	 * in array data, -1 if it doesn't
	 * 
	 * return -1 if array is null or empty.
	 */
	// completed
	public static int indexOf(int[] data, int target) {
		if (data == null || data.length == 0) {
			return -1; 
		} else {
			for (int i = 0; i < data.length; i++) {
				if (data[i] == target) {
					return i;
				}
			}
		}
		return -1;
	}
	
	/**
	 * 
	 * @param data
	 * @param item
	 * @return the number of times target appears in the array data
	 * 
	 * return 0 if array is null or empty.
	 */
	// completed
	public static int countOccurrences(int[] data, int target) {
		if (data == null || data.length == 0) {
			return 0; 
		} else {
			int count = 0;
			for (int i = 0; i < data.length; i++) {
				if (data[i] == target) {
					count++;
				}
			}
			return count;
		}
	}
	
	/**
	 * 
	 * @param data
	 * @return the highest item in the array.
	 * return 0 if array is null or empty.
	 */
	// completed
	public static int max(int[] data) {
		if (data == null || data.length == 0) {
			return 0; 
		} else {
			int max = data[0];
			for (int i = 0; i < data.length; i++) {
				if (data[i] > max) {
					max = data[i];
				}
			}
			return max;
		}
	}
	
	/**
	 * 
	 * @param data
	 * @return the smallest item in the array.
	 * return 0 if array is null or empty.
	 */
	// completed
	public static int min(int[] data) {
		int min = 0;
		if (data == null || data.length == 0) {
			return 0;
		} else {
			min = data[0];
			for (int i = 0; i < data.length; i++) {
				if (data[i] < min) {
					min = data[i];
				}
			}
		}
		return min;
	}

	/**
	 * 
	 * @param data
	 * @return the difference between the highest and the lowest
	 * item of the array.
	 * return 0 if array is null or empty.
	 */
	// completed
	public static int diff(int[] data) {
		return max(data) - min(data);
	}
	
	/**
	 * 
	 * @param data
	 * @return true if array is sorted in ascending order.
	 * EXAMPLE: {10, 10, 15} is in ascending order 
	 * (even though not in STRICTLY ascending order), so the 
	 * function must return true for array {10, 10, 15}	 
	 * return false if array is null
	 * return true if array is empty or has a single item (vacuous truth)
	 */
	// completed 
	public static boolean isAscending(int[] data) {
		if (data == null) {
			return false;
		} else if (data.length <= 1) {
			return true;
		} else {
			for (int i = 0; i < data.length-1; i++) {
				if (data[i] > data[i+1]) {
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * 
	 * @param data
	 * @return true if array is sorted in descending order.
	 * EXAMPLE: {10, 10, 5} is in descending order 
	 * (even though not in STRICTLY descending order), so the 
	 * function must return true for array {10, 10, 5}
	 * return false if array is null
	 * return true if array is empty or has a single item (vacuous truth)
	 */
	// completed
	public static boolean isDescending(int[] data) {
		if (data == null) {
			return false;
		} else if (data.length <= 1) {
			return true;
		} else {
			for (int i = 0; i < data.length-1; i++) {
				if (data[i] < data[i+1]) {
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * 
	 * @param data
	 * @return the average of the array.
	 * return 0 if array is null or empty.
	 */
	// completed
	public static double average(int[] data) {
		if (data == null || data.length == 0) {
			return 0;
		} else {
			double sum = 0;
			for (int i = 0; i < data.length; i++) {
				sum += data[i];
			}
			return sum / data.length;
		}
	}
	
	/**
	 * 
	 * @param data
	 * @return an ascending order sorted version of data
	 * IMPORTANT: the parameter array itself should NOT be modified
	 *
	 * return null array if array is null
	 * return empty array if array is empty
	 */
	// completed
	public static int[] sorted(int[] data) {
		// a bubble sort algorithim 
		if (data == null) {
			return null;
		} else if (data.length == 0) {
			return new int[0];
		} else {
			int[] sortArr = new int[data.length]; // this will be the sorted version of the data
			for (int i = 0; i < data.length; i++) {
				sortArr[i] = data[i];
			}
			while (!isAscending(sortArr)) { // one iteration of the while loop is one sweep through the array
				for (int i = 0; i < data.length - 1; i++) {
					if (sortArr[i] > sortArr[i+1]) { // if adjacent items not ascending they must be swapped
						// store their values in a and b
						int a = sortArr[i]; 
						int b = sortArr[i+1];
						// perform the swap
						sortArr[i+1] = a;
						sortArr[i] = b;
					}
				}
			}
			return sortArr;
		}	
	}

	/**
	 * 
	 * @param data
	 * @return the "median" item of the array.
	 * we define median as the item that sits in the middle
	 * when the array is sorted in ascending order.
	 * If the array has an even number of items, use the item to 
	 * the LEFT of the middle parting line.
	 * For example, if the array is {10, 70, 20, 90, 60, 10, 70, 40},
	 * the sorted array is {10, 10, 20, 40, 60, 70, 70, 90}, and the items 
	 * to the left and right of the middle line are 40 and 60.
	 * Thus the function must return 40 in this case.
	 * If the array is {30, 10, 20, 50, 40}, the sorted array is
	 * {10, 20, 30, 40, 50} and the answer is clear: 30
	 * 
	 * return 0 if array is null or empty.
	 */
	public static int median(int[] data) {
		if (data == null || data.length == 0) {
			return 0;
		} else {
			int[] sortedArr = sorted(data);
			int len = sortedArr.length; // storing the array length as magic number
			if (len%2  == 0) { // when the array has an even number of items
				return sortedArr[len/2-1];
			} else { // when the array has an odd number of items
				return sortedArr[len/2];	
			}
			
		}
	}

	/**
	 * 
	 * @param data
	 * @return the most common item in the array.
	 * IMPORTANT: in case of tie, return the item that occurs first in the array
	 * 
	 * return 0 if the array is null or empty
	 */
	public static int mostCommonItem(int[] data) {
		if (data == null || data.length == 0) {
			return 0;
		} else {
			int len = data.length; // storing data's length as a magic number
			int[] countArr = new int[len]; // will be an array holding number of occurences of each integer in data
			for (int i = 0; i < len; i++) {
				countArr[i] = countOccurrences(data, data[i]);
			}
			int maxCount = max(countArr); // the highest number of times the same integer is in data
			for (int j = 0; j < len; j++) {
				if (maxCount == countArr[j]) {
					return data[j];
				}
			}
		}
		return 0; // this line will never be reached unless there is a logic error (only here to satisfy syntax)
	}
	
	/**
	 * HD - 1
	 * @param data
	 * @return the length of the longest ascending sequence in the array
	 * return 0 if array is null or empty.
	 */
	public static int longestAscendingSequenceLength(int[] data) {
		if (data == null || data.length == 0) {
			return 0;
		} else {
			// call the recursive version
			return longestAscendingSequenceLength(data, 0, 0);
		}
	}

	public static int longestAscendingSequenceLength(int[] data, int max, int start) {
		if (start >= data.length - max) {
			return max;
		} else {
			for (int i = start; i < data.length-1; i++) {
				if (data[i] < data[i+1]) {
					// not ascending anymore so move onto checking from the next item in array
					return longestAscendingSequenceLength(data, max, i+1);
				} else {
					// that pair of items was ascending so increment max by one
					max++;
				}
			}
			// if it reaches here then the ascending sequence goes to the end of the array
			return max;
		}
	}

	/**
	 * HD - 2
	 * @param data
	 * @return the starting index of the longest ascending sequence in the array
	 * in case of tie, return the starting index of the first of the tied sequences
	 * return -1 if array is null or empty.
	 */
	public static int longestAscendingSequenceStart(int[] data) {
		return -1;
	}
	
	/**
	 * HD - 3
	 * @param data
	 * @return the longest ascending sequence in the array
	 * in case of tie, return the first of the tied sequences
	 * return null if array is null
	 * return empty arsray if array is empty
	 */
	public static int[] longestAscendingSequence(int[] data) {
		return new int[0];
		// testing
		// testing times two
	}
}
