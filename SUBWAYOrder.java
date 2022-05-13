package pP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import myungji.Source;
import myungji.Vegetable;

public class SUBWAYOrder{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.in은 키보드를 의미한다!
		
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1. 터키 베이컨 아보카도 - 15cm 6,900원 30cm 12,200원");
		System.out.println("2. 로티세리 바비큐 치킨 - 15cm 6,400원 30cm 11,600원");
		System.out.println("3. 스테이크 & 치즈 - 15cm 6,900원 30cm 12,200원");
		System.out.println("4. K-바비큐 - 15cm 6,400원 30cm 11,600원");
		System.out.println("5. 풀드 포크 바비큐 - 15cm 6,300원 30cm 11,400원");
		System.out.println("6. 써브웨이 클럽 - 15cm 6,200원 30cm 11,200원");
		System.out.println("7. 쉬림프 - 15cm 6,200원 30cm 11,200원");
		System.out.println("8. 스파이시 이탈리안 - 15cm 6,000원 30cm 11,000원");
		System.out.println("9. 치킨 데리야끼 - 15cm 6,000원 30cm 11,000원");
		System.out.println("10. 비엘티 - 15cm 5,700원 30cm 10,400원");
		System.out.println("11. 이탈리안비엠티 - 15cm 6,400원 30cm 11,600원");
		System.out.println("12. 미트볼 - 15cm 5,600원 30cm 10,300원");
		System.out.println("13. 터키 - 15cm 5,600원 30cm 10,300원");
		System.out.println("14. 참치 - 15cm 4,900원 30cm 9,400원");
		System.out.println("15. 햄 - 15cm 4,900원	 30cm 9,400원");
		System.out.println("16. 에그마요 - 15cm 4,600원 30cm 8,500원");
		System.out.println("17. 베지 - 15cm 4,100원 30cm 7,600원");
		System.out.println("18. 로스트 치킨 - 15cm 6,400원 30cm 11,600원");
		System.out.print("샌드위치 선택: ");
		int menuNo = sc.nextInt();
//		---------------------------
		System.out.println();
		int[] breadLength=new int[] {15,30};
		
		System.out.println("*** 빵 길이 선택 ***");
		
		for(int i=0;i<breadLength.length;i++) {
			System.out.println((i+1)+". "+breadLength[i]+"cm");
		}
		
		System.out.print("빵 길이 선택: ");
		int breadLengthNum=sc.nextInt();
				
		System.out.println();
		System.out.println("*** 빵 선택 ***");
		String[] arr= {"1. 화이트", "2. 파마산 오레가노", "3. 위트", "4. 허니오트", "5. 하티", "6. 플랫브레드"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.print("빵 선택: ");
		int num1=sc.nextInt();
		String bread="";
//		if else 문 전의 String 문의 형식과 조금 다름!
		switch(num1) {
		case 1 : 
			bread = "화이트";
			break;
		case 2 : 
			bread = "파마산 오레가노";
			break;
		case 3 : 
			bread = "위트";
			break;
		case 4 : 
			bread = "허니오트";
			break;
		case 5 : 
			bread = "하티";
			break;
		case 6 : 
			bread = "플렛브래드";
			break;
		default :
			System.out.println("선택하신 빵은 없는 메뉴입니다.");
//		빵 길이가 30cm일 때 가격은 어떻게 적용하나요?
	}
		
		System.out.println();
		System.out.println("*** 토스팅 선택 ***");
		System.out.println("1. 안함");
		System.out.println("2. 토스팅 하기");
		System.out.print("토스팅 선택: ");
		int menuNo3 = sc.nextInt();
		String toasting;
		if(menuNo3==1) {
			toasting="안함";
		}else {
			toasting="토스팅 하기";
		}
		
		System.out.println();
		System.out.println("*** 치즈 선택 ***");
		String[] arr1 = {"1. 아메리칸치즈", "2. 슈레드치즈", "3. 모차렐라치즈", "4. 치즈 제외"};
		for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i]);
		}
		System.out.print("치즈 선택: ");
		int num2=sc.nextInt();
		String cheese="";
		switch(num2) {
		case 1 : 
			cheese = "아메리칸치즈";
			break;
		case 2 : 
			cheese = "슈레드치즈";
			break;
		case 3 : 
			cheese = "모차렐라치즈";
			break;
		case 4 : 
			cheese = "치즈제외";
			break;
		default :
			System.out.println("선택하신 치즈는 없는 메뉴입니다.");
	}
		
		System.out.println();
