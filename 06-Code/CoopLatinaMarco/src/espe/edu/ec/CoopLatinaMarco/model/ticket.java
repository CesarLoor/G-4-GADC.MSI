package espe.edu.ec.CoopLatinaMarco.model;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE GADC.MSI
 */
public class Ticket {

    private String route;
    private String bus;
    private String address;
    private float price;

    public Ticket() {
    }
    
    public Ticket(String route, String bus, String address, float price) {
        this.route = route;
        this.bus = bus;
        this.address = address;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ticket{" + "route=" + getRoute() + ", bus=" + getBus() + ", address=" + getAddress() + ", price=" + getPrice() + '}';
    }

    /**
     * @return the route
     */
    public String getRoute() {
        return route;
    }

    /**
     * @param route the route to set
     */
    public void setRoute(String route) {
        this.route = route;
    }

    /**
     * @return the bus
     */
    public String getBus() {
        return bus;
    }

    /**
     * @param bus the bus to set
     */
    public void setBus(String bus) {
        this.bus = bus;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

}
