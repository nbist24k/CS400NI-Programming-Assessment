class Rectangle extends Shape implements Drawable{
    double length, breadth;
    
    Rectangle(double l, double b){
        this.length = l;
        this.breadth = b;
    }
    
    @Override
    double calculateArea(){
        return this.length * this.breadth;
    }
    
    @Override
    double calculatePerimeter(){
        return 2 * (this.length + this.breadth);
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle...");
    }
}