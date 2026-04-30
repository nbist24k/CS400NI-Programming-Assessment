class Wheat extends Crop implements Transportable{
    Wheat(double landArea){
        super("Wheat","Winter",landArea);
    }
    
    @Override
    double calculateYield(){
         return landArea * 3000; //kg   
    }
    
    @Override
    double calculateWaterRequirement(){
        return 1000 * landArea;
    }
    
    @Override
    public double calculateTransportCost(){
        return 800 * landArea;
    }
    
    @Override
    public String getTransportMethod(){
        return "Tractor";
    }
    
}