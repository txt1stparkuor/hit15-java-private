import java.util.HashMap;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        int dem[]=new int[1000001];
//        int n=scanner.nextInt();
//        int m=0;
//        for (int i=1;i<=n;i++) {
//            int tam=scanner.nextInt();
//            dem[tam]++;
//            if(m<dem[tam]) m=dem[tam];
//        }
//        System.out.println("so lan xuat hien:"+m);
//        for (int i=1000000;i>=0;i--) {
//            if(dem[i]==m) System.out.println(i+" ");
//        }
        int n=scanner.nextInt();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int m=0;
        for (int i=1;i<=n;i++) {
            int tam=scanner.nextInt();
            if(hashMap.containsKey(tam)) hashMap.put(tam,hashMap.get(tam)+1);
            else hashMap.put(tam,1);
            if(m<hashMap.get(tam)) m=hashMap.get(tam);
        }
        for  (int i=1000000;i>=0;i--) if(hashMap.get(i)==m) System.out.println(hashMap.get(i));
    }
}