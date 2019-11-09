package es.upm.miw.gasx.Manager;

import android.content.Context;

import es.upm.miw.gasx.models.GasStation;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    Context context;

    /*public ApiClient(Context context){
        this.context = context;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Call<GasStation> getGasStationPriceByLocality(String location) {
        IGasRESTAPIService service = retrofit.create(ApiService.class);
        return service.getBatch(id);
    }*/

}
