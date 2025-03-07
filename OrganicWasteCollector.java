public class OrganicWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(WasteContainer wasteContainer) {
        if (wasteContainer.getType().equalsIgnoreCase("organic")) {
            System.out.println("Collecting and disposing organic waste of " + wasteContainer.getCapacity() + " liters");
        } else if (nextCollector != null) {
            nextCollector.collect(wasteContainer);
        } else {
            System.out.println("No collector found for this waste type.");
        }
    }
}

// RecyclableWasteCollector class handling recyclable waste
