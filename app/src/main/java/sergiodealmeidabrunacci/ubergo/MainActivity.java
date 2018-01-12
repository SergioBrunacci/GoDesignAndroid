package sergiodealmeidabrunacci.ubergo;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView locationIV = (ImageView) findViewById(R.id.locationScreen);
        Button locationButton = (Button) findViewById(R.id.locationButton);

        locationIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextScreen = new Intent(MainActivity.this, RightMenuActivity.class);

                startActivity(nextScreen);
            }
        });

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pickLocation = new Intent( MainActivity.this, PickLocationActivity.class);

                startActivity(pickLocation);
            }
        });
    }
}
