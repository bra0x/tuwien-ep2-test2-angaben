// This class represents a single celestial body with no other objects in orbit.
// A celestial body has a name and a mass in kilograms.
//
// The iterator's 'hasNext' method always returns 'false'. The iteration has no elements.
//
// Adding another object into its orbit (method 'add') results in a 'CelestialSystem' with 'this'
// as central body.
//
public class CelestialBody implements Orbitable {

    // TODO: define missing parts of the class
    private String name;
    private double mass;

    public CelestialBody(String name, double mass) {
        // TODO: implement constructor.
        this.name = name;
        this.mass = mass;
    }

    @Override
    public OrbitIterator iterator() {
        return new CBIterator();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Orbitable add(Orbitable inOrbit) {
        return new CelestialSystem(this, inOrbit);
    }

    @Override
    public String toString() {
        return name + ": " + mass + " kg";
    }
}

