package stryker_studio.ligoapp1;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class FunFactInformation extends MainActivity{

    @Bind(R.id.textView) TextView textVew;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.funfact_information);
        ButterKnife.bind(this);

        textVew.setText("Nearly everything we know about the universe comes from electromagnetic radiation—that is, light. Astronomy began with\n" +
                " visible light and then expanded to the rest of the electromagnetic spectrum. By using the spectrum, from the short wavelengths\n" +
                " of gamma rays to the long wavelengths of radio waves, astronomers have discovered strange and wondrous things. Now a new\n" +
                " form of astronomy, gravitational-wave astronomy, has come. It watches not light but movements in space-time. Along with the\n" +
                " new astronomy has come a new kind of observatory, the Laser Interferometer Gravitational-Wave Observatory (LIGO).\n" +
                "\n" +
                "Gravitational Waves Are Ripples in Space-Time\n" +
                " According to Albert Einstein’s theory of general relativity, gravity is not a force reaching out through the universe. It’s a bending\n" +
                " of space-time. When an object accelerates, it distorts the space-time around it, and that distortion travels away from the source\n" +
                " at the speed of light.\n" +
                "\n" +
                "Gravitational Waves Come from Really Heavy Objects\n" +
                " So how massive an object are we talking about? The first proof that gravitational waves actually exist came from a binary\n" +
                " pulsar—two neutron stars, each about the mass of the Sun, that orbit each other. The pulsars’ orbit is gradually shrinking,\n" +
                " so the pulsars are losing energy. That energy is exactly the amount that general relativity predicts that the pulsars would give\n" +
                " off in gravitational waves.\n" +
                "\n" +
                "The Effect of Gravitational Waves Is Very, Very Small\n" +
                " Since gravitational waves are a ripple in space-time, they cause the distance between two points to change ever so slightly. How\n" +
                " slightly? LIGO must be able to measure distances as small as 10−19 meter. The proton has a radius of about 0.85 × 10−15 meter,\n" +
                " or 10,000 times larger.\n" +
                "\n" +
                "Measuring Gravitational Waves Is Tricky\n" +
                " To detect a change in distance much smaller than the proton requires great precision. Each LIGO installation is a laser \n" +
                " interferometer made up of two underground pipes, each 1.3 meters (4.3 feet) wide and 4 km (2.5 miles) long, set in an L-shape.\n" +
                " The inside of the pipes is a vacuum. When a gravitational wave passes through LIGO, one arm of the instrument gets longer and\n" +
                " the other gets shorter. A laser beam is split in half, sent down the two pipes, reflected back, and then recombined so the two\n" +
                " beams cancel each other out in destructive interference if there is no gravitational wave. If there is a gravitational wave, the beams\n" +
                " won’t cancel each other out. A 4-km long beam is still not enough to detect a gravitational wave, so the beams are bounced back\n" +
                " and forth about 400 times so the light travels a distance of 1,600 km (1,000 miles).\n" +
                "\n" +
                "LIGO Is Very Sensitive\n" +
                " LIGO detects such a small change in distance that it can detect a lot of other vibrations too. For example, the speed limit at LIGO\n" +
                " is 16 km (10 miles) per hour to minimize vibrations from nearby cars. One source of noise is gravity gradient noise, which is the\n" +
                " minute change in Earth’s gravitational field when a vibration passes through the ground near the mirrors. The mirrors that reflect\n" +
                " the light weigh 40 kg (88 pounds) and hang by silica fibers in a complex suspension system. To make sure that LIGO does detect\n" +
                " gravitational waves and not just passing cars, there are two LIGO installations—one in Livingston, Louisiana, and the other in\n" +
                " Hanford, Washington. A gravitational wave would show up at both installations.\n" +
                "\n" +
                "Gravitational-Wave Astronomy Can See an Entirely New Side of the Universe\n" +
                "If supermassive black holes (black holes one million times more massive than the Sun) merged in a distant galaxy, LIGO could\n" +
                " observe it. Scientists also expect that if a neutron star is slightly nonspherical, the gravitational waves could be observed and\n" +
                " thus reveal much about the star’s structure. Every time astronomers have been able to look at the universe in a new way, they’ve\n" +
                " always observed something unexpected, and gravitational-wave astronomy will likely show something not yet thought of.");
    }
}
