public class App {
    public static void main(String[] args) throws Exception {
        SimpleHashTable<String,String> directorioTelefonico = new SimpleHashTable<>(8);

        directorioTelefonico.put("artur","4428907654");
        directorioTelefonico.put("marvin","5464788989");
        directorioTelefonico.put("jorge","4089765453");  
        
        System.out.println(directorioTelefonico.getV("marvin"));
        
        directorioTelefonico.showTable();
    }
}
