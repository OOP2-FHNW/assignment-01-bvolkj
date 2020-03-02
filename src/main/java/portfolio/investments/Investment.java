package portfolio.investments;

import java.util.Objects;

public abstract class Investment {
    private String titel;
    private String country;
    private double singlePrice;
    private double count;

    public Investment(String titel) {
        this.titel       = titel;
        this.country = "Schweiz";
        this.count = 1.0;
        this.singlePrice = 1.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Investment Investment = (Investment) o;

        return Objects.equals(getTitel(), Investment.getTitel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitel());
    }

    // all getters and setters according to conventions
    public String getTitel() {
        return titel;
    }

    public double getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(double singlePrice) {
        this.singlePrice = singlePrice;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
