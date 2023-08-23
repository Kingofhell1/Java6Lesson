public class Java6Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;
 
    public int getCurrentFloor() 
    {
        System.out.print("Начальный этаж ");
        return currentFloor;
    }
   //Функция определение совпадения этажей мин и мах
     public Java6Elevator(int minFloor, int maxFloor)  {
        if (minFloor >= maxFloor) {
            System.out.println("Нельзя создать заданный диапазо этажей.");
        }
            this.minFloor = minFloor;
            this.maxFloor = maxFloor;
    }
    //Функция определения максиального этажа, который не должен быть меньще или равен 1 
    public Java6Elevator(int maxFloor)  {
        if (1 >= maxFloor ) {
            System.out.println("Нельзя создать подобный диапазон.");
        } else {
            this.maxFloor = maxFloor;
            this.minFloor = 1;
        }
    }
    // 
    public void setMinMaxFloor(int minNumber, int maxNumber)  {
        if(minNumber >= maxNumber) {
           System.out.println("Нельзя создать заданный диапазо этажей.");
        }
        this.minFloor = minNumber;
        this.maxFloor = maxNumber;
    }
    //Движение лифта на определенный этаж
    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor || floor == 0) {
            System.out.println("Такого этажа нет");
        } else if (floor >= minFloor && floor <= maxFloor) {
            System.out.println("Лифт находится на " + floor + " этаже");
        } 
       
    }
    public int getMinFloor(){
        return minFloor;
    }

    public int getMaxFloor(){
        return maxFloor;
    }
    // метод проверки правильности переопределения
     @Override
        public String toString() {
            return String.format("%d, %d", getMinFloor(), getMaxFloor());
        }
}


      


