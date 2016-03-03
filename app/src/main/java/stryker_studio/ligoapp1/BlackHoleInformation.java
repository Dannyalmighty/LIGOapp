package stryker_studio.ligoapp1;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class BlackHoleInformation extends MainActivity{

    @Bind(R.id.textView) TextView textVew;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blackhole_information);
        ButterKnife.bind(this);

        textVew.setText("");
    }
}
