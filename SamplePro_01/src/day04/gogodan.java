package day04;

public class gogodan {

	public static void main(String[] args) {
		int num = 0 ;

		if(args.length != 0){
			num = Integer.parseInt(args[0]);
		}
		
		System.out.println("*** 구구단 ***");
		OUT: for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == num) break;
					//break OUT;
				// if(j==5) continue;
				System.out.printf("%d*%d=%2d  |", j, i, j * i);
				// System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	}

}
