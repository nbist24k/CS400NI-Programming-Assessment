class Maize extends Crop implements Transportable{
    Maize(double landArea){
        super("Maize","Hill",landArea);
    }
    
    @Override
    double calculateYield(){
         return landArea * 1800; //kg   
    }
    
    @Override
    double calculateWaterRequirement(){
        return 700 * landArea;
    }
    
    @Override
    public double calculateTransportCost(){
        return 2000 * landArea;
    }
    
    @Override
    public String getTransportMethod(){
        return "Small Vehicle";
    }
    
}