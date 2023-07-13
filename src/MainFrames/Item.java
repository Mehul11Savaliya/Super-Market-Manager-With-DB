
package MainFrames;

import java.io.*;
import java.util.ArrayList;

public class Item implements java.io.Serializable
{
 private   String Icode,cmpny,Iprice,Qty,Iname,Catagory,lhby;

    public void setCmpny(String cmpny) {
        this.cmpny = cmpny;
    }

    public void setLhby(String lhby) {
        this.lhby = lhby;
    }

    public String getCmpny() {
        return cmpny;
    }

    public String getLhby() {
        return lhby;
    }

    public Item(String Icode, String cmpny, String Iprice, String Qty, String Iname, String Catagory, String lhby) {
        this.Icode = Icode;
        this.cmpny = cmpny;
        this.Iprice = Iprice;
        this.Qty = Qty;
        this.Iname = Iname;
        this.Catagory = Catagory;
        this.lhby = lhby;
    }

    public String getIcode() {
        return Icode;
    }

    @Override
    public String toString() {
        return "Item{" + "Icode=" + Icode + ", cmpny=" + cmpny + ", Iprice=" + Iprice + ", Qty=" + Qty + ", Iname=" + Iname + ", Catagory=" + Catagory + ", lhby=" + lhby + '}';
    }

    public void setIcode(String Icode) {
        this.Icode = Icode;
    }

    public String getcmpny() {
        return cmpny;
    }

    public void setBillno(String cmpny) {
        this.cmpny = cmpny;
    }

    public String getIprice() {
        return Iprice;
    }

    public void setIprice(String Iprice) {
        this.Iprice = Iprice;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String Qty) {
        this.Qty = Qty;
    }

    public String getIname() {
        return Iname;
    }

    public void setIname(String Iname) {
        this.Iname = Iname;
    }

    public String getCatagory() {
        return Catagory;
    }

    public void setCatagory(String Catagory) {
        this.Catagory = Catagory;
    }

    public Item() {
    }

    public Item(String Icode, String cmpny, String Iprice, String Qty, String Iname, String Catagory) {
        this.Icode = Icode;
        this.cmpny =cmpny;
        this.Iprice = Iprice;
        this.Qty = Qty;
        this.Iname = Iname;
        this.Catagory = Catagory;
    }
    public void addItem(ArrayList<Item> el,String fname) throws FileNotFoundException, IOException{
       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
       oos.writeObject(el);
       oos.close();
       
    }
    public ArrayList<Item> read(String fname) throws FileNotFoundException, IOException, ClassNotFoundException{
     ArrayList<Item> tmp;
     ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname));
     tmp = (ArrayList<Item>) ois.readObject();
     ois.close();
     return tmp;
    }
}
