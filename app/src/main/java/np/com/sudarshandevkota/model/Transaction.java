package np.com.sudarshandevkota.model;

import java.util.Date;

public class Transaction {
    private int id;
    private String senderOrReceiver;
    private double amount;
    private String note;
    private Date timestamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenderOrReceiver() {
        return senderOrReceiver;
    }

    public void setSenderOrReceiver(String senderOrReceiver) {
        this.senderOrReceiver = senderOrReceiver;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
