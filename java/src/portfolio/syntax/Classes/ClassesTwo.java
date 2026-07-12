package syntax.Classes;

public class ClassesTwo
{
    private double latitude;
    private double longitude;

    // constructor
    public ClassesTwo(double latitude, double longitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // getters
    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    // setters
    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }

    // class methods
    public boolean isNorthOf(ClassesTwo otherCoordinate)
    {
        return this.latitude > otherCoordinate.latitude;
    }

    public boolean isSouthOf(ClassesTwo otherCoordinate)
    {
        return this.latitude < otherCoordinate.latitude;
    }

    public int getLatitudeDegrees()
    {
        return (int)latitude;    // casting?
    }

    public int getLatitudeMinutes()
    {
        double minutes = (latitude - getLatitudeDegrees()) * 60.0;
        return (int)minutes;
    }

    public double getLatitudeSeconds()
    {
        double minutes = (latitude - getLatitudeDegrees()) * 60.0;
        return (minutes - getLatitudeMinutes()) * 60;
    }

    @Override
    public String toString()
    {
        return "Latitude: " + latitude + ", Longitude: " + longitude;
    }
}
