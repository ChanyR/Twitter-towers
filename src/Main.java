import java.util.Scanner;

public class Main {
    static Scanner in=new Scanner(System.in);

    public static void main(String[] args) {
         boolean flage=true;
         int n=2,height=12,width=11;
         while(flage){
             System.out.println("for a squar/ractangle building prees   ----   1");
             System.out.println("for a triangle building prees   -----------   2");
             System.out.println("to exit prees   ---------------------------   3");
             n=in.nextInt();
             switch (n){
                 case 1:{
                     System.out.println("prees your building height");
                     height=in.nextInt();
                     System.out.println("press your building width");
                     width=in.nextInt();
                     Square building=new Square(height,width);
                     if(building.getWidth()==building.getHeight() ||
                             Math.abs(building.getHeight()- building.getWidth())>5){
                         System.out.println("the area of the building is "+building.calcArea());
                     }
                     else{
                         System.out.println("the perimeter of the building is "+building.calcPerimeter());
                     }
                     break;
                 }
                 case 2:{
                     System.out.println("prees your building height");
                     height=in.nextInt();
                     System.out.println("press your building width");
                     width=in.nextInt();
                     Triangle building=new Triangle(height,width);
                     System.out.println("for the perimeter of the building prees  --   1");
                     System.out.println("to print the building prees   -------------   2");
                     n=in.nextInt();
                     if(n==1){
                         System.out.println("the perimeter of the building is "+building.calcPerimeter());
                     }else{
                         if(building.getWidth()%2==0 || building.getWidth()>2* building.getHeight()){
                             System.out.println("Sorry but this triangle cannot be printed");
                         } else {
                             building.print();
                         }
                     }
                     break;
                 }
                 case 3:{
                     flage=false;
                     break;
                 }
                 default:{
                     System.out.println("Invalid parameter");
                 }
             }
         }
        System.out.println("by-by");
    }
}

