package stryker_studio.ligoapp1;

import android.os.Bundle;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class MenuPage extends MainActivity{

    @Bind(R.id.ligo_button) ImageButton ligo_button;
    @Bind(R.id.einstein_button) ImageButton einstein_button;
    @Bind(R.id.blackhole_button) ImageButton blackhole_button;
    @Bind(R.id.faq_button) ImageButton faq_button;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page);
        ButterKnife.bind(this);


    }
}
