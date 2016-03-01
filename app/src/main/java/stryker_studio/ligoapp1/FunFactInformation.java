package stryker_studio.ligoapp1;

import android.os.Bundle;

import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class FunFactInformation extends MainActivity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.funfact_information);
        ButterKnife.bind(this);

    }
}
