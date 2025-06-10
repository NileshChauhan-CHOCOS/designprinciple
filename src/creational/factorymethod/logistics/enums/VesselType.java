package creational.factorymethod.logistics.enums;

/**
 * @author Nilesh Chauhan
 */

public enum VesselType {
    
    /**
     * A bulker, also known as a bulk carrier, is a specialized merchant ship designed to transport unpackaged, dry bulk cargo, such as grain, coal, ore, or cement
     */
    BULKER,
    
    /**
     * Transports standardized cargo containers, optimized for intermodal transport.
     */
    CONTAINER_SHIP,
    
    /**
     * Cruise ships are used for vacation and leisure travel, carrying passengers on multi-day trips across oceans or coastal routes. They are less about cargo logistics and more about passenger transport and hospitality.
     */
    CRUISE_SHIP,
    
    /**
     * Transports liquids or gases, such as crude oil, LNG, or chemicals.
     */
    TANKER,
    
    /**
     * Used for inland or coastal transport, often for bulk goods.
     */
    BARGE
}
