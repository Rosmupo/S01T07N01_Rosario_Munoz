package EX2;

/*
Afegeix a les classes filles alguns mètodes obsolets
(deprecated), i utilitza l’anotació corresponent.
Invoca des d'una classe externa els mètodes obsolets,
suprimint mitjançant l'anotació corresponent els “warnings”
 per ser obsolets.
* */

public class App {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Employee employee = new Employee("Pedro", "López", 20);
        System.out.println(employee.calculateSalary(20));

        FaceToFaceWorker faceToFaceWorker = new FaceToFaceWorker("Juan", "Muñoz", 30, 160);
        System.out.println(faceToFaceWorker.calculateSalary(faceToFaceWorker.getNumHourPerMonth()));

        OnlineWorker onlineWorker = new OnlineWorker("Pepe", "Rodríguez", 40, 160);
        System.out.println(onlineWorker.calculateSalary(onlineWorker.getNumHourPerMonth()));

        //Llamada al método al que se le ha suprimido el método deprecated
        System.out.println(faceToFaceWorker.sum(1, 2));

        System.out.println(faceToFaceWorker.sum(3.0, 5.4));

    }

}
