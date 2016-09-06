package java2;  //简单万年历

import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {

        int years = 0;
        int month = 0;
        int days = 0; 
        boolean isRun = false;

        //從控制台輸入年，月
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入年份：");
        years = input.nextInt();
        System.out.print("請輸入月份：");
        month = input.nextInt();
        System.out.println("\n*********"+years+"年"+month+"月  日曆表************");

        //判断是否是闰年
        if((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)){
            isRun = true;
        }
        int totalDays = 0; //累計天數

        //計算距離1900年1月1日的天數
        for(int i = 1900; i < years; i++){
            if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
                totalDays = totalDays + 366;
            } else{
                totalDays = totalDays + 365;
            }
        }
        int beforeDays = 0;
        
        //根據月份判斷天數
        for(int j = 1; j <= month; j++){
            switch(j){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if(isRun){
                        days = 29;
                    } else {
                        days = 28;
                    }
                default:
                    System.out.println("输入月份不正确!!");
            }
            if(j < month){
                beforeDays = beforeDays + days;
            }
        }
        
        totalDays = totalDays + beforeDays; //統計到目前總天數
        int firstDayOfMonth = 0;
        int temp = 1 + totalDays % 7 ;
        if(temp == 7){
            firstDayOfMonth = 0; //週日
        } else {
            firstDayOfMonth = temp;
        }
        
        /* 输出日历 */
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
        for(int k = 0; k < firstDayOfMonth; k++){
            System.out.print("\t");
        }
        for(int m = 1; m <= days; m++){
            System.out.print( m + "\t");
            if((totalDays + m) % 7 == 6){
                System.out.print("\n");
            }
        }
    }
}

