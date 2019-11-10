package es.upm.miw.gasx.models;

import android.os.Parcel;
import android.os.Parcelable;

public class GasStation implements Parcelable {

    private int ID;
    private String Code;
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

    public GasStation(int ID, String code, String province, String municipality, String location,
                      String address, float latitude, float longitude, float biodieselPrice,
                      float bioetanolPrice, float gasoleoAPrice, float gasoleoBPrice,
                      float gas95Price, float gas98Price, float nuevoGasoleoAPrice,
                      String label, String openHours) {

        this.ID = ID;
        Code = code;
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

    public GasStation(String code,String province, String municipality, String location, String address,
                      float latitude, float longitude, float biodieselPrice, float bioetanolPrice,
                      float gasoleoAPrice, float gasoleoBPrice, float gas95Price, float gas98Price,
                      float nuevoGasoleoAPrice, String label, String openHours) {

        Code = code;
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

    //region Getters and Setters


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
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
    //endregion

    //region Parcelable
    protected GasStation(Parcel in) {
        ID = in.readInt();
        Code = in.readString();
        Province = in.readString();
        Municipality = in.readString();
        Location = in.readString();
        Address = in.readString();
        Latitude = in.readFloat();
        Longitude = in.readFloat();
        BiodieselPrice = in.readFloat();
        BioetanolPrice = in.readFloat();
        GasoleoAPrice = in.readFloat();
        GasoleoBPrice = in.readFloat();
        Gas95Price = in.readFloat();
        Gas98Price = in.readFloat();
        NuevoGasoleoAPrice = in.readFloat();
        Label = in.readString();
        OpenHours = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ID);
        dest.writeString(Code);
        dest.writeString(Province);
        dest.writeString(Municipality);
        dest.writeString(Location);
        dest.writeString(Address);
        dest.writeFloat(Latitude);
        dest.writeFloat(Longitude);
        dest.writeFloat(BiodieselPrice);
        dest.writeFloat(BioetanolPrice);
        dest.writeFloat(GasoleoAPrice);
        dest.writeFloat(GasoleoBPrice);
        dest.writeFloat(Gas95Price);
        dest.writeFloat(Gas98Price);
        dest.writeFloat(NuevoGasoleoAPrice);
        dest.writeString(Label);
        dest.writeString(OpenHours);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<GasStation> CREATOR = new Parcelable.Creator<GasStation>() {
        @Override
        public GasStation createFromParcel(Parcel in) {
            return new GasStation(in);
        }

        @Override
        public GasStation[] newArray(int size) {
            return new GasStation[size];
        }
    };
    //endregion
}
