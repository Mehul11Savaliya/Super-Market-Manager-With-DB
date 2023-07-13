package MainFrames;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author mehul
 */
public class Bill implements java.io.Serializable
{
   private String cname,billid,pmethod,data[][],hby;
    double total;
    public Bill() {
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public void setHby(String hby) {
        this.hby = hby;
    }

    public String getHby() {
        return hby;
    }

    public Bill(String cname, String billid, String pmethod, String[][] data, String hby, double total) {
        this.cname = cname;
        this.billid = billid;
        this.pmethod = pmethod;
        this.data = data;
        this.hby = hby;
        this.total = total;
    }

   

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
    }

    public String getPmethod() {
        return pmethod;
    }

    public void setPmethod(String pmethod) {
        this.pmethod = pmethod;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Bill{" + "cname=" + cname + ", billid=" + billid + ", pmethod=" + pmethod + ", data=" + data + ", hby=" + hby + ", total=" + total + '}';
    }
    
    public ArrayList<Bill> read(String fname) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Bill> tmp;
       ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname));
       tmp = (ArrayList<Bill>) ois.readObject();
       ois.close();
       return tmp;
    }
    public void write(ArrayList<Bill> BL,String fname) throws FileNotFoundException, IOException{
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
         oos.writeObject(BL);
         oos.close();
    }
}
