package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Race {

   private List<Vehicle> competitors = new ArrayList<Vehicle>();
   private  double trackLength;
   private double trackFuelLevel;
   private int competitorCount = 2;

    public List<Vehicle> getCompetitors() {
        return competitors;
    }
    public String readVehicleName() {
        System.out.println("Please type a name for your vehicle and press Enter");

        Scanner scanner =new Scanner(System.in);
        String vehicleName = scanner.nextLine();

        System.out.println("Your vehicle's name is:"+ vehicleName);
        return  vehicleName;
    }

    public  double readAccelerationSpeed() throws Exception {
        System.out.println("Please enter acceleration speed as a decimal number ...");
        Scanner scanner =new Scanner(System.in);
    double accelerationSpeed = 0;

        try {
             accelerationSpeed = scanner.nextDouble();
        } catch (InputMismatchException){
            System.out.println("Please enter a valid number.");
            return  readAccelerationSpeed();
        }


        return accelerationSpeed;

    }
    public  void addCompetitor(){
        String name = readVehicleName();

        AutoVehicle autoVehicle = new AutoVehicle();
        autoVehicle.setName(name);

        double mileage = ThreadLocalRandom.current().nextDouble(8,11);
        autoVehicle.setMileage(mileage);
        System.out.println("Mileage for vehicle with name" + autoVehicle.getName() + ":" + mileage + "1/100km");
        competitors.add(autoVehicle);

    }
    public  void addAllCompetitors() {
        for (int i=0; i < competitorCount){
            addCompetitor();

        }
        public Vehicle determineWinner() throws Exception; {
            int noFuelCompetitors = 0;
            boolean noWinnerYet = true;

            while (noFuelCompetitors < competitorCount) {





           for (Vehicle vehicle : competitors) {
               double accelerationSpeed = readAccelerationSpeed();
               double travelDistance = vehicle.accelerate(accelerationSpeed);

               if (vehicle.getFuelLevel() <=0){
                   noFuelCompetitors++;

                   if(travelDistance >= trackLength) {
                       System.out.println("The winner of the race is"+ vehicle.getName());
                      return vehicle;
                   }
               }


           }
           return null;
        }
            public void start(){
                addAllCompetitors();
                determineWinner();
            }


    public void start() {
    }

    public void start() {
    }