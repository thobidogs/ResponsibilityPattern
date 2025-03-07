public interface WasteCollector {
    void setNextCollector(WasteCollector nextCollector);
    void collect(WasteContainer wasteContainer);
}

