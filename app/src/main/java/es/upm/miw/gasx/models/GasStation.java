package es.upm.miw.gasx.models;

import java.util.List;

public class GasStation {

    private int ID;
    private String Province;
    private String Municipality;
    private String Location;
    private String Address;
    private Float Latitude;
    private Float Longitude;
    private List<Gas> GasList;
    private String Label;
    private String OpenHours;

    public GasStation(int ID, String province, String municipality, String location, String address,
                      Float latitude, Float longitude, List<Gas> gasList,
                      String label, String openHours) {
        this.ID = ID;
        Province = province;
        Municipality = municipality;
        Location = location;
        Address = address;
        Latitude = latitude;
        Longitude = longitude;
        GasList = gasList;
        Label = label;
        OpenHours = openHours;
    }
    public GasStation(String province, String municipality, String location, String address,
                      Float latitude, Float longitude, List<Gas> gasList,
                      String label, String openHours) {
        Province = province;
        Municipality = municipality;
        Location = location;
        Address = address;
        Latitude = latitude;
        Longitude = longitude;
        GasList = gasList;
        Label = label;
        OpenHours = openHours;
    }

    //Getters and Setters


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getMunicipality() {
        return Municipality;
    }

    public void setMunicipality(String municipality) {
        Municipality = municipality;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Float getLatitude() {
        return Latitude;
    }

    public void setLatitude(Float latitude) {
        Latitude = latitude;
    }

    public Float getLongitude() {
        return Longitude;
    }

    public void setLongitude(Float longitude) {
        Longitude = longitude;
    }

    public List<Gas> getGasList() {
        return GasList;
    }

    public void setGasList(List<Gas> gasList) {
        GasList = gasList;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String getOpenHours() {
        return OpenHours;
    }

    public void setOpenHours(String openHours) {
        OpenHours = openHours;
    }
}
