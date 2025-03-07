public class WasteManagementSystem {
    private WasteCollector chain;

    public WasteManagementSystem() {
        // Setting up the chain
        this.chain = new OrganicWasteCollector();
        WasteCollector c2 = new RecyclableWasteCollector();
        WasteCollector c3 = new HazardousWasteCollector();
        
        chain.setNextCollector(c2);
        c2.setNextCollector(c3);
    }

    public void processWaste(WasteContainer wasteContainer) {
        chain.collect(wasteContainer);
    }
}