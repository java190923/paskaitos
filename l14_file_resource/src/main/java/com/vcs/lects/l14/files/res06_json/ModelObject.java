package com.vcs.lects.l14.files.res06_json;



import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ModelObject {

    private boolean isSomethingMissing;
    private String[] stringArr;
    private Integer sk;
    private List<String> strings = new ArrayList<>();
    private Map<Langs, String> langsMap = new HashMap<>();
    private Map<String, Person> persons = new HashMap<>();

    public ModelObject() {

        isSomethingMissing = false;
        stringArr = new String[] { "Tekstas", "Text", "TXT" };
        sk = Integer.MAX_VALUE;
        strings.addAll(Arrays.asList("str", "sdfdsf", "asdsad"));

        langsMap.put(Langs.EN, "English");
        langsMap.put(Langs.LT, "Lietuvių");

        persons.put("00001", new Person("vardsas", 4));
        persons.put("00002", new Person("Petras", 90));
    }

    public boolean isSomethingMissing() {
        return isSomethingMissing;
    }

    public void setSomethingMissing(boolean isSomethingMissing) {
        this.isSomethingMissing = isSomethingMissing;
    }

    public String[] getStringArr() {
        return stringArr;
    }

    public void setStringArr(String[] stringArr) {
        this.stringArr = stringArr;
    }

    public Integer getSk() {
        return sk;
    }

    public void setSk(Integer sk) {
        this.sk = sk;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public Map<Langs, String> getLangsMap() {
        return langsMap;
    }

    public void setLangsMap(Map<Langs, String> langsMap) {
        this.langsMap = langsMap;
    }

    public Map<String, Person> getPersons() {
        return persons;
    }

    public void setPersons(Map<String, Person> persons) {
        this.persons = persons;
    }

}
