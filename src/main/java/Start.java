
public class Start {

	public static void main(String[] args) {
		String[][] array = {
			
			{"1","2","3"," 4"},
			{"1","2","3","4"},
			{"1","2","3","4"},
			{"1","2","3","4"},
			
			
			};
		
		try {
			System.out.println("Result of calculation: " + calculation(array));
			
		} catch (MyArraySizeException | MyArrayDataException e) {
			System.out.println("Error of calculation: " + e.getMessage());
		} 
		

	}

	public static int calculation (String[][] array) throws MyArraySizeException, MyArrayDataException{
		int result = 0;
		if (array.length != 4){
			throw new MyArraySizeException("There must be four rows");
		}
		
		for (String[] innerArray : array) {
			if (innerArray.length != 4){
				throw new MyArraySizeException("Each rows must contain four elements");
			}
		}
		
	for (int i = 0; i < array.length; i++) {
		
		for (int j = 0; j < array[i].length; j++) {
			try {
				result += Integer.parseInt(array[i][j]);
			} catch (NumberFormatException e){
				
				throw new MyArrayDataException("In array[" + i + "][" + j + "] lay: '" + array[i][j] + "', but should be a number");
			}
			
			
		}
		
		
	}	
		
		return result;
	}
	
	
	}

