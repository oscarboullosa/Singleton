package edu.upc.dsa.models;

import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;
    public HashMap<String,ResourceBundle> lenguages;
    private I18NManager(){
        this.lenguages=new HashMap<>();
    }
    public static I18NManager getInstance(){
        if(instance==null) instance=new I18NManager();
        return instance;
    }
    public void clear(){
        lenguages.clear();
    }
    public String getText(String language,String idi){
        ResourceBundle bundle=ResourceBundle.getBundle(language);
        lenguages.put(language,bundle);
        return bundle.getString(idi);
    }
}
