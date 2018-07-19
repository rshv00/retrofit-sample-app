package shevroman.learningretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Place {

    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;


    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }
}
