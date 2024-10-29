package TrenLop;

import java.util.Scanner;

public class Buoi3Bai1TrenLop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        if(s.length()==1) {
            if(s.charAt(0)=='0') System.out.print("không");
            if(s.charAt(0)=='1') System.out.print("một");
            if(s.charAt(0)=='2') System.out.print("hai");
            if(s.charAt(0)=='3') System.out.print("ba");
            if(s.charAt(0)=='4') System.out.print("bốn");
            if(s.charAt(0)=='5') System.out.print("năm");
            if(s.charAt(0)=='6') System.out.print("sáu");
            if(s.charAt(0)=='7') System.out.print("bảy");
            if(s.charAt(0)=='8') System.out.print("tám");
            if(s.charAt(0)=='9') System.out.print("chín");
        }
        if(s.length()==2) {
            if(s.charAt(0)=='1') System.out.print("mười ");
            if(s.charAt(0)=='2') System.out.print("hai mươi ");
            if(s.charAt(0)=='3') System.out.print("ba mươi ");
            if(s.charAt(0)=='4') System.out.print("bốn mươi ");
            if(s.charAt(0)=='5') System.out.print("năm mươi ");
            if(s.charAt(0)=='6') System.out.print("sáu mươi ");
            if(s.charAt(0)=='7') System.out.print("bảy mươi ");
            if(s.charAt(0)=='8') System.out.print("tám mươi ");
            if(s.charAt(0)=='9') System.out.print("chín mươi ");
            if(s.charAt(1)=='1') System.out.print("một");
            if(s.charAt(1)=='2') System.out.print("hai");
            if(s.charAt(1)=='3') System.out.print("ba");
            if(s.charAt(1)=='4') System.out.print("bốn");
            if(s.charAt(1)=='5') System.out.print("năm");
            if(s.charAt(1)=='6') System.out.print("sáu");
            if(s.charAt(1)=='7') System.out.print("bảy");
            if(s.charAt(1)=='8') System.out.print("tám");
            if(s.charAt(1)=='9') System.out.print("chín");
        }
        if(s.length()==3) {
            if(s.charAt(0)=='1') System.out.print("một trăm ");
            if(s.charAt(0)=='2') System.out.print("hai trăm ");
            if(s.charAt(0)=='3') System.out.print("ba trăm ");
            if(s.charAt(0)=='4') System.out.print("bốn trăm ");
            if(s.charAt(0)=='5') System.out.print("năm trăm ");
            if(s.charAt(0)=='6') System.out.print("sáu trăm ");
            if(s.charAt(0)=='7') System.out.print("bảy trăm ");
            if(s.charAt(0)=='8') System.out.print("tám trăm ");
            if(s.charAt(0)=='9') System.out.print("chín trăm ");
            if(s.charAt(1)=='1') System.out.print("mười ");
            if(s.charAt(1)=='2') System.out.print("hai mươi ");
            if(s.charAt(1)=='3') System.out.print("ba mươi ");
            if(s.charAt(1)=='4') System.out.print("bốn mươi ");
            if(s.charAt(1)=='5') System.out.print("năm mươi ");
            if(s.charAt(1)=='6') System.out.print("sáu mươi ");
            if(s.charAt(1)=='7') System.out.print("bảy mươi ");
            if(s.charAt(1)=='8') System.out.print("tám mươi ");
            if(s.charAt(1)=='9') System.out.print("chín mươi ");
            if(s.charAt(1)=='0') {
                System.out.print("linh ");
                if(s.charAt(2)=='1') System.out.print("một");
                if(s.charAt(2)=='2') System.out.print("hai");
                if(s.charAt(2)=='3') System.out.print("ba");
                if(s.charAt(2)=='4') System.out.print("bốn");
                if(s.charAt(2)=='5') System.out.print("năm");
                if(s.charAt(2)=='6') System.out.print("sáu");
                if(s.charAt(2)=='7') System.out.print("bảy");
                if(s.charAt(2)=='8') System.out.print("tám");
                if(s.charAt(2)=='9') System.out.print("chín");
            }
            else {
                if (s.charAt(2) == '1') System.out.print("một");
                if (s.charAt(2) == '2') System.out.print("hai");
                if (s.charAt(2) == '3') System.out.print("ba");
                if (s.charAt(2) == '4') System.out.print("bốn");
                if (s.charAt(2) == '5') System.out.print("năm");
                if (s.charAt(2) == '6') System.out.print("sáu");
                if (s.charAt(2) == '7') System.out.print("bảy");
                if (s.charAt(2) == '8') System.out.print("tám");
                if (s.charAt(2) == '9') System.out.print("chín");
            }
        }
    }
}