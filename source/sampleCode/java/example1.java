package sampleCode.java;

public class example1 {

	public static void main (String[] args)
	{
		int sizeMatrix = 5;
		
		String[][] matics = new String[sizeMatrix][sizeMatrix];
		int startChar = 'A';
		// Create Matrix
		for (int i = 0; i < matics.length;++i)
		{
			for (int j = 0; j < matics[i].length;++j)
			{
				matics[i][j] = String.valueOf((char)((i*4)+j+startChar));
			}
			
		}
		System.out.println("Before Matrix");
		example1.printOutMatrix(matics);
		matics = example1.changeMatrix90(matics);
		System.out.println("After Matrix");
		example1.printOutMatrix(matics);
	}
	
	
	/** 
	* Move Matrix 90 degree from given Matrix
	* 
	* Example before 
	* A B C D E 
	* E F G H I 
	* I J K L M 
	* M N O P Q 
	* Q R S T U 
	* 
	* After 
	* Q M I E A 
	* R N J F B 
     * S O K G C 
	* T P L H D 
	* U Q M I E 
	* 
	*/
	
	public static String[][] changeMatrix90(String[][] inMatrix)
	{
		
		String[][] result = new String[inMatrix.length][inMatrix[0].length];
		for (int i = 0; i < inMatrix.length;++i)
		{
			for (int j = 0; j < inMatrix[i].length;++j)
			{
				int x = j;
				int y = inMatrix.length - i -1 ;
				result[x][y] =  inMatrix[i][j];
				
			}
		}
		return result;
	}
	
	/**
	 * Print out given matrix to console
	 * @param inMatrix is given matrix
	 */
	public static void printOutMatrix(String[][] inMatrix)
	{
		for (int i = 0; i < inMatrix.length;++i)
		{
			for (int j = 0; j < inMatrix[i].length;++j)
			{
				System.out.print(inMatrix[i][j]+ " ");
			}
			System.out.println("");
		}
	}
}
