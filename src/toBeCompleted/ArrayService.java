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
	public static int indexOf(int[] data, int target) {
		/*
			Our approach iterates through each item of the array
			and checks if it is the target in which case it returns 
			the current index. 
		*/

		if (data == null || data.length == 0) {
			return -1; 
		} else {
			for (int i = 0; i < data.length; i++) {
				if (data[i] == target) {
					return i;
				}
			}
		}

		return -1; // only reached if no matches with target are found
	}
	
	/**
	 * 
	 * @param data
	 * @param item
	 * @return the number of times target appears in the array data
	 * 
	 * return 0 if array is null or empty.
	 */
	public static int countOccurrences(int[] data, int target) {
		/*
			Our approach iterates through each item of the array
			and checks if it is the target in which case it increases
			the count variable by one.
			Once the end of the array is reached it returns the count
			variable.
		*/

		if (data == null || data.length == 0) { // checking null and empty array cases
			return 0; 
		} else {
			int count = 0;

			for (int i = 0; i < data.length; i++) {
				if (data[i] == target) {
					count++;
				}
			}

			return count; // reached after iterating through the whole array
		}
	}
	
	/**
	 * 
	 * @param data
	 * @return the highest item in the array.
	 * return 0 if array is null or empty.
	 */
	public static int max(int[] data) {
		if (data == null || data.length == 0) { // checking null and empty array cases
			return 0; 
		} else {
			/*  
				intialising max as the 0th item in the array ensures 
				it is a value from the array that is returned and not 
				some placeholder value.
			*/

			int max = data[0];

			/*
				Iterates through each item of the array
				and checks if the item is larger than the largest item
				currently found. If so it sets the max variable to that
				item's value. 
			*/

			for (int i = 0; i < data.length; i++) {
				if (data[i] > max) {
					max = data[i];
				}
			}

			return max; // reached after iterating through the whole array
		}
	}
	
	/**
	 * 
	 * @param data
	 * @return the smallest item in the array.
	 * return 0 if array is null or empty.
	 */
	public static int min(int[] data) {
		if (data == null || data.length == 0) { // checking null and empty array cases
			return 0;
		} else {
			/*  
				intialising min as the 0th item in the array ensures 
				it is a value from the array that is returned and not 
				some placeholder value.
			*/

			int min = data[0];
			
			/*
				Iterates through each item of the array
				and checks if the item is smaller than the smallest item
				currently found. If so it sets the min variable to that
				item's value. 
			*/	

			for (int i = 0; i < data.length; i++) {
				if (data[i] < min) {
					min = data[i];
				}
			}
		}

		return min; // reached after iterating through the whole array
	}

	/**
	 * 
	 * @param data
	 * @return the difference between the highest and the lowest
	 * item of the array.
	 * return 0 if array is null or empty.
	 */
	public static int diff(int[] data) {
		return max(data) - min(data); // using the previously defined max() and min() functions
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
	public static boolean isAscending(int[] data) {
		if (data == null) { // checking for null array
			return false;
		} else if (data.length <= 1) { // checking for vacuous truths
			return true;
		} else {
			/*
				Iterate through each item of the array, up until the
				second last item, and checks if it is larger than the 
				next item in which case we return false straight away
				(because that means this pair, and thus the whole 
				array, is not in ascending order).
			*/

			for (int i = 0; i < data.length-1; i++) {
				if (data[i] > data[i+1]) {
					return false;
				}
			}

			return true; // only reaches here if no descending pairs were found
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
	public static boolean isDescending(int[] data) {
		if (data == null) { // checking for null array
			return false;
		} else if (data.length <= 1) { // checking for vacuous truths
			return true;
		} else {
			/*
				Iterate through each item of the array, up until the
				second last item, and checks if it is smaller than the 
				next item in which case we return false straight away
				(because that means this pair, and thus the whole 
				array, is not in descending order).
			*/

			for (int i = 0; i < data.length-1; i++) {
				if (data[i] < data[i+1]) {
					return false;
				}
			}

			return true; // only reaches here if no ascending pairs were found
		}
	}

	/**
	 * 
	 * @param data
	 * @return the average of the array.
	 * return 0 if array is null or empty.
	 */
	public static double average(int[] data) {
		if (data == null || data.length == 0) { // checking null and empty arrays
			return 0;
		} else {
			double sum = 0; // double is used the later division returns a double

			/*
				Iterate through the array to and add each item's 
				value to sum to obtain the sum of the array.
			*/

			for (int i = 0; i < data.length; i++) {
				sum += data[i];
			}

			double average = sum / data.length; // compute the average
			return average;  
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
			// call the recursive function
			return longestAscendingSequenceLength(data, 0, 1, 0);
		}
	}
	/* 
	 * data: the input array
	 * start: the beginning of sequence we are checking if ascending
	 * compare: the current item to check if larger than the prior
	 * max: the largest ascending sequence length so far
	*/ 
	public static int longestAscendingSequenceLength(int[] data, int start, int compare, int max) {
		if (start >= data.length) {
			// once reach end of data array then return max
			return max;
		}
		if (compare >= data.length || data[compare] < data[compare - 1]) {
			// the sequence is no longer ascending so move onto the next possibility
			int potentialMax = compare - start; // the length of the ascending sequence we just found
			if (potentialMax > max) {
				return longestAscendingSequenceLength(data, compare, compare+1, compare-start);
			} else {
				return longestAscendingSequenceLength(data, compare, compare+1, max);
			}
		} else {
			// the sequence is (so far) ascending so continue checking if its longer
			return longestAscendingSequenceLength(data, start, compare + 1, max);
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
		if (data == null || data.length == 0) {
			return -1;
		} else {
			// call the recursive function
			return longestAscendingSequenceStart(data, 0, 1, 0, 0);
		}
	}
	/* 
	 * data: the input array
	 * start: the beginning of sequence we are checking if ascending
	 * compare: the current item to check if larger than the prior
	 * max: the largest ascending sequence length so far
	 * maxId: where the longest ascending sequence begins
	*/ 
	public static int longestAscendingSequenceStart(int[] data, int start, int compare, int max, int maxId) {
		if (start >= data.length) {
			// once reach end of data array then return where the longest ascending sequence begins
			return maxId;
		}
		if (compare >= data.length || data[compare] < data[compare - 1]) {
			// the sequence is no longer ascending so move onto the next possibility
			int potentialMax = compare - start; // the length of the ascending sequence we just found
			if (potentialMax > max) {
				return longestAscendingSequenceStart(data, compare, compare+1, compare-start, start);
			} else {
				return longestAscendingSequenceStart(data, compare, compare+1, max, maxId);
			}
		} else {
			// the sequence is (so far) ascending so continue checking if its longer
			return longestAscendingSequenceStart(data, start, compare + 1, max, maxId);
		}
	}
	
	/**
	 * HD - 3
	 * @param data
	 * @return the longest ascending sequence in the array
	 * in case of tie, return the first of the tied sequences
	 * return null if array is null
	 * return empty array if array is empty
	 */
	public static int[] longestAscendingSequence(int[] data) {
		if (data == null) {
			return null; 
		} else if (data.length == 0) {
			return new int[0];
		} else {
			int length = longestAscendingSequenceLength(data);
			int start = longestAscendingSequenceStart(data);
			int[] arr = new int[length];
			for (int i = 0; i < length; i++) {
				arr[i] = data[i + start];
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("end of array");
			return arr;
		}
	}
}
