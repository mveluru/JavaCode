package com.brite.systemdesign.parkinglot;

public class ParkingLot {
	final static  String CHECKIN="CHECKIN";
	private static ParkingLevels A;
	private static ParkingLevels B;
	private static ParkingLevels C;

	private ParkingLot() {
		A = new ParkingLevels("Level-1", 25);
		B = new ParkingLevels("Level-2", 25);
		C = new ParkingLevels("Level-3", 25);
	}

	public void setLotForVehcleParkingLot(String VehicleType, String licensePlate,String checkinORout ) {
		
		allocateParkingSpot(VehicleType, licensePlate,checkinORout);
	}

	private boolean allocateParkingSpot(String VehicleType, String licensePlate,String Checkin) {
		if (VehicleType.equalsIgnoreCase("car")&& Checkin.equalsIgnoreCase(CHECKIN)) {
			int k =allocateParkingLotforCar(new Car(licensePlate));
			if (k == 0){
				System.out.print(" Car Slots Full");
				return false;
			};
		} else if (VehicleType.equalsIgnoreCase("Bus")&& Checkin.equalsIgnoreCase(CHECKIN)) {
			int k =allocateParkingLotforBus(new Bus(licensePlate));
				if (k == 0){
					System.out.print(" Bus Slots Full ");
					return false;
				}
		} else {
			System.out
					.println("Only Cars or Buses are allowed in ABIA parking lot");
			return false;

		}
		return true;
	}

	private int allocateParkingLotforCar(Vehicle v) {
		int status = 0;
		if (A.getPrakingLotCapcity() == A.getLevelCounter()&& B.getPrakingLotCapcity() == B.getLevelCounter()&& C.getPrakingLotCapcity() == C.getLevelCounter()) {
			
			return status;
		}else{
			status =1;
		
	
		if (v instanceof Car) {
			int spots =v.getRequiredSpots();
			if (A.getPrakingLotCapcity() - A.getLevelCounter() >= 1) {
				A.setLevelCounter(A.getLevelCounter() + spots);
				System.out.println(v.getLicensePlate()+" is in level A");
			} else if (A.getPrakingLotCapcity() == A.getLevelCounter()&& B.getPrakingLotCapcity()- B.getLevelCounter() >= 1) {
				B.setLevelCounter(B.getLevelCounter() + spots);
				System.out.println(v.getLicensePlate()+" is in level B");
			} else if (A.getPrakingLotCapcity() == A.getLevelCounter()&& B.getPrakingLotCapcity() == B.getLevelCounter()&& C.getPrakingLotCapcity()-C.getLevelCounter() >= 1) {
				C.setLevelCounter(C.getLevelCounter() + spots);
				System.out.println(v.getLicensePlate()+" is in level C");
			}

		} else {
			System.out.println("Wrong Vehchicle type - instance must be car");
			status= -1;
			}
		}
   
		return status;
	}

	private int allocateParkingLotforBus(Vehicle v) {
		int status = 0;
      if (A.getPrakingLotCapcity() == A.getLevelCounter()&& B.getPrakingLotCapcity() == B.getLevelCounter()&& C.getPrakingLotCapcity() == C.getLevelCounter()) {
			
			return status;
		}else{
			status =1;
		

		if (v instanceof Bus) {
			int spots = v.getRequiredSpots();
			if (A.getPrakingLotCapcity() - A.getLevelCounter() >= 5) {
				A.setLevelCounter(A.getLevelCounter() + spots);
				System.out.println(v.getLicensePlate()+" is in level A");
			} else if (A.getPrakingLotCapcity() == A.getLevelCounter()&& B.getPrakingLotCapcity() -B.getLevelCounter() >= 5) {
				B.setLevelCounter(B.getLevelCounter() + spots);
				System.out.println(v.getLicensePlate()+" is in level B");
			} else if (A.getPrakingLotCapcity() == A.getLevelCounter()&& B.getPrakingLotCapcity() == B.getLevelCounter()&& C.getPrakingLotCapcity() -C.getLevelCounter() >= 5) {
				C.setLevelCounter(C.getLevelCounter() + spots);
				System.out.println(v.getLicensePlate()+" is in level C");
			}

		} else {
			System.out.println("Wrong Vehchicle type - instance must be Bus");
			status= -1;
			}
		}
		return status;

	}
public static void main(String[] args) {
	ParkingLot ABIAParkingLot = new ParkingLot();
	
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","ABC123","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","BBC123","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","CBC123","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","DBC123","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","FBC123","CheckIn");
	
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","ABC113","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","BBC113","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","CBC113","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","DBC113","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","FBC113","CheckIn");
	
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","ABC121","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","BBC121","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","CBC121","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","DBC121","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Car","DBE121","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Car","DBF121","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Car","DBG121","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Car","DBH121","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Car","DBI121","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Bus","FBG121","CheckIn");
	ABIAParkingLot.setLotForVehcleParkingLot("Car","DBH121","CheckIn");
	
	//ABIAParkingLot.setLotForVehcleParkingLot("Bus","CCC121");
}
}
