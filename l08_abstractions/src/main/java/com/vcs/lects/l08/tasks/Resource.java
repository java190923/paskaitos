package com.vcs.lects.l08.tasks;

public class Resource implements ResReader, ResWriter {

    private String data = "secret data";

    @Override
    public String readData() {
        return data;
    }

    @Override
    public void writeData(String data) {
        this.data = data;
    }

}

interface ResReader {
    String readData();
}

interface ResWriter {
    void writeData(String data);
}


class Manager {
    public void readWrite(Resource data) {
        String secret = data.readData(); // Ok
        data.writeData("new data"); // Ok
    }
}

class Reader {
    public void read(ResReader data) {
        data.readData(); // Ok
        //data.writeData("new data"); // NOT OK
    }
}

class Writer {
    public void write(ResWriter data) {
        //data.readData(); // NOT OK
        data.writeData("new data"); // Ok
    }
}
