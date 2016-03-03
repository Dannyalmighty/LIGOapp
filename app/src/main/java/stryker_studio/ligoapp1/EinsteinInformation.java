package stryker_studio.ligoapp1;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by danny on 3/1/16.
 */
public class EinsteinInformation extends MainActivity{

    @Bind(R.id.textView) TextView textVew;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.einstein_information);
        ButterKnife.bind(this);

        textVew.setText("          According to newtonian theory, gravitational effects propagate from place to place instantaneously. With the\n" +
                " advent of Einstein's special theory of relativity in 1905, a theory uniting the concepts of space and time into that\n" +
                " of four dimensional flat space-time (named Minkowski space-time after the mathematician Hermann Minkowski),\n" +
                " a problem became discernible with newtonian theory. According to special relativity, which is the current guideline\n" +
                " to the form of all physical theory, the speed of light, c = 3 x 1010 cm s-1, is the top speed allowed to physical\n" +
                " particles or forces: There can be no instantaneous propagation. After a decade of search for new concepts to \n" +
                "make gravitational theory compatible with the spirit of special relativity, Einstein came up with the theory of general\n" +
                " relativity (1915), the prototype of all modern gravitational theories. Its crucial ingredient, involving a colossal\n" +
                " intellectual jump, is the concept of gravitation, not as a force, but as a manifestation of the curvature of\n" +
                " space-time, an idea first mentioned in rudimentary form by the mathematician Ceorg Bernhard Riemann in 1854.\n" +
                " In Einstein's hands gravitation theory was thus transformed from a theory of forces into the first dynamical theory\n" +
                " of geometry, the geometry of four dimensional curved space-time.\n" +
                "          Why talk of curvature? One of Einstein's first predictions was the gravitational redshift: As any wave, such as light,\n" +
                " propagates away from a gravitating mass, all frequencies in it are reduced by an amount proportional to the\n" +
                " change in gravitational potential experienced by the wave. This redshift has been measured in the laboratory, in\n" +
                " solar observations, and by means of high precision clocks flown in airplanes. However, imagine for a moment\n" +
                " that general relativity had not yet been invented, but the redshift has already been measured. According to a\n" +
                " simple argument owing to Alfred Schild, wave propagation under stationary circumstances can display a redshift\n" +
                " only if the usual geometric relations implicit in Minkowski space-time are violated: The space-time must be curved.\n" +
                " The observations of the redshift thus show that space-time must be curved in the vicinity of\n" +
                " masses, regardless of the precise form of the gravitational theory.\n" +
                "          Einstein provided 10 equations relating the metric (a tensor with 10 independent components describing the\n" +
                " geometry of space-time) to the material energy momentum tensor (also composed of 10 components, one of\n" +
                " which corresponds to our previous rho). These Einstein field equations, in which both of the previously mentioned\n" +
                " constants G and c figure as parameters, replace Poisson's equation. Einstein also replaced the newtonian law of\n" +
                " motion by the statement that free test particles move along geodesics, the shortest curves in the space-time\n" +
                " geometry. The influential gravitation theorist John Archibald Wheeler has encapsulated general relativity in the\n" +
                " aphorism ``curvature tells matter how to move, and matter tells space-time how to curve.'' The\n" +
                " Eötvos-Dicke-Braginsky experiments demonstrate with high precision that free test particles all travel\n" +
                " along the same trajectories in space-time, whereas the gravitational redshift shows (with more modest precision)\n" +
                " these universal trajectories to be identical with geodesics.\n" +
                "         Despite the great contrast between General Relativity and Newtonian theory, predictions of the former approach\n" +
                " the latter for systems in which velocities are small compared to c and gravitational potentials are weak enough\n" +
                " that they cannot cause larger velocities. This is why we can discuss with newtonian theory the structure of the\n" +
                " earth and planets, stars and stellar clusters, and the gross features of motions in the solar system without fear\n" +
                " of error.\n" +
                "        Einstein noted two other predictions of General Relativity. First, light beams passing near a gravitating body must\n" +
                " suffer a slight deflection proportional to that body's mass. First verified by observations of stellar images during\n" +
                " the 1919 total solar eclipse, this effect also causes deflection of quasar radio images by the sun, is the likely cause\n" +
                " of the phenomenon of ``double quasars'' with identical redshift and of the recently discovered giant arcs in clusters\n" +
                " of galaxies (both probably effects of gravitational lensing), and is part and parcel of the black hole phenomenon.\n" +
                " In a closely related effect first noted by Irwin Shapiro, radiation passing near a gravitating body is delayed in its\n" +
                " flight in proportion to the body's mass, a time delay verified by means of radar waves deflected by the sun on their\n" +
                " way from Earth to Mercury and back.\n" +
                "        The second effect is the precession of the periastron of a binary system. According to newtonian gravitation, the\n" +
                " orbit of each member of a binary is a coplanar ellipse with orientation fixed in space. General relativity predicts a\n" +
                " slow rotation of the ellipse's major axis in the plane of the orbit (precession of the periastron). Originally verified\n" +
                " in the motion of Mercury, the precession has of late also been detected in the orbits of binary pulsars.\n" +
                "\n" +
                "All three effects mentioned depend on features of General Relativity beyond the weak equivalence principle. Indeed,\n" +
                " Einstein built into general relativity the much more encompassing ``strong equivalence principle'': the local forms of\n" +
                " all nongravitational physical laws and the numerical values of all dimensionless physical constants arc the same in the\n" +
                " presence of a gravitational field as in its absence. In practice this implies that within any region in a gravitational field,\n" +
                " sufficiently small that space-time curvature may be ignored, all physical laws, when expressed in terms of the space-time\n" +
                " metric, have the same forms as required by special relativity in terms of the metric of Minkowski space-time. Thus in a\n" +
                " small region in the neighborhood of a black hole (the source of a strong gravitational field) we would describe\n" +
                " electromagnetism and optics with the same Maxwell equations used in earthly laboratories where the gravitational field\n" +
                " is weak, and we would employ the laboratory values of the electrical permittivity and magnetic\n" +
                " susceptibility of the vacuum.");
    }

}
