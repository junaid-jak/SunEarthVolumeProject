public class MathCalc {
    public static void main(String[] args) {
        // Given diameters in miles
        double earthDiameter = 7600.0;
        double sunDiameter = 865000.0;

        // Calculate the radius (half of the diameter)
        double earthRadius = earthDiameter / 2.0;
        double sunRadius = sunDiameter / 2.0;

        // Formula for the volume of a sphere: (4/3) * pi * r^3
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);

        // Calculate the ratio of the Sun's volume to the Earth's volume
        double volumeRatio = sunVolume / earthVolume;

        // Output the results
        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
        System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio + ".");
    }
}

