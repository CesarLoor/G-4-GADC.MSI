
package espe.edu.ec.CoopLatina.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Bus {
    private String matricula;
    private String nameChofer;
    private int route;

    public Bus(String matricula, String nameChofer, int route) {
        this.matricula = matricula;
        this.nameChofer = nameChofer;
        this.route = route;
    }

    @Override
    public String toString() {
        return "Bus{" + "matricula=" + matricula + ", nameChofer=" + nameChofer + ", route=" + route + '}';
    }
    

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nameChofer
     */
    public String getNameChofer() {
        return nameChofer;
    }

    /**
     * @param nameChofer the nameChofer to set
     */
    public void setNameChofer(String nameChofer) {
        this.nameChofer = nameChofer;
    }

    /**
     * @return the route
     */
    public int getRoute() {
        return route;
    }

    /**
     * @param route the route to set
     */
    public void setRoute(int route) {
        this.route = route;
    }

    
    
    
}
