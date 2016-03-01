package stryker_studio.ligoapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class MenuPage extends MainActivity{

    //private ImageButton ligo_button;
    @Bind(R.id.ligo_button) ImageButton ligo_button;
    @Bind(R.id.einstein_button) ImageButton einstein_button;
    @Bind(R.id.blackhole_button) ImageButton blackhole_button;
    @Bind(R.id.faq_button) ImageButton funfact_button;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page);
        ButterKnife.bind(this);

        //set learn more button to show main_menu after click
        ligo_button = (ImageButton) findViewById(R.id.ligo_button);
        ligo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenuPage.this, LigoInformation.class);
                startActivity(intent2);
            }
        });

        //set learn more button to show main_menu after click
        einstein_button = (ImageButton) findViewById(R.id.einstein_button);
        einstein_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenuPage.this, EinsteinInformation.class);
                startActivity(intent2);
            }
        });

        //set learn more button to show main_menu after click
        blackhole_button = (ImageButton) findViewById(R.id.blackhole_button);
        blackhole_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenuPage.this, BlackHoleInformation.class);
                startActivity(intent2);
            }
        });

        //set learn more button to show main_menu after click
        funfact_button = (ImageButton) findViewById(R.id.faq_button);
        funfact_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenuPage.this, FunFactInformation.class);
                startActivity(intent2);
            }
        });

    }
}
