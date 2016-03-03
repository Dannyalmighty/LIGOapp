package stryker_studio.ligoapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class EinsteinInformation extends AppCompatActivity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.einstein_information);
        ButterKnife.bind(this);

    }

}
