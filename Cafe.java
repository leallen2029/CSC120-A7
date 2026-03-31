/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }


    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) { 
        // if you dont have enough materials to make the coffee, restock the materials and then make the coffee
        if (nCoffeeOunces > this.nCoffeeOunces) {
            this.nCoffeeOunces += nCoffeeOunces;
        }
        if (nSugarPackets > this.nSugarPackets) {
            this.nSugarPackets += nSugarPackets;
        }
        if (nCreams > this.nCreams) {
            this.nCreams += nCreams;
        }
        if (nCups > this.nCups) {
            this.nCups += nCups;
        }
    }


    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        this.sellCoffee(100, 100, 100);
        if (size > this.nCoffeeOunces || nSugarPackets > this.nSugarPackets || nCreams > this.nCreams || 1 > this.nCups) {
            System.out.println("Here is your coffee! ☕");
        } else {
            restock(size, nSugarPackets, nCreams, nCreams);
        }
    }

    public static void main(String[] args) {
        new Cafe("Starbucks", "456 Oak Avenue", 1, 1000, 500, 300, 200);
    }
}
