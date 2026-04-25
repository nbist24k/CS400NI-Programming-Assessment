public class BillApp{
    
    public static void main(String[] args){
        ElectricityBill bill1 = new ElectricityBill("John Doe", 80);
        ElectricityBill bill2 = new ElectricityBill("Jane Doe", 200);
        
        bill1.displayBill();
        bill2.displayBill();
    }
}