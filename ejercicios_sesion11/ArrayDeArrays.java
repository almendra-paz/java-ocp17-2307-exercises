public class ArrayDeArrays{

	public static void main(String args[]){
		int[][] b = new int[2][];
		b[0] = new int[]{1,2,3};
		b[1] = new int[]{4,5};

		int[][][] c = new int[2][][];
		c[0] = b;
		c[1] = new int[][]{{7,8,9},{10,11,12}};

		for(int[] elem: c[0]){
			for(int ind: elem){
				System.out.println(ind);
			}
		}

		for(int i=0; i<c[1].length; i++){
			for(int j=0; j<c[1][i].length; j++){
				System.out.println(c[1][i][j]);
			}
		}

	}


}