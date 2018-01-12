package sergiodealmeidabrunacci.ubergo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PickLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_location);

        Button selectLocationButton = findViewById(R.id.selectLocationButton);

        selectLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displayMap = new Intent(PickLocationActivity.this, MainActivity.class);

                startActivity(displayMap);

            }
        });
    }
}
