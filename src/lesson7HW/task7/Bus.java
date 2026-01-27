package lesson7HW.task7;

import java.util.*;

public class Bus {
    int passengerCount = 0;
    List<Passenger> passengerList = new LinkedList<>();
    Random random = new Random();
    BusStop stop1 = new BusStop("Stop1",new ArrayList<>(List.of(new Passenger("Ali", false), new Passenger("Aysel (Priority)", true), new Passenger("Rauf", false))));
    BusStop stop2 = new BusStop("Stop2",new ArrayList<>(List.of(new Passenger("Nigar (Priority)", true), new Passenger("Samir (Priority)", true), new Passenger("Murad", false))));
    BusStop stop3 = new BusStop("Stop3",new ArrayList<>(List.of(new Passenger("Sevinc (Priority)", true), new Passenger("Leyla", false), new Passenger("Tural", false))));


    public void simulation(){
        System.out.println("Simulation started");

        busStop(stop1);
        busStop(stop2);
        busStop(stop3);

        System.out.println("Simulation finished");

    }

   public void busStop(BusStop busStop){
       System.out.println(busStop + " reached");
       System.out.println("Passengers on "+ busStop.busStopName + busStop.passengerlist);

       if(!passengerList.isEmpty()){
           int random1 = random.nextInt(0, passengerList.size());
           System.out.println(passengerList.get(random1).getName() +" Left the bus");
           passengerList.remove(random1);
           passengerCount--;
           int random2 = random.nextInt(0, passengerList.size());
           System.out.println(passengerList.get(random2).getName() +" Left the bus");
           passengerList.remove(random2);
           passengerCount--;
       }
       Iterator<Passenger> iterator = busStop.passengerlist.iterator();
       while (iterator.hasNext() && passengerCount<5){
           Passenger p = iterator.next();
           if(p.isPriority()) {
               passengerList.add(p);
               System.out.println(p.getName() + " Boarded the bus");
               iterator.remove();
               passengerCount++;
           }
       }
       Iterator<Passenger> iterator2 = busStop.passengerlist.iterator();
       while (iterator2.hasNext() && passengerCount<5){
           Passenger p = iterator2.next();
           passengerList.add(p);
           System.out.println(p.getName() + " Boarded the bus");
           iterator2.remove();
           passengerCount++;

       }
       System.out.println("Bus now: " + passengerList.toString());
       System.out.println(busStop + " remaining: " + busStop.passengerlist.toString());
       }

   }




