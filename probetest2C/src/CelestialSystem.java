import java.util.ArrayList;

// A celestial system implements 'Orbitable' and has at least one object in orbit around its
// central celestial body. Further objects can be added.
//
public class CelestialSystem implements Orbitable {

    //TODO: Define variables.
    private CelestialBody centralBody;
    private ArrayList<Orbitable> inOrbit;
    //TODO: define missing parts of the class.

    // Initialises this system with its central body.
    public CelestialSystem(CelestialBody centralBody, Orbitable inOrbit) {
        //TODO: implement constructor.
        this.centralBody = centralBody;
        this.inOrbit = new ArrayList<>();
        this.inOrbit.add(inOrbit);
    }

    public CelestialSystem(CelestialBody centralBody, ArrayList<Orbitable> inOrbit) {
        //TODO: implement constructor.
        this.centralBody = centralBody;
        this.inOrbit = inOrbit;
    }


    @Override
    public OrbitIterator iterator() {
        return new CSIterator(inOrbit);
    }

    @Override
    public String getName() {
        return centralBody.getName();
    }

    @Override
    public Orbitable add(Orbitable inOrbit) {
        ArrayList<Orbitable> copy = (ArrayList<Orbitable>) this.inOrbit.clone();
        copy.add(inOrbit);

        return new CelestialSystem(centralBody,copy);
    }

    @Override
    public String toString() {
        String out = centralBody.toString();
        for(Orbitable o : inOrbit){
            String[] lines = o.toString().split("\n");
            for (String line : lines) {
                out = out + "\n\t" + line;
            }
        }
        return out;
    }
}

