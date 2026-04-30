class Rice extends Crop implements Transportable{
    Rice(double landArea){
        super("Rice","Monsoon",landArea);
    }
    
    @Override
    double calculateYield(){
         return landArea * 5000; //kg   
    }
    
    @Override
    double calculateWaterRequirement(){
        return 3000 * landArea;
    }
    
    @Override
    public double calculateTransportCost(){
        return 1500 * landArea;
    }
    
    @Override
    public String getTransportMethod(){
        return "Truck";
    }
    
}