public class Square extends Shape{

    public Square(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    public int calcArea(){
        return getHeight()*getWidth();
    }

    public int calcPerimeter(){
        return 2*(getHeight()+getWidth());
    }
}
