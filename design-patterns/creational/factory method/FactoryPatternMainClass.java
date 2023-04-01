public class FactoryPatternMainClass {
    
    public static void main(String[] args) {
    
        ProfessionFactory professionFactory = new ProfessionFactory();
        Profession engineer = professionFactory.getProfession("Engineer");
        engineer.print();
    }
}
