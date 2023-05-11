public class Triangle extends Shape{

    public Triangle(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    public int calcArea(){
        return (getHeight()+getWidth())/2;
    }

    public int calcPerimeter(){
        return 2*getHeight()+getWidth();
    }

    public void print(){
        int i,j,k,sumRow,amountInRow,divRow,amountPrint=1,cntPrintKind=0,cntPrintInSize=0;
        if (getWidth()==1) {
            for(i=0;i<getHeight();i++){
                System.out.println("*");
            }
            return;
        } else if(getHeight()==2 ||  getWidth()==3){
            sumRow=0;
            amountInRow=0;
            divRow=0;
        } else{
            sumRow=(getWidth()-2)/2;
            amountInRow=(getHeight()-2)/sumRow;
            divRow=(getHeight()-2)%sumRow;
        }
        for(i=0;i<this.getHeight();i++){
            cntPrintInSize++;
            for(k=0;k<(getWidth()/2-cntPrintKind);k++){
                System.out.print(" ");
            }
            for(j=0;j<amountPrint;j++){
                System.out.print('*');
            }
            if (i==0||divRow<=0&&cntPrintInSize==amountInRow){
                cntPrintInSize=0;
                amountPrint+=2;
                cntPrintKind++;
            }
            if(i!=0 && divRow>0){
                divRow--;
                cntPrintInSize=0;
            }
            System.out.println();
        }
    }
}
