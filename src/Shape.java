public  abstract class Shape {

    private int height;
    private int width;
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height>=2){
            this.height = height;
        }
        else{
            this.height = 2;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public abstract int calcArea();

    public abstract int calcPerimeter();

}
