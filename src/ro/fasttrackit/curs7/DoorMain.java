package ro.fasttrackit.curs7;

public class DoorMain {
    public static void main(String[] args) {
        Door myDoor = new Door();
        myDoor.open();
        System.out.println(myDoor);
        myDoor.unlock();
        myDoor.open();
        System.out.println(myDoor.isLock());
        System.out.println(myDoor.isOpen());
    }
}
