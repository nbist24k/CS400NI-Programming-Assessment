abstract class Crop{
    String cropName,season;
    double landArea;
    
    Crop(String cropName, String season,double landArea){
        this.cropName = cropName;
        this.season = season;
        this.landArea = landArea;
    }
    
    //Abstract methods;
    abstract double calculateYield();
    abstract double calculateWaterRequirement();
    
    //Concrete method
    public void displayCropInfo(){
        System.out.println("------------------------------");
        System.out.println("Crop: " + this.cropName);
        System.out.println("Season: " + this.season);
        System.out.println("Land Area(Acres): " + this.landArea);
    }
}