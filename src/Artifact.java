public class Artifact {
    int serialNumber;
    String culture;
    int century;

    public Artifact(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Artifact(int serialNumber, String culture) {
        this.serialNumber = serialNumber;
        this.culture = culture;
    }

    public Artifact(int serialNumber, String culture, int century) {
        this.serialNumber = serialNumber;
        this.culture = culture;
        this.century = century;
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(212121);
        Artifact artifact2 = new Artifact(212121, "Ацтеки");
        Artifact artifact3 = new Artifact(212121, "Ацтеки", 12);
        System.out.println(artifact1.serialNumber);
        System.out.println(artifact2.serialNumber + " " + artifact2.culture);
        System.out.println(artifact3.serialNumber + " " + artifact3.culture + " " + artifact3.century);
    }
}