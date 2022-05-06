package pP1;

import java.util.Scanner;

public class SUBWAYOrder{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.in은 키보드를 의미한다!
		
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1. 터키 베이컨 아보카도 - 15cm 6,900원 30cm 12,200원원");
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
		
		System.out.println();
//		자바 줄바꿈
		System.out.println("*** 빵 길이 선택 ***");
		System.out.println("1. 15cm");
		System.out.println("2. 30cm");
		System.out.print("빵 길이 선택: ");
		int menuNo1 = sc.nextInt();
		String breadLength;
		if(menuNo1==1) {
			breadLength="15cm";
		}else {
			breadLength="30cm";
		}
//		교수님이 추가해준 문 41~46
		
		System.out.println();
		System.out.println("*** 빵 선택 ***");
//		System.out.println("1. 화이트");
//		System.out.println("2. 파마산 오레가노");
//		System.out.println("3. 위트");
//		System.out.println("4. 허니오트");
//		System.out.println("5. 하티");
//		System.out.println("6. 플렛브래드");
//		System.out.print("빵 선택: ");
		String[] arr= {"1.화이트", "2.파마산 오레가노", "3.위트", "4.허니오트", "5.하티", "6.플랫브레드"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.print("빵 선택: ");
//		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
//		int menuNo2 = sc.nextInt();
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
//		System.out.println("1. 아메리칸치즈");
//		System.out.println("2. 슈레드치즈");
//		System.out.println("3. 모차렐라치즈");
//		System.out.println("4. 치즈제외");
//		System.out.print("치즈 선택: ");
		String[] arr1 = {"1.아메리칸치즈", "2.슈레드치즈", "3.모차렐라치즈", "4.치즈 제외"};
		for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i]);
		}
		System.out.print("치즈 선택: ");
		int num2=sc.nextInt();
//		int menuNo4 = sc.nextInt();
		String cheese="";
//		if else 문 전의 String 문의 형식과 조금 다름!
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
		System.out.println("*** 야채 선택 ***");
		System.out.println("1. 양상추");
		System.out.println("2. 토마토");
		System.out.println("3. 오이");
		System.out.println("4. 피망");
		System.out.println("5. 양파");
		System.out.println("6. 피클");
		System.out.println("7. 올리브");
		System.out.println("8. 할라피뇨");
		System.out.println("9. 모든 야채 제외");
		System.out.print("야채 선택: ");
		int menuNo5 = sc.nextInt();
		String vegetable;
		if(menuNo5==1)
			vegetable="양상추";
		else if(menuNo5==2)
			vegetable="토마토";
		else if(menuNo5==3)
			vegetable="오이";
		else if(menuNo5==4)
			vegetable="피망";
		else if(menuNo5==5)
			vegetable="양파";
		else if(menuNo5==6)
			vegetable="피클";
		else if(menuNo5==7)
			vegetable="올리브";
		else if(menuNo5==8)
			vegetable="할라피뇨";
		else if(menuNo5==9)
			vegetable="모든 야채 제외";
		else
			vegetable="선택하신 야채는 없는 메뉴입니다.";
//		다중 선택은 어떻게 하나요?
//		switch break 문 보다는 if else if else 문 사용 추천
		
		System.out.println();
		System.out.println("*** 소스/시즈닝 선택 ***");
		System.out.println("1. 알싸한 머스타드");
		System.out.println("2. 상큼한 이탈리안드레싱");
		System.out.println("3. 과일향 레드와인식초");
		System.out.println("4. 달콤한 스위트 어니언");
		System.out.println("5. 새콤달콤한 허니 머스타드");
		System.out.println("6. 매콤달콤한 스위트 칠리");
		System.out.println("7. 스모크 향 스모크 바비큐");
		System.out.println("8. 크리미한 랜치");
		System.out.println("9. 고소한 마요네즈");
		System.out.println("10. 화끈하게 매운 핫 칠리");
		System.out.println("11. 이국적으로 매콤한 사우스 웨스트 치폴레");
		System.out.println("12. 알싸한 홀스래디쉬");
		System.out.println("13. 이태리 엑스트라버진 올리브 오일");
		System.out.println("14. 소금");
		System.out.println("15. 후추");
		System.out.println("16. 선택안함");
		System.out.print("소스/시즈닝 선택: ");
		int menuNo6 = sc.nextInt();
		String sauce;
		if(menuNo5==1)
			sauce="알싸한 머스타드";
		else if(menuNo5==2)
			sauce="상큼한 이탈리안드레싱";
		else if(menuNo5==3)
			sauce="과일향 레드와인식초";
		else if(menuNo5==4)
			sauce="달콤한 스위트 어니언";
		else if(menuNo5==5)
			sauce="새콤달콤한 허니 머스타트";
		else if(menuNo5==6)
			sauce="매콤달콤한 스위트 칠리";
		else if(menuNo5==7)
			sauce="스모크 향 스모크 바비큐";
		else if(menuNo5==8)
			sauce="크리미한 랜치";
		else if(menuNo5==9)
			sauce="고소한 마요네즈";
		else if(menuNo5==10)
			sauce="화끈하게 매운 핫 칠리";
		else if(menuNo5==11)
			sauce="이국적으로 매콤한 사우스 웨스트 치폴레";
		else if(menuNo5==12)
			sauce="알싸한 홀스래디쉬";
		else if(menuNo5==13)
			sauce="이태리 엑스트라버진 올리브 오일";
		else if(menuNo5==14)
			sauce="소금";
		else if(menuNo5==15)
			sauce="후추";
		else if(menuNo5==16)
			sauce="선택안함";
		else
			sauce="선택하신 소스/시즈닝은 없는 메뉴입니다.";
//		3개까지 선택/3개 이상 선택시 '소스/시즈닝은 3개까지 선택가능합니다!' 알림
		
		System.out.println();
		System.out.print("주문 수량 >>> ");
		int amount = sc.nextInt();
		
		System.out.println();
		System.out.print("입금액 >>> ");
		int money = sc.nextInt();
		
		System.out.println();
		
		String subwayStr = ""; // 샌드위치 종류가 저장될 변수
		int price = 0; // 샌드위치 단가가 저장될 변수
		
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
	
	// 공급가액 계산(단가*수량)
		int sum = (price * amount);
		
		// 부가세액 계산((단가*수량) * 0.1)
		int vat = (int) (sum * 0.1);
		
		// 총금액 계산(공급가액 + 부가세액)
		int total = sum + vat;
		
		// 잔액(거스름돈) 계산(입금액 - 총금액)
		int change = money - total;
		
		// 화면에 출력해 보자.
		System.out.println("메뉴 : " + subwayStr);
		System.out.println("빵 길이 : " + breadLength);
		System.out.println("빵 : " + bread);
		System.out.println("토스팅 : " + toasting);
		System.out.println("치즈 : " + cheese);
		System.out.println("야채 : " + vegetable);
		System.out.println("소스/시즈닝 : " + sauce);
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
