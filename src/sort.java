
public class sort{   
	public static void main(String[] args){    
		int score[] = {67, 69, 75, 87, 89, 90, 99, 100};     
		for (int i = 0; i < score.length -1; i++){    
			for(int j = 0 ;j < score.length - i - 1; j++){    
				if(score[j] < score[j + 1]){                  
					int temp = score[j];                     
					score[j] = score[j + 1];                    
					score[j + 1] = temp;                
					}         
				}                        
			System.out.print( i + 1);         
			for(int a = 0; a < score.length; a++){     
				System.out.print(score[a] + "\t");        
				}  
			System.out.println("");       
				}     				
		for(int a = 0; a < score.length; a++){                 					
			System.out.print(score[a] + "\t");     					
		}     
				
	}  
}
