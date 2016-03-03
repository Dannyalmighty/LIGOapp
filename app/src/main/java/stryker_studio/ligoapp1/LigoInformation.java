package stryker_studio.ligoapp1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class LigoInformation extends AppCompatActivity{

    @Bind(R.id.youtube_button) FloatingActionButton youtube_button;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ligo_information);
        ButterKnife.bind(this);




    }


}
