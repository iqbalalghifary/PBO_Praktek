/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week12;

/**
 *
 * @author ikbalalghifary
 */
public class Barang 
{

    public City getCity() {
        return city;
    }


    public void setCity(City city) {
        this.city = city;
    }


    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the servicePackage
     */
    public ServicePackage getServicePackage() {
        return servicePackage;
    }

    /**
     * @param servicePackage the servicePackage to set
     */
    public void setServicePackage(ServicePackage servicePackage) {
        this.servicePackage = servicePackage;
    }

    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public int getPriceItem() {
        return priceItem;
    }


    public void setPriceItem(int priceItem) {
        this.priceItem = priceItem;
    }


    public String getProductName() {
        return productName;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private int weight;
    private int quantity;
    private int priceItem;
    private String productName;
    
    public String printOutput()
    {
        int total = getPriceItem()*getQuantity();
        String output = getProductName()+" | " +getQuantity() + " | "
                +getWeight()+" | "+ getCity().getDestination()+ " | "
                +getServicePackage().getService()+" | "
                + getServicePackage().getValue()+ " | "+total;
        return output;
    }

}
