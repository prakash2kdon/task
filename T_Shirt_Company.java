package Day2;

public class T_Shirt_Company extends TSHIRT_CUSTOMERS {
    int count;
    String colour;
    char size;

    static{
        System.out.println("WELCOME");
    }
    T_Shirt_Company(int count1,String colour1,char size1){
        this.count=count1;
        this.colour=colour1;
        this.size=size1;
    }
    public void display(){
        System.out.println("Total t-shirt count is "+count);
        System.out.println("Total t-shirt colour is "+colour);
        System.out.println("Total t-shirt colour is "+size);
    }

    public static void main(String args []){
        T_Shirt_Company tShirtCompany = new T_Shirt_Company(50,"block",'m');
        tShirtCompany.display();
        tShirtCompany.customers();
    }

}
