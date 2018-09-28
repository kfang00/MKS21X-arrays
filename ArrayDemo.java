class ArrayDemo {
	public static void printArray(int[]ary){
		String printar = "[";
		for (int x = 0; (x + 1) < ary.length; x++) {
			printar += ary[x] + ",";
		}
		System.out.println(printar + ary[ary.length - 1] + "]");
	}


	public static void main (String[] args) {
		int[] test0 = new int[] {
			1,2,3,4,5,6
		};
		printArray(test0);
	}
}