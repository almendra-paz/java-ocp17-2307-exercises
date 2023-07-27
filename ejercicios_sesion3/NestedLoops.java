public class NestedLoops{

	public static void main(String args[]){
		
		// ---- Loops Anidados		
		int[][] values = {{1,2,3},{2,3},{2},{4,5,6,7}};

		int sum = 0;
		for(int i = 0; i<values.length; i++){
			for(int j=0; j<values[i].length; j++){
				sum = sum + values[i][j];
			}
		}
		System.out.println("Sum is"+sum);
		
		//Uso de Break (sin etiquetas)		
		for(int i = 0; i<values.length; i++){
			for(int j=0; j<values[i].length; j++){
				System.out.println(values[i][j]);
				if(values[i][j]>0) break;								
			}
		}
		System.out.println("---------");
		
		// ---- Uso Continue		
		// imprimiendo el elementos de cada elemento
		int[][] values2 = {{1,2,3},{4,5},{6},{7,8,9}};
		
		out2: 
		outfor: for(int i = 0; i<values2.length; i++){
			innfor: for(int j=0; j<values2[i].length; j++){
				System.out.println(values2[i][j]);
				if(values2[i][j] >0) continue out2;				
			}
		}
		
	// ---- Uso Break
	System.out.println("--- Break labeled ---");
	int[][] values3 = {{1,2,3},{4,5},{6},{7,8,9}};
	OUT:{
	OUTER: for(int i = 0; i<values3.length; i++){
				for(int j=0; j<values3[i].length; j++){
					if(j >0) break OUTER;
					System.out.println(values3[i][j]);
				}
	}	
	}
	System.out.println("--- Fin Break labeled ---");

		
		var array = new String[]{"a","b"};

		LABEL_1: for(String s: array){
			System.out.println(s);
			for(int i=0; i<10; i++){
				if(i == 2) continue LABEL_1;
			}
		}

		OTRA:{
			System.out.println("Dentro de un label");
		}		
	
	}

}