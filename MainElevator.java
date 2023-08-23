public class MainElevator {
    public static void main(String[] args) {
        Java6Elevator elevator = new Java6Elevator(1, 15);
        System.out.println(elevator);
        Java6Elevator elevator1 = new Java6Elevator(8);
        System.out.println(elevator1.getCurrentFloor());
        elevator.setMinMaxFloor(6, 9);
        System.out.println(elevator);
        elevator1.move(6);
    }
    

}
