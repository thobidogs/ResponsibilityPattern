public class WasteManagementDemo{
public static void main(String[] args) {
    WasteManagementSystem wasteSystem = new WasteManagementSystem();
    
    WasteContainer organicWaste = new WasteContainer("organic", 50);
    WasteContainer recyclableWaste = new WasteContainer("recyclable", 30);
    WasteContainer hazardousWaste = new WasteContainer("hazardous", 20);
    WasteContainer unknownWaste = new WasteContainer("electronic", 10);
    
    wasteSystem.processWaste(organicWaste);
    wasteSystem.processWaste(recyclableWaste);
    wasteSystem.processWaste(hazardousWaste);
    wasteSystem.processWaste(unknownWaste);
}
}