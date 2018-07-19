package shevroman.learningretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServerApi {

    @GET("/json")
    Call<Place> getData(@Query("lat") String latitude,
                        @Query("lng")String longitude,
                        @Query("date")String date);
}