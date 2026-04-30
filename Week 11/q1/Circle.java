class Circle extends Shape implements Drawable{
    double radius;
    
    Circle(double r){
        this.radius = r;
    
    }
    
    @Override
    double calculateArea(){
        return 3.14 * Math.pow(this.radius,2);
    }
    
    @Override
    double calculatePerimeter(){
        return 2 * 3.14 * this.radius;
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing Circle...");
    }
}