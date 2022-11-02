package s5.p10.collections;

import java.util.*;


public class CollectionImportXml {

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    private Properties properties = new Properties();
    private List<String> lists = new ArrayList<>();
    private Map<String, String> maps = new HashMap<>();
    private Set<String> sets = new HashSet<>();


    public  void displayinfo(){
        System.out.println("this is from prop : ");
        properties.keySet().stream().forEach(e-> System.out.println(properties.getProperty(e.toString())));

        System.out.println("this is from lists :  ");
        lists.stream().forEach(e-> System.out.println(e));

        System.out.println("this is from map :");
        maps.entrySet().stream().forEach(e-> System.out.println(e.getKey() +" value" +e.getValue() ));

        System.out.println("this is from sets : ");
        sets.stream().forEach(e-> System.out.println(e));
    }

}
