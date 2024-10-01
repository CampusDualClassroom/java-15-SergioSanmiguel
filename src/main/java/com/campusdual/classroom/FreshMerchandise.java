package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private Date expirationDate;
    public FreshMerchandise( String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getSpecificData() {
    StringBuilder builder = new StringBuilder();
    builder.append("Location: ").append(getLocation()).append("\n");
    builder.append("Expiration date: ").append(getFormattedDate(this.expirationDate)).append("\n");
    return builder.toString();
    }
    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("04-05-2023");
        return dateFormat.format(date);
    }

public void  printSpecificData() {
        System.out.println(getSpecificData());
}

    public Date getExpirationDate(){
        return expirationDate;
    }
public void setExpirationDate(Date expirationDate){
        this.expirationDate = expirationDate;
}
}
