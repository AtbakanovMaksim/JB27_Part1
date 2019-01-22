package сom.epam.jb27.maksim_atbakanau.lesson6.Fraction;

public class Fraction {
    private int dividend;
    private int divider;

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getDivider() {
        return divider;
    }

    public void setDivider(int divider) {
        this.divider = divider;
    }

    public Fraction(int dividend, int divider) {
        this.dividend = dividend;
        this.divider = divider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (dividend != fraction.dividend) return false;
        return divider == fraction.divider;
    }

    @Override
    public int hashCode() {
        int result = dividend;
        result = 31 * result + divider;
        return result;
    }

    @Override
    public String toString() {
        return dividend + "/" + divider;
    }
}
