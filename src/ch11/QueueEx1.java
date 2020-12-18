package ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println(">>");
			try {
				
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".contentEquals(input))continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다");
					
				}else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					//입력받은 명령어를 저장하고,
					save(input);
					//LinkedList의 내용을 보여준다.
					LinkedList list = (LinkedList) q;
					ListIterator it = list.listIterator();
						//이부분을 모르겠음
				while(it.hasNext())
						System.out.println(++i+"."+it.next());
				//	final int SIZE = list.size();
				//	for(int j = 0; j<SIZE; j++) {
				//		System.out.println((j+1)+". "+list.get(j));
				//	}
				}else {
					save(input);
					System.out.println(input);
				}// if(input.equalsIgnoreCase("q")){
				
				
				
			}catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
		}//while (true)
		
		
	}//main()
public static void save(String input) {
	//queue에 저장한다
	if(!"".equals(input))
		q.offer(input);
	
	//queue의 최대크기를 넘으면 제일 처음 입련된것을 삭제한다
	if(q.size() > MAX_SIZE) // size()는 Collection인터페이스에 정의
		q.remove();
}

}//end of class