//		switch break 문 보다는 if else if else 문 사용 추천
		Vegetable[] vegetables=new Vegetable[]{
				new Vegetable("양상추"),new Vegetable("토마토"),new Vegetable("오이"),
				new Vegetable("피망"),new Vegetable("양파"),new Vegetable("피클"),
				new Vegetable("올리브"),new Vegetable("할라피뇨"),
		};
		System.out.println("*** 야채 선택 ***");
		
		for(int i=0;i<vegetables.length;i++) {
			System.out.println((i+1)+". "+vegetables[i].getVarieties());
		}
		System.out.println(vegetables.length+1+". 모든 야채 제외");
		System.out.println(vegetables.length+2+". 선택 완료");
		
		System.out.print("야채 선택(다중 선택): ");
//		다중 선택 후 10번 선택, 화면에 ok와 같음
		
		List<Vegetable> vegetableList=new ArrayList<Vegetable>();
		
		for(int i=0;i<vegetables.length;i++) {
			int vegetablesNum=sc.nextInt();
			
			
			if(vegetablesNum-1<vegetables.length) {
				vegetableList.add(vegetables[vegetablesNum-1]);
			} else if(vegetablesNum-1==vegetables.length) {
				vegetableList.clear();
				break;
				
			} else if(vegetablesNum-1==vegetables.length+1) {
				break;
			}
			else {
				break;
			}
		}
		System.out.println();
//		3개까지 선택/3개 이상 선택시 '소스/시즈닝은 3개까지 선택가능합니다!' 알림
		Source[] sources=new Source[] {
				new Source("알싸한 머스타드"),new Source("상큼한 이탈리안드레싱"),
				new Source("과일향 레드와인식초"),new Source("달콤한 스위트 어니언"),
				new Source("새콤달콤한 허니 머스타드"),new Source("매콤달콤한 스위트 칠리"),
				new Source("스모크 향 스모크 바비큐"),new Source("크리미한 랜치"),
				new Source("고소한 마요네즈"),new Source("화끈하게 매운 핫 칠리"),
				new Source("이국적으로 매콤한 사우스 웨스트 치폴레"),new Source("알싸한 홀스래디쉬"),
				new Source("이태리 엑스트라버진 올리브 오일"),new Source("소금"),
				new Source("후추"),};
		
		System.out.println("*** 소스/시즈닝 선택 ***");
		
		for(int i=0;i<sources.length;i++) {
			System.out.println((i+1)+". "+sources[i].getVarieties());
		}
		System.out.println(sources.length+1+". 선택안함");
		System.out.println(sources.length+2+". 선택 완료");
		
		System.out.print("소스/시즈닝 선택(3개까지 가능): ");

		List<Source> sourceList=new ArrayList<Source>();
		
		for(int i=0;i<3;i++) { 
			int sourcesNum=sc.nextInt();
			
			if(sourcesNum-1<sources.length) {
				sourceList.add(sources[sourcesNum-1]);
			} else if(sourcesNum-1==sources.length) {
				sourceList.clear();
				break;
			} else if(sourcesNum-1==sources.length+1) {
				break;
			}
			else {
				break;
			}			
		}
		
		System.out.println();
		System.out.print("주문 수량 >>> ");
		int amount = sc.nextInt();
		
		System.out.println();
		System.out.print("입금액 >>> ");
		int money = sc.nextInt();
		sc.nextLine();
		
		System.out.println("---");
		
		String subwayStr = ""; // 샌드위치 종류가 저장될 변수
		int price = 0; // 샌드위치 단가가 저장될 변수
		
		if (breadLengthNum == 1){
			switch(menuNo) {
				case 1 : 
					subwayStr = "터키 베이컨 아보카도";
					price = 6900 ;
					break;
				case 2 : 
					subwayStr = "로티세리 바비큐 치킨";
					price = 6400;
					break;
				case 3 : 
					subwayStr = "스테이크 & 치즈";
					price = 6900;
					break;
				case 4 : 
					subwayStr = "K-바비큐";
					price = 6400;
					break;
				case 5 : 
					subwayStr = "풀드 포크 바비큐";
					price = 6300;
					break;
				case 6 : 
					subwayStr = "써브웨이 클럽";
					price = 6200;
					break;
				case 7 : 
					subwayStr = "쉬림프";
					price = 6200;
					break;
				case 8 : 
					subwayStr = "스파이시 이탈리안";
					price = 6000;
					break;
				case 9 : 
					subwayStr = "치킨 데리야끼";
					price = 6000;
					break;
				case 10 : 
					subwayStr = "비엘티";
					price = 5700;
					break;
				case 11 : 
					subwayStr = "이탈리안비엠티";
					price = 6400;
					break;
				case 12 : 
					subwayStr = "미트볼";
					price = 5600;
					break;
				case 13 : 
					subwayStr = "터키";
					price = 5600;
					break;
				case 14 : 
					subwayStr = "참치";
					price = 4900;
					break;
				case 15 : 
					subwayStr = "햄";
					price = 4900;
					break;
				case 16 : 
					subwayStr = "에그마요";
					price = 4600;
					break;
				case 17 : 
					subwayStr = "베지";
					price = 4100;
					break;
				case 18 : 
					subwayStr = "로스트 치킨";
					price = 6400;
					break;
				default :
					System.out.println("선택하신 샌드위치는 없는 메뉴입니다.");
	//			빵 길이가 30cm일 때 가격은 어떻게 적용하나요?
			}
		}
			else if (breadLengthNum == 2){
				switch(menuNo) {
				case 1 : 
					subwayStr = "터키 베이컨 아보카도";
					price = 12200 ;
					break;
				case 2 : 
					subwayStr = "로티세리 바비큐 치킨";
					price = 11600;
					break;
				case 3 : 
					subwayStr = "스테이크 & 치즈";
					price = 12200;
					break;
				case 4 : 
					subwayStr = "K-바비큐";
					price = 11600;
					break;
				case 5 : 
					subwayStr = "풀드 포크 바비큐";
					price = 11400;
					break;
				case 6 : 
					subwayStr = "써브웨이 클럽";
					price = 11200;
					break;
				case 7 : 
					subwayStr = "쉬림프";
					price = 11200;
					break;
				case 8 : 
					subwayStr = "스파이시 이탈리안";
					price = 11000;
					break;
				case 9 : 
					subwayStr = "치킨 데리야끼";
					price = 11000;
					break;
				case 10 : 
					subwayStr = "비엘티";
					price = 10400;
					break;
				case 11 : 
					subwayStr = "이탈리안비엠티";
					price = 11600;
					break;
				case 12 : 
					subwayStr = "미트볼";
					price = 10300;
					break;
				case 13 : 
					subwayStr = "터키";
					price = 10300;
					break;
				case 14 : 
					subwayStr = "참치";
					price = 9400;
					break;
				case 15 : 
					subwayStr = "햄";
					price = 9400;
					break;
				case 16 : 
					subwayStr = "에그마요";
					price = 8500;
					break;
				case 17 : 
					subwayStr = "베지";
					price = 7600;
					break;
				case 18 : 
					subwayStr = "로스트 치킨";
					price = 11600;
					break;
				default :
					System.out.println("선택하신 샌드위치는 없는 메뉴입니다.");
			}
		}
		

	// 공급가액 계산(단가*수량)
