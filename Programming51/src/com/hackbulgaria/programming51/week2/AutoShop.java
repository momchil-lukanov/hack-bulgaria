package com.hackbulgaria.programming51.week2;

import org.omg.PortableServer.ForwardRequestHelper;

public class AutoShop {

	public Auto[] autos = new Auto[10];
	int counterAuto = 0;

	public void addCar(Auto car) {
		autos[counterAuto] = car;
		counterAuto++;
	}

	public Auto getTopSpeed() {
		Auto maxSpeedCar = autos[1];
		for (int i = 0; i < counterAuto; i++) {
			if (maxSpeedCar.maxSpeed < autos[i].maxSpeed) {
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
