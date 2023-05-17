package entidad;
/*
 * @author Andres Zampar
 */
public class raza {
private String raza;

    public raza() {
    }

    public raza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "raza{" + "raza=" + raza + '}';
    }


}
