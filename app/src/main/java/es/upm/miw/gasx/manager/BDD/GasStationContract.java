package es.upm.miw.gasx.manager.BDD;

import android.provider.BaseColumns;

public final class GasStationContract {
    private GasStationContract(){}

    public static abstract class tableGasStation implements BaseColumns {

        static final String TABLE_NAME = "gas_station";

        static final String COL_NAME_ID = _ID;
        static final String COL_NAME_CODE = "code";
        static final String COL_NAME_PROVINCE = "province";
        static final String COL_NAME_MUNICIPALITY = "municipality";
        static final String COL_NAME_LOCATION = "location";
        static final String COL_NAME_ADDRESS = "address";
        static final String COL_NAME_LATITUDE = "latitude";
        static final String COL_NAME_LONGITUDE = "longitude";
        static final String COL_NAME_BIODIESEL_PRICE = "biodieselPrice";
        static final String COL_NAME_BIOETANOL_PRICE = "bioetanolPrice";
        static final String COL_NAME_GASOLEO_A_PRICE = "gasoleoAPrice";
        static final String COL_NAME_GASOLEO_B_PRICE = "gasoleoBPrice";
        static final String COL_NAME_GAS_95_PRICE = "gas95Price";
        static final String COL_NAME_GAS_98_PRICE = "gas98Price";
        static final String COL_NAME_NUEVO_GASOLEO_A_PRICE = "nuevoGasoleoAPrice";
        static final String COL_NAME_LABEL = "label";
        static final String COL_NAME_OPEN_HOURS = "openHours";
    }
}

