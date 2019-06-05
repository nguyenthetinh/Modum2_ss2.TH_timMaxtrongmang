import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        int size;
        int[]mang;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Nhap Size mang : ");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("mang khong duoc qua 20 phan tu");
            }
        }while (size>20);
        mang=new int[size];
        for (int i=0;i<mang.length;i++){
            System.out.println("Enter element " +(i+1)+" :");
            mang[i]=scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j < mang.length; j++) {
            System.out.print(mang[j] + "\t");
        }
        int max=mang[0] ;
        int temp=0;
        for (int j=0 ; j<mang.length; j++){
            if (mang[j]>max){
                max=mang[j];
                temp+=j+1;
            }
        }
        System.out.println(",gia tri lon nhat trong mang la: "+max+" ,tai vi tri : "+temp);
    }
}
