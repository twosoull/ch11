package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue01 {
	static  Queue q =new LinkedList();
	static  final int MAX_SIZE = 5;
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 보실 수 있습니다");
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.print(">>");
		String str = sc.nextLine().trim();
		
		if(str.equals("")) {
			continue;
		}
		
		if(str.equalsIgnoreCase("q")) {
			System.out.println("종료되었습니다");
			System.exit(0);
		}else if(str.equalsIgnoreCase("help")) {
			System.out.println("help는 도움말");
			System.out.println("q 또는 Q입력 프로그램종료");
			System.out.println("history - 최근입력한 명령어를 "+MAX_SIZE+"개 보여줍니다");
			save(str);
		}else if (str.equalsIgnoreCase("history")) {
			System.out.println("최근 입력한 명령어를 보여줍니다");
			save(str);
			LinkedList lk = (LinkedList) q;
			for(int i = 0; i <lk.size(); i++) {
				System.out.println((i+1)+".  "+lk.get(i));
			}
		}else {
			save(str);
		}
		
	}
	}
	public static void save(String a) {
		if(!"".equals(a)) {
			q.offer(a);
		}
		
		if(q.size() > MAX_SIZE) {
			q.poll();
		}
	}
	
}
