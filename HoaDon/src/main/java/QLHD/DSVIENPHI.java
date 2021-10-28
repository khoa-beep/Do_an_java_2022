
package QLHD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DSVIENPHI {
    // su dung luu tru doi tuong
    static List<Benhnhanbhyt> list = new ArrayList<>();
    // ham them moi benh nhan
    public void ADD_bn()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID :");
        String id = sc.nextLine();
        
        System.out.println("Name :");
        String name = sc.nextLine();
        
        System.out.println("Number Date :");
        int date = sc.nextInt();
        
        System.out.println("Request room:");
        boolean c = sc.nextBoolean();
        
        System.out.println("Code :");
        int code = sc.nextInt();
        
        
        
        Benhnhanbhyt yt = new Benhnhanbhyt(id,name,date,c,code);
        
        boolean add = list.add(yt);
    }
    
    // ham xoa benh nhan
    public void Delete()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id need delete:");
        String id = sc.nextLine();
        boolean check = false;
        int vt = 0;
        for (int i = 0; i < list.size(); i++) {
            if(id  == list.get(i).getID())
            {
                check = true;
                vt = i;
                break;
            }
        }
        if(check == false){
            System.out.println("No Seacrch for information ");
        }
        else{
            list.remove(vt); // xoa tai vi tri do neu tim thay
        }
        
    }
    // ham cap nhat lai 
    public  void Update()
    {
        ADD_bn();
    }
    // ham tinh tong tien 
   public  void Tinh_toan_co_bhyt()
   {
       Benhnhanbhyt y = new Benhnhanbhyt();
       System.out.println(y.Hoadonvienphi());
   }
}
