public class RecyclableWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(WasteContainer wasteContainer) {
        if (wasteContainer.getType().equalsIgnoreCase("recyclable")) {
            System.out.println("Collecting and recycling " + wasteContainer.getCapacity() + " liters of recyclable waste");
        } else if (nextCollector != null) {
            nextCollector.collect(wasteContainer);
        } else {
            System.out.println("No collector found for this waste type.");
        }
    }
}


