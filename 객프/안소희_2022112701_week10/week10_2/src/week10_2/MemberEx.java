package week10_2;
import java.util.Scanner;


public class MemberEx {

    public static void main(String[] args) {
        int iMemberNum, iCrewNum;
        int iID;
        int i, j;
        String sName, sDp;
        Scanner oInDev = new Scanner(System.in);

        System.out.println("일반 동아리원 수를 입력하시오: ");
        iMemberNum = oInDev.nextInt();
        System.out.println("집행부 수를 입력하시오: ");
        iCrewNum = oInDev.nextInt();

        Member Members[] = new Member[iMemberNum];//Member 수 크기의 Member 객체 배열 생성 
        Crew Crews[] = new Crew[iCrewNum];////Crew 수 크기의 Crew 객체 배열 생성 

        System.out.println("---Input Members Information---");

        for (i = 0; i < iMemberNum; i++) {
            System.out.print("student ID:");
            iID = oInDev.nextInt();//ID 입력 받음 

            System.out.print("Name:");
            sName = oInDev.next();//이름 입력 받음 
            Members[i] = new Member(iID, sName);//입력 받은 정보로 생성자 호출하여 객체 생성 
            System.out.println("");
        }

        System.out.println("---Input Crews Information---");

        for (i = 0; i < iCrewNum; i++) {
        	System.out.print("student ID:");
            iID = oInDev.nextInt();//ID 입력 받음 

            System.out.print("Name:");
            sName = oInDev.next();//name 입력 받음 
            
            System.out.print("Department:");
            sDp = oInDev.next();//Department입력 받음 
            Crews[i] = new Crew(iID, sName, sDp);//위의 정보들로 생성자 호출하여 Crew 객체 생성 
            System.out.println("");
        }
        oInDev.close();

        // Check for duplicates
        for (i = 0; i < iMemberNum; i++) {
            for (j = i + 1; j < iMemberNum; j++) {
                if (Members[i].equals(Members[j])) {
                    System.out.println("Duplicate Member found:");//Member끼리의 중복 찾음 
                    System.out.println(Members[i].toString());
                    System.out.println("");
                    System.out.println(Members[j].toString());
                    System.out.println("");
                }
            }
        }
        for (i = 0; i < iCrewNum; i++) {
            for (j = i + 1; j < iCrewNum; j++) {
                if (Crews[i].equals(Crews[j])) {
                    System.out.println("Duplicate Crew found:");//Crew끼리 중복 찾음 
                    System.out.println(Crews[i].toString());
                    System.out.println("");
                    System.out.println(Crews[j].toString());
                    System.out.println("");
                }
            }
        }
     
        for (i = 0; i < iMemberNum; i++) {
            for (j = 0; j < iCrewNum ; j++) {
                if (Members[i].equals(Crews[j])) {
                    System.out.println("Duplicate Member&Crew found:");//Member와 Crew사이의 중복 찾음 
                    System.out.println(Members[i].toString());
                    System.out.println("");
                    System.out.println(Crews[j].toString());
                    System.out.println("");
                }
            }
        }

        System.out.println("---Input Members---");//정보 출력 
        for (i = 0; i < iMemberNum; i++) {
            System.out.println(Members[i].toString());//Member의 메소드인 toString()호출하여 정보 출력 
            System.out.println("");
        }

        System.out.println("---Input Crews---");
        for (i = 0; i < iCrewNum; i++) {
            System.out.println(Crews[i].toString());//Crew의 메소드인 toString()호출하여 정보 출력 
            System.out.println("");
        }

        
    }
}
