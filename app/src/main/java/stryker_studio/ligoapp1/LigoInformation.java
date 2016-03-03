package stryker_studio.ligoapp1;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class LigoInformation extends MainActivity{

    @Bind(R.id.textView) TextView textVew;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ligo_information);
        ButterKnife.bind(this);

        textVew.setText("About:\n" +
                " The Laser Interferometer Gravitational-Wave Observatory (LIGO) is designed to open the field of\n" +
                " gravitational-wave astrophysics through the direct detection of gravitational waves predicted by\n" +
                " Einstein’s General Theory of Relativity. LIGO’s multi-kilometer-scale gravitational wave detectors\n" +
                " use laser interferometry to measure the minute ripples in space-time caused by passing\n" +
                " gravitational waves from cataclysmic cosmic sources such as the mergers of pairs of neutron\n" +
                " stars or black holes, or by supernovae. LIGO consists of two widely separated interferometers\n" +
                " within the United States—one in Hanford, Washington and the other in Livingston, \n" +
                " Louisiana—operated in unison to detect gravitational waves.\n" +
                "\n" +
                " LIGO is a national facility for gravitational-wave research, providing opportunities for the broader \n" +
                " scientific community to participate in detector development, observation, and data analysis. The\n" +
                " capabilities of the LIGO detectors have been improved by the recently completed Advanced LIGO project,\n" +
                " which will increase the sensitivity and observational range of LIGO by a factor of 10, bringing 1000\n" +
                " times more galaxies into LIGO's observational range.\n" +
                "\n" +
                " The design and construction of LIGO was carried out by LIGO Laboratory’s team of scientists, engineers,\n" +
                " and staff at the California Institute of Technology (Caltech) and the Massachusetts Institute of \n" +
                " Technology (MIT), and collaborators from the over 80 scientific institutions world-wide that are members\n" +
                " of the LIGO Scientific Collaboration.\n" +
                "\n" +
                " The responsibilities of LIGO Laboratory include operating the LIGO detectors, research and developent \n" +
                " aimed at further improving the capabilities of the LIGO detectors, research in the fundamental physics \n" +
                " of gravitation, astronomy, and astrophysics, and public education and outreach. LIGO is funded by the \n" +
                " U.S. National Science Foundation and operated by the California Institute of Technology (Caltech) and \n" +
                " the Massachusetts Institute of Technology (MIT).\n" +
                "\n" +
                " Although it is considered one observatory, LIGO is comprised of four distinct facilities across the United\n" +
                " States: two gravitational wave detectors (the interferometers) and two university research centers. The\n" +
                " interferometers are located in fairly isolated areas of Washington (LIGO Hanford) and Louisiana\n" +
                " (LIGO Livingston), and separated by 3,002 km (1,865 miles). The two primary research centers are located\n" +
                " at The California Institute of Technology (Caltech) in Pasadena, California, and The Massachusetts Institute\n" +
                " of Technology (MIT) in Cambridge, Massachusetts\n" +
                "\n" +
                " The detector sites in Hanford and Livingston are home to the interferometers that make LIGO an \n" +
                " \"observatory\". About 40 people work at each observatory site, including engineers, technicians, and\n" +
                " scientists who keep the instruments operating, and who monitor vacuum and computer systems around\n" +
                " the clock. Administrative and business staff are also present, as are education and public outreach\n" +
                " professionals who conduct public tours, facilitate field trips for local students, and arrange periodic\n" +
                " public events.");
    }
}
