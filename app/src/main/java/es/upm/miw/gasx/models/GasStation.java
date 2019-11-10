package es.upm.miw.gasx.models;

import java.util.List;

public class GasStation {

    private int ID;
    private String Province;
    private String Municipality;
    private String Location;
    private String Address;
    private float Latitude;
    private float Longitude;
    private float BiodieselPrice;
    private float BioetanolPrice;
    private float GasoleoAPrice;
    private float GasoleoBPrice;
    private float Gas95Price;
    private float Gas98Price;
    private float NuevoGasoleoAPrice;
    private String Label;
    private String OpenHours;

    public GasStation(int ID, String province, String municipality, String location,
                      String address, float latitude, float longitude, float biodieselPrice,
                      float bioetanolPrice, float gasoleoAPrice, float gasoleoBPrice,
                      float gas95Price, float gas98Price, float nuevoGasoleoAPrice,
                      String label, String openHours) {

        this.ID = ID;
        Province = province;
        Municipality = municipality;
        Location = location;
        Address = address;
        Latitude = latitude;
        Longitude = longitude;
        BiodieselPrice = biodieselPrice;
        BioetanolPrice = bioetanolPrice;
        GasoleoAPrice = gasoleoAPrice;
        GasoleoBPrice = gasoleoBPrice;
        Gas95Price = gas95Price;
        Gas98Price = gas98Price;
        NuevoGasoleoAPrice = nuevoGasoleoAPrice;
        Label = label;
        OpenHours = openHours;
    }

    public GasStation(String province, String municipality, String location, String address,
                      float latitude, float longitude, float biodieselPrice, float bioetanolPrice,
                      float gasoleoAPrice, float gasoleoBPrice, float gas95Price, float gas98Price,
                      float nuevoGasoleoAPrice, String label, String openHours) {

        Province = province;
        Municipality = municipality;
        Location = location;
        Address = address;
        Latitude = latitude;
        Longitude = longitude;
        BiodieselPrice = biodieselPrice;
        BioetanolPrice = bioetanolPrice;
        GasoleoAPrice = gasoleoAPrice;
        GasoleoBPrice = gasoleoBPrice;
        Gas95Price = gas95Price;
        Gas98Price = gas98Price;
        NuevoGasoleoAPrice = nuevoGasoleoAPrice;
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

    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float latitude) {
        Latitude = latitude;
    }

    public float getLongitude() {
        return Longitude;
    }

    public void setLongitude(float longitude) {
        Longitude = longitude;
    }

    public float getBiodieselPrice() {
        return BiodieselPrice;
    }

    public void setBiodieselPrice(float biodieselPrice) {
        BiodieselPrice = biodieselPrice;
    }

    public float getBioetanolPrice() {
        return BioetanolPrice;
    }

    public void setBioetanolPrice(float bioetanolPrice) {
        BioetanolPrice = bioetanolPrice;
    }

    public float getGasoleoAPrice() {
        return GasoleoAPrice;
    }

    public void setGasoleoAPrice(float gasoleoAPrice) {
        GasoleoAPrice = gasoleoAPrice;
    }

    public float getGasoleoBPrice() {
        return GasoleoBPrice;
    }

    public void setGasoleoBPrice(float gasoleoBPrice) {
        GasoleoBPrice = gasoleoBPrice;
    }

    public float getGas95Price() {
        return Gas95Price;
    }

    public void setGas95Price(float gas95Price) {
        Gas95Price = gas95Price;
    }

    public float getGas98Price() {
        return Gas98Price;
    }

    public void setGas98Price(float gas98Price) {
        Gas98Price = gas98Price;
    }

    public float getNuevoGasoleoAPrice() {
        return NuevoGasoleoAPrice;
    }

    public void setNuevoGasoleoAPrice(float nuevoGasoleoAPrice) {
        NuevoGasoleoAPrice = nuevoGasoleoAPrice;
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
