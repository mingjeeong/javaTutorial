package day13;

public class BlockStopTest {

	public static void main(String[] args) {

		END:
		for(int i=0; i<2; i++){
			for(int j =0; j<3; j++){
				if(j==1){
					//break;
					//continue;
					break END;
				}
				System.out.println("i="+i+", j="+j);
			}
		}
	}

}
