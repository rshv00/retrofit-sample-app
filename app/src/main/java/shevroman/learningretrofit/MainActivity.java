package shevroman.learningretrofit;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView sunriseTime, sunsetTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sunriseTime = findViewById(R.id.latitude);
        sunsetTime = findViewById(R.id.longitude);

        //Getting results from API
        App.getApi().getData("36.7201600"
                , "-4.4203400"
                , "today").enqueue(new Callback<Place>() {
            @Override
            public void onResponse(Call<Place> call, @NonNull Response<Place> response) {
                if (response.isSuccessful()) {
                    sunriseTime.setText(response.body().getSunrise());
                    sunsetTime.setText(response.body().getSunset());
                }

            }

            @Override
            public void onFailure(Call<Place> call, Throwable t) {
                Toast.makeText(MainActivity.this, "An error occurred during networking", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
