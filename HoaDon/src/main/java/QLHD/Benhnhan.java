
package QLHD;

public class Benhnhan {
    private  String ID;
    private  String Name;
    private  int Date;
    private  boolean Request_Room;
    
    // Contrustor

    public Benhnhan() {
    }
    
    public  Benhnhan(String ID, String name,int Date,boolean Requestroom){
        this.ID = ID;
        this.Name = name;
        this.Date = Date;
        this.Request_Room = Requestroom;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }

    public boolean isRequest_Room() {
        return Request_Room;
    }

    public void setRequest_Room(boolean Request_Room) {
        this.Request_Room = Request_Room;
    }

    

    @Override
    public String toString() {
        return ID + " " + Name + " " + Date + " " + Request_Room;
    }

    
    
}

class Benhnhanbhyt extends Benhnhan implements Vienphi{
    private  int Mabaohiemyt ;

     public Benhnhanbhyt() {
    }
    
     
    public Benhnhanbhyt(String ID, String name, int Date, boolean Requestroom,int Mabaohiemyt) {
        super(ID, name, Date, Requestroom);
        this.Mabaohiemyt = Mabaohiemyt;
    }


    public int getMabaohiemyt() {
        return Mabaohiemyt;
    }

    public void setMabaohiemyt(int Mabaohiemyt) {
        this.Mabaohiemyt = Mabaohiemyt;
    }

    // hoa don doi voi nguoi co bao hiem
    @Override
    public float Hoadonvienphi() {
        float cal = 0;
        float baymuoi = (float) ((getDate() * Dongia) *70 / 100);
        if(isRequest_Room() == true)
        {
            cal = (float) (getDate() * (float)Dongia * 200.000) - baymuoi;
        }
        else
        {
            cal = (float) (getDate() * (float)Dongia) - baymuoi;
        }
        return cal;
    }

    

    
}

class Benhnhanxh extends Benhnhan implements Vienphi{

    private  int Mabaohiemxh ;
    public Benhnhanxh(String ID, String name, int Date, boolean Requestroom) {
        super(ID, name, Date, Requestroom);
    }

    public int getMabaohiemxh() {
        return Mabaohiemxh;
    }

    public void setMabaohiemxh(int Mabaohiemxh) {
        this.Mabaohiemxh = Mabaohiemxh;
    }

    // doi voi co bao hiem xa hoi
    @Override
    public float Hoadonvienphi() {
        float cal = 0;
        if(isRequest_Room() == true)
        {
            cal = (float) (getDate() * (float)Dongia * 200.000);
        }
        else
        {
            cal = (float) (getDate() * (float)Dongia);
        }
        return cal;
    }

}