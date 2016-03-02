package stryker_studio.ligoapp1;

import android.os.Bundle;

import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class LigoInformation extends MainActivity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ligo_information);
        ButterKnife.bind(this);

    }


}