//		int sum = (price * amount);
		
		int velueOfSupply = price * 100/110;
		int sum = velueOfSupply * amount;
		
		// 부가세액 계산((단가*수량) * 0.1)	
//		int vat = (int) (sum * 0.1);
		
		int vat = (price-velueOfSupply) * amount;
		
		// 총금액 계산(공급가액 + 부가세액)
		int total = sum + vat;
		
		// 잔액(거스름돈) 계산(입금액 - 총금액)
		int change = money - total;
		
		// 화면에 출력해 보자.
		System.out.println("메뉴 : " + subwayStr);
		System.out.println("빵 길이 : " + breadLength[breadLengthNum-1]);
		System.out.println("빵 : " + bread);
		System.out.println("토스팅 : " + toasting);
		System.out.println("치즈 : " + cheese);
		System.out.print("야채 : ");
		
		if(vegetableList.size()!=0) {
			for(int i=0;i<vegetableList.size();i++) {
				System.out.print(vegetableList.get(i).getVarieties()+" ");
			}
		} else {
			System.out.print("모두 제외");
		}
		System.out.println();
		
//		야채 : [Lmyungji.Vegetable;@506e6d5e
				
		System.out.print("소스/시즈닝 : ");

		if(sourceList.size()!=0) {
			for(int i=0;i<sourceList.size();i++) {
				System.out.print(sourceList.get(i).getVarieties()+" ");
			}
		} else {
			System.out.print("모두 제외");
		}
		System.out.println();

//		소스/시즈닝 : [Lmyungji.Source;@96532d6
		
		System.out.printf("샌드위치단가 : %,d원\n", price);
		System.out.printf("주문수량 : %,d\n", amount);
		System.out.printf("입금액 : %,d원\n", money);
		System.out.printf("공급가액 : %,d원\n", sum);
		System.out.printf("부가세액 : %,d원\n", vat);
		System.out.printf("총금액 : %,d원\n", total);
		System.out.printf("거스름돈 : %,d원\n", change);
		
		sc.close();
	}
}
