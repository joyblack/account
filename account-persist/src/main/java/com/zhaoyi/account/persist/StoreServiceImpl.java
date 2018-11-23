package com.zhaoyi.account.persist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StoreServiceImpl implements StoreService {
    public void store() {
        String data = "stroe something is file.";
        File file = new File("store.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file.getName(), true);
            writer.write(data);
            writer.close();
            System.out.println("over!");
        }catch (IOException e){
        }
    }
}
