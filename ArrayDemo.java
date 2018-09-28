class ArrayDemo {
	public static void printArray(int[]ary){
		String printar = "[";
		for (int x = 0; (x + 1) < ary.length; x++) {
			printar += ary[x] + ",";
		}
		System.out.println(printar + ary[ary.length - 1] + "]");
	}
	
	public static void printArray(int[][]ary){
		String printar = "[";
		for (int x = 0; x < ary.length; x++) {
			printar += "[";
			for (int y = 0; y < ary[x].length; y ++) {
				printar += ary[x][y] + ",";
			}
			printar += ary[x][ary[x].length - 1] + "]";
			if (x != ary.length - 1) {
				printar += ",";
			}
		}
		System.out.println(printar + "]");
	}
	
	public static int countZeros2D(int[][] nums){
		int count = 0;
		for (int x = 0; x < nums.length; x++) {
			for (int y = 0; y < nums[x].length; y++) {
				if (nums[x][y] == 0) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void fill2D(int[][] vals){
		for (int x = 0; x < vals.length; x++) {
			for (int y = 0; y < vals[x].length; y++) {
				if (y == x) {
					vals[x][y] = 3;
				}
				else {
					vals[x][y] = 1;
				}
			}
		}
		printArray(vals);
	}

	public static void main (String[] args) {
		int[] test0a = new int[] {
			1,2,3,4,5,6
		};
		int[][] test0b = new int[][] {
			{2,4,5,3,2},
			{2,5,2,6},
			{8,6,5,4,6,7},
		};
		int[][] test1 = new int[][] {
			{0,0,5,7,8,0},
			{4,7,8,9,0,6},
			{7,0,0,6,0,0},
		};
		printArray(test0a);
		printArray(test0b);
		System.out.println(countZeros2D(test1));
		fill2D(test1);
	}
}