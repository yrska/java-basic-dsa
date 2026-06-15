package resources.data_structures;

public class Structure {
    
    private String accessTime;
    private String searchTime;
    private String insertionTime;
    private String deletionTime;
    private String spaceComplexity;

    public Structure(String accessTime, String searchTime, String insertionTime, String deletionTime, String spaceComplexity) {
        this.accessTime = accessTime;
        this.searchTime = searchTime;
        this.insertionTime = insertionTime;
        this.deletionTime = deletionTime;
        this.spaceComplexity = spaceComplexity;
    }

    public String getAccessTime() {
        return accessTime;
    }

    public String getSearchTime() {
        return searchTime;
    }

    public String getInsertionTime() {
        return insertionTime;
    }

    public String getDeletionTime() {
        return deletionTime;
    }

    public String getSpaceComplexity() {
        return spaceComplexity;
    }

    

}
