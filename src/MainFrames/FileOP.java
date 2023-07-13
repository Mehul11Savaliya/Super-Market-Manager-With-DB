
package MainFrames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


class emp implements java.io.Serializable
{
        String eid,name,pass,gender,age,addr;

    public String getEid() {
        return eid;
    }

    @Override
    public String toString() {
        return "emp{" + "eid=" + eid + ", name=" + name + ", pass=" + pass + ", gender=" + gender + ", age=" + age + ", addr=" + addr + '}';
    }

    public emp() {
    }

    public emp(String eid, String name, String pass, String gender, String age, String addr) {
        this.eid = eid;
        this.name = name;
        this.pass = pass;
        this.gender = gender;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getAddr() {
        return addr;
    }
}
public class FileOP {
      static void write(ArrayList<emp> r,String fname) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
        oos.writeObject(r);
        oos.close();
    }
      static ArrayList<emp> read(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(name));
        ArrayList<emp> el;
        el =(ArrayList<emp>) ois.readObject();
        ois.close();
        return el;
      }
}
