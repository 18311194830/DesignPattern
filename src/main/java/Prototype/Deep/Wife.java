package Prototype.Deep;

import java.io.*;

public class Wife implements Cloneable, Serializable {
    private Param param;

    public Param getParam() {
        return param;
    }

    public void setParam(Param param) {
        this.param = param;
    }

    public Wife clone() throws CloneNotSupportedException {
        Wife wife = (Wife) super.clone();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = null;
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(wife);

            //把字节流转化为对象
            ByteArrayInputStream bais = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (Wife) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wife;
    }
}
