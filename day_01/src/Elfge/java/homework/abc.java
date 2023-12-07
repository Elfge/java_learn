package Elfge.java.homework;

public class abc {
    public static void main(String[] args) {
        int i,s=0;
        int a[]={2,3,4,5,6,7,8,9,10,11,12};
        for(i=0;i<a.length;i++)
            if(i%3==0)s+=a[i];
        System.out.println("s="+s);
    }
}
