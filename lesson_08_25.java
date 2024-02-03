public class lesson_08_25 {
    //Правильно унаследуй классы:

    //Машину — от транспортного средства;
    //электрокар — от машины.
    //Удали дублирующиеся переменные.
}

class ElectricCar extends Car{
    int electricEnginePower;
}
class Vehicle{
    double maxSpeed;
}
class Car extends Vehicle{
    int wheelCount;
    double weight;
}
