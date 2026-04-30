public class CropApp{
    public static void main(String[] args){
        Crop [] crops = {
            new Rice(200),new Wheat(300),new Maize(40)
        };
        
        for(Crop c: crops){
          c.displayCropInfo();  
          System.out.println("Yield: " + c.calculateYield());
            System.out.println("Water Needed: " + c.calculateWaterRequirement());

            Transportable t = (Transportable) c;
            System.out.println("Transport Cost: " + t.calculateTransportCost());
            System.out.println("Method: " + t.getTransportMethod());

           System.out.println("------------------------------");
        }
        
    }
}