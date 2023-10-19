public class Worker {
    private String Name;
    private String SurName;
    private String Position;
    private int HireYear;
    public Worker(String Name,  String SurName, String Position, int HireYear) {
        this.Name = Name;
        this.SurName = SurName;
        this.Position = Position;
        this.HireYear = HireYear;
    }
    public String getName() {
        return Name;
    }
    public String getSurName() {
        return SurName;
    }

    public int getHireYear() {
        return HireYear;
    }
    public String getPosition() {
        return Position;
    }
    @Override
    public String toString() {
        return "Worker{" +
                "Name - '" + Name + '\'' +
                ", Surname - '" + SurName +
                ", Position - '" + Position + '\'' +
                ", HireYear=" + HireYear +
                '}';
    }
}
