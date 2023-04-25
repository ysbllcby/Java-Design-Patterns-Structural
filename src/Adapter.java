public class Adapter implements City{

    City city;

    public Adapter(AsianCity city) {
        this.city = city;
    }
    public String getName() {
        return city.getName();
    }

    public double getTemperature() {
        return city.getTemperature() * 9/5 + 32;
    }

    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    public boolean getHasWeatherWarning() {
        return city.getHasWeatherWarning();
    }

    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        city.setHasWeatherWarning(hasWeatherWarning);
    }
}
