package gawe.imb.karya.gappbuilderdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvText = findViewById(R.id.tvText);
        tvText.setText("INI nanti diisi app ID\nLoad App Dengan ID : " + BuildConfig.APP_ID);
    }
}
