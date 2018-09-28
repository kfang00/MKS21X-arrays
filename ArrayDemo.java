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


	public static void main (String[] args) {
		int[] test0a = new int[] {
			1,2,3,4,5,6
		};
		int[][] test0b = new int[][] {
			{2,4,5,3,2},
			{2,5,2,6},
			{8,6,5,4,6,7},
		};
		printArray(test0a);
		printArray(test0b);
	}
}