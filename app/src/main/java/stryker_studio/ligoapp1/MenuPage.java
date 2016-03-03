package stryker_studio.ligoapp1;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class MenuPage extends AppCompatActivity{

    //private ImageButton ligo_button;
    @Bind(R.id.ligo_button) ImageButton ligo_button;
    @Bind(R.id.einstein_button) ImageButton einstein_button;
    @Bind(R.id.blackhole_button) ImageButton blackhole_button;
    @Bind(R.id.fun_button) ImageButton funfact_button;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page);

        ButterKnife.bind(this);


        //set ligo button to show ligo_information after click
        ligo_button = (ImageButton) findViewById(R.id.ligo_button);
        ligo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenuPage.this, LigoInformation.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MenuPage.this, (View)ligo_button, "ligoTransition");
                startActivity(intent2, options.toBundle());
            }
        });

        //set einstein button to show einstein_information after click
        einstein_button = (ImageButton) findViewById(R.id.einstein_button);
        einstein_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenuPage.this, EinsteinInformation.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MenuPage.this, (View)einstein_button, "einsteinTransition");
                startActivity(intent2, options.toBundle());
            }
        });

        //set blackhole button to show blackhole_Information after click
        blackhole_button = (ImageButton) findViewById(R.id.blackhole_button);
        blackhole_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenuPage.this, BlackHoleInformation.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MenuPage.this, (View)blackhole_button, "blackholeTransition");
                startActivity(intent2, options.toBundle());
            }
        });

        //set funfact button to show fun fact_information after click
        funfact_button = (ImageButton) findViewById(R.id.fun_button);
        funfact_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenuPage.this, FunFactInformation.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MenuPage.this, (View)funfact_button, "funfactTransition");
                startActivity(intent2, options.toBundle());
            }
        });

    }
}
