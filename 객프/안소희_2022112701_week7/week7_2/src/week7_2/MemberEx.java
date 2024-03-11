package week7_2;
import java.util.Scanner;
public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iMemberNum,iCrewNum;
		int iID;
		int i , j, k;
		String sName,sDp;
		Scanner oInDev;
		oInDev = new Scanner(System.in);//Scanner 객체 생성하여 입력받도록 함 
		System.out.println("일반 동아리원 수를 입력하시오: ");
		iMemberNum = oInDev.nextInt();
		System.out.println("집행부 수를 입력하시오: ");
		iCrewNum = oInDev.nextInt();
		
		Member Members[];
		Members = new Member[iMemberNum];//입력 받은 일반 부원 수만큼 객체의 배열 원소 수 지정 
		
		Crew Crews[];
		Crews = new Crew[iCrewNum];//입력 받은 집행부원 수만큼 객체의 배열 원소 지정 
		
		System.out.println("---Input Members Information---");//일반 부원 정보 입력 
		for( i = 0 ; i < iMemberNum; i++) {
			
			System.out.print("student ID:");//학번 
			iID = oInDev.nextInt();
			for( j = 0 ; j < i ; j++) {
				if(Members[j].getID() == iID) {//만약 같으면 반복문 빠져나감 
					break;
				}
			}
			if( i == j ) {//두 개의 값이 같다면 이전의 반복문에서 if문이 실행되지 않은 것이므로 같은 학번이 존재하지 않다고 판단 
			System.out.print("Name: ");//이름 
			sName = oInDev.next();
			
			
			Members[i] = new Member(iID,sName);//입력받은 학번과 이름을 매개변수로 하는 생성자 실행 
			System.out.println("");
			}
			else {
				System.out.println("Error: ID already exists. Please enter a different ID.");//만약 반복문에서의 if문이 실행되었다면 	같은 학번이 있던 것이므로 중복 메세지 출력 			
				i--;//다시 입력받도록 함 
			}
			
			
		}
		System.out.println("---Input Crews Information---");//집행 부원 정보 입력 
		for(i = 0 ; i < iCrewNum; i++) {
			System.out.print("student ID:");//학번 
			iID = oInDev.nextInt();
			for( k = 0 ; k < iMemberNum ; k++) {//일반 부원의 학번과의 중복 발생했는지 확인 
				if(Members[k].getID() == iID) {
					break;
				}
			}
			for( j = 0 ; j < i ; j++) {//집행 부원끼리 중복이 발생했는지 확인 
				if(Crews[j].getID() == iID) {
					break;
				}
			}
			if(i == j&&k==iMemberNum){//두 곳에서 전부 중복이 발생하지 않았다면 
			System.out.print("Name: ");//이름 입력받음 
			sName = oInDev.next();
			System.out.print("Department: ");//부서 입력받음 
			sDp = oInDev.next();
			
			Crews[i] = new Crew(iID,sName,sDp);//학번, 이름, 부서를 매개변수로 하는 집행부원 객체 생성 
			System.out.println("");
			}
			else {
				System.out.println("Error: ID already exists. Please enter a different ID.");//중복 메세지 출력 				
				i--;//다시 입력 받음 
			}
		}
		System.out.println("---Input Members---");//입력받은 일반 부원 전체 정보 출력 
		for(i = 0 ; i < iMemberNum; i++) {
			Members[i].PrintMember();//Member클래스의 출력 메소드 실행 
			System.out.println("");
		}
		System.out.println("---Input Crews---");//입력받은 집행부원 전체 정보 출력 
		for(i = 0 ; i < iCrewNum; i++) {
			Crews[i].PrintCrew();//추가 기능인 부서까지 출력하기 위해 Crew클래스의 출력 메소드 실행 
			System.out.println("");
		}
		
		oInDev.close();
		

	}

}
