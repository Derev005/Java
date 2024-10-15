package bikeproject;

public interface MountainParts {
    String TERRAIN = "off_road";

    String getSuspension();
    void setSuspension(String suspension);
    String getType();
    void setType(String type);
}
