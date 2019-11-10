package es.upm.miw.gasx.manager.API;

import android.content.Context;

import java.util.List;

import es.upm.miw.gasx.Constants;
import es.upm.miw.gasx.models.GasStationAPIObject;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    Context context;
    Retrofit retrofit;

    public ApiClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.GAS_API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Call<List<GasStationAPIObject>> getGasStationPriceByLocality(String location) {
        IGasRESTAPIService service = retrofit.create(IGasRESTAPIService.class);
        return service.getGasStationPriceByLocality(location);
    }

}
