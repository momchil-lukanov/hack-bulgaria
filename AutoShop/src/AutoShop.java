public class AutoShop {

		public Auto[] autos = new Auto[10];
		int counterAuto = 0;

		public void addCar(Auto car) {
			autos[0] = car;
			counterAuto++;
		}

		public Auto getTopSpeed() {
			Auto maxSpeedCar = null;
			for (int i = 1; i < autos.length; i++) {
				if (autos[i - 1].maxSpeed < autos[i].maxSpeed) {
					maxSpeedCar = autos[i];
				}
			}
			return maxSpeedCar;
		}
		
		public String toString() {
			String result = "";
			for (int i = 0; i < autos.length; i++) {
				if (autos[i] != null){
					result += autos[i] + "\n";
					}
				}
			return result;
			}
	}


}
