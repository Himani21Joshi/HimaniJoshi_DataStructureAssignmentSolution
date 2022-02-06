package com.greatlearning.construction;

import java.util.*;

public class main {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building ");
		int floorsCount = scanner.nextInt();
		int[] floors = new int[floorsCount];
		for (int i = 0; i < floorsCount; i++) {
			System.out.println("Enter the floor size given on day : " + (i + 1));
			floors[i] = scanner.nextInt();
		}
		
		List<Integer> floorsToAssemble = new ArrayList<>();
		System.out.println("The order of construction is as follows : ");
		System.out.println();
		for (int i = 0; i < floorsCount; i++) {
			int floor = floors[i];
			floorsToAssemble.add(floor);
			System.out.println("Day : " + (i + 1));

           if (!service.largerFloor(floors, i + 1, floor)) {
				
				floorsToAssemble.stream().sorted(Collections.reverseOrder()).forEach(f -> System.out.print(f + " "));
				floorsToAssemble.clear();
			}
			System.out.println();
		}		
		scanner.close();
	}
}