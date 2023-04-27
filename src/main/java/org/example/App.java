package org.example;


public class App 
{
    public static void main(String[] args ) throws Exception {
        Race race =new Race();
     race.start();
}
}
 /*
             Engine daciaEngine = new Engine();
        daciaEngine.setManufacturer("Renault");
        RadioControlledCar dacia = new RadioControlledCar(daciaEngine);

        dacia.setName("Dacia");
        dacia.setColor("red");
        dacia.setWheelCount (4);
        dacia.setMileage(8.5);
        dacia.setDoorCount(4);






        Engine ladaEngine =new Engine();
        ladaEngine.setManufacturer("Lada");


        RadioControlledCar lada = new RadioControlledCar(ladaEngine);


        lada.setName("Lada");
        lada.setColor("blue");
        lada.setWheelCount(4);
        lada.setMileage(8);
        lada.setDoorCount(2);
        Vehicle motorcycle = new RadioControlledMotorcycle(new Engine());
        motorcycle.accelerate(10);
        Race race = new Race();
        race.getCompetitors().add(dacia);
        race.getCompetitors().add(lada);


/*
        for (int i = 0; i < race.getCompetitors().length; i++); {
           if(race.getCompetitors()[i] != null){
            System.out.println("Vehicle " + i + ": " + race.getCompetitors()[i].getName());
                }
            }
*/
/*
        for(Vehicle vehicle : race.getCompetitors()) {


            if(vehicle != null){
                System.out.println(vehicle.getName());
                    }
            }

            race.readVehicleName();
            race.readAccelerationSpeed();

    }
}*/