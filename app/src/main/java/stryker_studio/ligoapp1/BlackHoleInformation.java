package stryker_studio.ligoapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class BlackHoleInformation extends AppCompatActivity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blackhole_information);
        ButterKnife.bind(this);

    }
}
