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

			return min; // reached after iterating through the whole array
		}
	}

	/**
	 * 
	 * @param data
	 * @return the difference between the highest and the lowest
	 * item of the array.
	 * return 0 if array is null or empty.
	 */
	public static int diff(int[] data) {
		return max(data)-min(data); // using the previously defined max() and min() functions
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

			double average = sum/data.length; // compute the average
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
		/*
			(A bubble sort algorithim)
			Compare one pair of adjacent items at a time and if they
			are in the wrong order, swap them. Then move on to the
			next pair and repeat this check and possible swap until 
			the end of the array is reached. Then check if the array 
			is in the correct order and if not repeat the whole process.
		*/

		if (data == null) { // check for null array
			return null;
		} else if (data.length == 0) { // check for empty array
			return new int[0];
		} else {
			/*
				Create a new array that will be sorted and eventually
				returned. It is intially an instance copy of data 
				before we sort it.
			*/

			int[] sortArr = new int[data.length];

			for (int i = 0; i < data.length; i++) {
				sortArr[i] = data[i];
			}

			while (!isAscending(sortArr)) { // only keep sorting when the array is not already sorted
				for (int i = 0; i < data.length-1; i++) { // the first item of the pair to be checked
					if (sortArr[i] > sortArr[i+1]) {
						/*
							When the pair must be swapped we have to store
							the value of each item of the pair in temporary 
							variables and then assign them to the correct 
							positions in the array. 
						*/

						int higher = sortArr[i]; 
						int lower = sortArr[i+1];

						sortArr[i+1] = higher;
						sortArr[i] = lower;
					}
				}
			}

			return sortArr; // we reach this only when the array is in ascending order
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
		if (data == null || data.length == 0) { // null and empty array check
			return 0;
		} else {
			int[] sortedArr = sorted(data); // obtain the sorted array
			int len = sortedArr.length;

			/*
				The item of the sorted array that must be
				returned depends on whether there is an 
				even or odd number of items in the array.
			*/

			if (len%2  == 0) {
				return sortedArr[len/2-1];
			} else {
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
		if (data == null || data.length == 0) { // null and empty array check
			return 0;
		} else {
			int len = data.length;

			/* 
				Create an array and populate it such that item i 
				of that array holds the number of times that item 
				i of the data array occurs in the data array.
			*/

			int[] countArr = new int[len];

			for (int i = 0; i < len; i++) {
				countArr[i] = countOccurrences(data, data[i]); 
			}

			/*
				Find and store the number of times the most common
				item occurs.
				Then iterate through countArr to find the index of 
				the first item to occur that many times.
				Then return the corresponding item from the data array.
			*/

			int maxCount = max(countArr);

			for (int j = 0; j < len; j++) {
				if (maxCount == countArr[j]) {
					return data[j];
				}
			}
		}

		return 0; // mathematically this line will never be reached
	}
	
	/**
	 * HD - 1
	 * @param data
	 * @return the length of the longest ascending sequence in the array
	 * return 0 if array is null or empty.
	 */
	public static int longestAscendingSequenceLength(int[] data) {
		if (data == null || data.length == 0) { // null and empty array check
			return 0;
		} else {
			return longestAscendingSequenceLength(data, 0, 1, 0); // initial call to the recursive function
		}
	}

	public static int longestAscendingSequenceLength(int[] data, int start, int compare, int max) {
		/* 
			data: the input array
			start: the beginning of sequence we are checking if ascending
			compare: the current item to check if larger than the prior
			max: the largest ascending sequence length found so far
		*/

		if (start >= data.length) {
			/* 
				We have checked everywhere for ascending 
				sequences so return the longest length found.
			*/

			return max; 
		}

		if (compare >= data.length || data[compare] < data[compare-1]) {
			/*
				The sequence is no longer ascending because either:
				- the current ascending sequence goes until the end of the array
				- the current pair being checked is not ascending
				So now call the recursive function again with the appropiate
				parameters passed.
				The next sequence to check begins just after where this
				sequence ended so update start and compare accordingly.
				If this sequence is the longest found thus far update the 
				longest length.
			*/

			int potentialMax = compare-start; // the length of the ascending sequence that just ended

			if (potentialMax > max) {
				return longestAscendingSequenceLength(data, compare, compare+1, potentialMax);
			} else {
				return longestAscendingSequenceLength(data, compare, compare+1, max);
			}
		} else {
			/*
				The sequence is still ascending so recursively call the function
				to continue checking if this sequence is ascending.
				Don't change start because we continue checking the same sequence.
				Move on to the next pair, so increment compare.
			*/ 

			return longestAscendingSequenceLength(data, start, compare+1, max);
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
		if (data == null || data.length == 0) { // null and empty array check
			return -1;
		} else {
			return longestAscendingSequenceStart(data, 0, 1, 0, 0); // initial call to the recursive function
		}
	}
	
	public static int longestAscendingSequenceStart(int[] data, int start, int compare, int max, int maxId) {
		/* 
			data: the input array
			start: the beginning of sequence we are checking if ascending
			compare: the current item to check if larger than the prior
			max: the largest ascending sequence length so far
			maxId: where the longest ascending sequence begins
		*/ 

		if (start >= data.length) {
			/* 
				We have checked everywhere for ascending 
				sequences so return where the longest was 
				found.
			*/

			return maxId;
		}
		if (compare >= data.length || data[compare] < data[compare-1]) {
			/*
				The sequence is no longer ascending because either:
				- the current ascending sequence goes until the end of the array
				- the current pair being checked is not ascending
				So now call the recursive function again with the appropiate
				parameters passed.
				The next sequence to check begins just after where this
				sequence ended so update start and compare accordingly.
				If this sequence is the longest found thus far update the 
				longest length and where it starts.
			*/

			int potentialMax = compare-start; // the length of the ascending sequence that just ended

			if (potentialMax > max) {
				return longestAscendingSequenceStart(data, compare, compare+1, potentialMax, start);
			} else {
				return longestAscendingSequenceStart(data, compare, compare+1, max, maxId);
			}
		} else {
			/*
				The sequence is still ascending so recursively call the function
				to continue checking if this sequence is ascending.
				Don't change start because we continue checking the same sequence.
				Move on to the next pair, so increment compare.
			*/ 

			return longestAscendingSequenceStart(data, start, compare+1, max, maxId);
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
		if (data == null) { // null array check
			return null; 
		} else if (data.length == 0) { // empty array check
			return new int[0];
		} else {
			/*
				Use the previous functions to find the length 
				and beginning of the longest ascending sequence. 
			*/

			int length = longestAscendingSequenceLength(data);
			int start = longestAscendingSequenceStart(data);
			int[] ascendingArray = new int[length]; // this will be the ascending sequence

			/*
				Iterate from the start'th item of the original data to 
				the end of the asecnding sequence (using its known length).
			*/

			for (int i = 0; i < length; i++) { //
				ascendingArray[i] = data[i+start];
			}

			for (int i = 0; i < length; i++) {
				System.out.println(ascendingArray[i]);
			}

			System.out.println("end of array");
			return ascendingArray;
		}
	}
}
