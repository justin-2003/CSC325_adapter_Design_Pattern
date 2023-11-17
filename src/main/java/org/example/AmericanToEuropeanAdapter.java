package org.example;

public class AmericanToEuropeanAdapter implements EuropeanSocket {
    private AmericanPlug americanPlug;

    public AmericanToEuropeanAdapter(AmericanPlug americanPlug){
        this.americanPlug = americanPlug;
    }
    /**
     *Uses the adapter to make the american plug compatible with the European socket
     */
    @Override
    public void plugEuropeanSocket() {
        americanPlug.plugAmericanSocket();
        System.out.println("Adapter: Converting to European socket");
    }
}
