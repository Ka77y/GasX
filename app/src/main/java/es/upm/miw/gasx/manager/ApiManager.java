package es.upm.miw.gasx.manager;

import java.util.ArrayList;
import java.util.List;

import es.upm.miw.gasx.models.Gas;
import es.upm.miw.gasx.models.GasName;
import es.upm.miw.gasx.models.GasStation;
import es.upm.miw.gasx.models.GasStationAPIObject;
import es.upm.miw.gasx.models.GasType;
import retrofit2.Call;

public class ApiManager {

    ApiClient apiClient = new ApiClient();


    public List<GasStation>gegetGasStationPriceByLocality(String location){

        List<GasStation>gasStations = new ArrayList();
        Call<List<GasStationAPIObject>> getGasStations =
                apiClient.getGasStationPriceByLocality(location);

        try {
            List<GasStationAPIObject> gasStationsRaw = getGasStations.execute().body();
            gasStations = ConvertAPIObjetcIntoAppObject(gasStationsRaw);
        }catch (Exception ex){}
        return gasStations;

    }

    //region Converter

    private List<GasStation>ConvertAPIObjetcIntoAppObject(List<GasStationAPIObject>gasStations){
        List<GasStation>gasStationsConverted = new ArrayList();
        for (GasStationAPIObject gasStation:gasStations) {

            gasStationsConverted.add(new GasStation(
                    gasStation.getProvincia(),
                    gasStation.getMunicipio(),
                    gasStation.getLocalidad(),
                    gasStation.getDireccion(),
                    gasStation.getLatitud(),
                    gasStation.getLongitud(),
                    getAllGas(gasStation),
                    gasStation.getRotulo(),
                    gasStation.getHorario()
            ));
        }
        return gasStationsConverted;
    }
    private List<Gas>getAllGas(GasStationAPIObject gasStation){
        List<Gas> gasList = new ArrayList();

        gasList.add(createGas(GasName.GAS_95,
                GasType.GAS_95,
                gasStation.getPrecio_gasolina_95()));
        gasList.add(createGas(GasName.GAS_98,
                GasType.GAS_98,
                gasStation.getPrecio_gasolina_98()));
        gasList.add(createGas(GasName.GASOLEO_A,
                GasType.GASOLEO_A,
                gasStation.getPrecio_gasoleo_a()));
        gasList.add(createGas(GasName.GASOLEO_B,
                GasType.GASOLEO_B,
                gasStation.getPrecio_nuevo_gasoleo_a()));
        gasList.add(createGas(GasName.NUEVO_GASOLEO_A,
                GasType.NUEVO_GASOLEO_A,
                gasStation.getPrecio_nuevo_gasoleo_a()));
        gasList.add(createGas(GasName.BIODIESEL,
                GasType.BIODIESEL,
                gasStation.getPrecio_biodiesel()));
        gasList.add(createGas(GasName.BIOETANOL,
                GasType.BIOETANOL,
                gasStation.getPrecio_bioetanol()));
        return gasList;

    }
    private Gas createGas(GasName gasName, GasType gasType, float gasPrice){

        String gasNameString = gasName.getGasName();
        String gasCode = gasType.getGasCode();
        String price = Float.toString(gasPrice);

        return new Gas(gasCode,gasNameString,price,price);

    }


    //endregion

}
