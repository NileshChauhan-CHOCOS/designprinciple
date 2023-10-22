package factorymethod.transport;

/**
 * This interface is to provide method for creation of object of Transport and its subType
 */
public interface Logistics{
    Transport createTransport(String vehicleNumber);
}
