package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<String,String>();
		
		map.put("aid", "aaaa");
		map.put("bid", "bbbb");
		map.put("bid", "bbbb");
		map.put("cid", "cccc");
		
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		
		while( !flag ){
			System.out.println("아이디입력:");
			String id = scan.nextLine();
			System.out.println("비밀번호 입력");
			String pw = scan.nextLine();
			
			if(map.containsKey(id)){
				if(map.get(id).equals(pw)){
					System.out.println("로그인 성공");
					flag = true;
				}else{
					System.out.println("로그인 실패");
					continue;
				}
			}else{
				System.out.println("존재하지 않는 아이디. 다시입력 ㄱㄱ");
				continue;
			}
		}
	}

}
