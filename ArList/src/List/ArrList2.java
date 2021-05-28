package List;

import java.util.ArrayList;

public class ArrList2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		int conut = 0;
//		
//		list.add(10);//0
//		list.add(20);//1
//		list.add(30);//2
//		list.add(40);//3
//		list.add(50);//4
//		list.add(60);//5
//		list.add(70);//6
//		list.add(80);//7
		
		
		for (int i = 0; i < 9; i++) {
			list.add(i*10);
			
		}
		System.out.println(list);
		list.add(90);
		System.out.println(list);
		//indexOf : 값이 있으면 그 값이 들어있는 방번호를 주고 , 값이 없으면 -1을 준다.
		int idx = list.indexOf(10);
		if(idx != -1) {
			list.add(idx+1, 15);
		}else {
			list.add(0,15);
		}
		System.out.println(list);
		
		
//		for(Integer a : list) {
//			System.out.println(conut + "번째 숫자는 : " + a);
//			conut ++;
//		}
		
		// 60을 600으로 바꾸기.
		list.set(list.indexOf(60), 600);
		System.out.println(list);
		System.out.println(list.size());
		// 15지우기 
		list.remove(list.indexOf(15));
		System.out.println(list);
		System.out.println(list.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
