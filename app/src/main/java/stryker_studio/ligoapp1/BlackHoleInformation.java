package stryker_studio.ligoapp1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class BlackHoleInformation extends AppCompatActivity{

   FloatingActionButton videoButton;
    public static final String movieUrl = "https://youtu.be/tkI5ZkgZU14";


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blackhole_information);
        ButterKnife.bind(this);

        videoButton = (FloatingActionButton) findViewById(R.id.youtube_button);
        videoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(movieUrl));
                startActivity(intent);
            }
        });

    }
}
