package com.qa.infiniteterrainsystem;

import java.util.Random;
import java.util.Scanner;

public class Games {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	

		Random randnum = new Random(); // Random number generator

		// Game Variable:
	    String enemy = ("Spider Pig");


		int maxenemyHealth = 100;
		int enemyAttackDamage = 55;
		int distanceToTheEnemyBaseFromOrigin = 15;

		// Player VAriable

		int health = 100;
		int attackDamage = 55;
		int HealthPodsTreasure = 2; // Treasure are considered as Health Pods for this game

		// Potion allowance

		int healthPotionHealAmount = 15;
		
		boolean running = true;
		System.out.println(" Welcome to The Infinite Terrain System");
		
		
		GAME:  
		while(running) {
		
	
//			if (distanceToTheEnemyBaseFromOrigin < 0) {
//			System.out.println("Keep Walking");
//
//			if (distanceToTheEnemyBaseFromOrigin == 15) {
			
				int enemyHealth = randnum.nextInt(maxenemyHealth);
				System.out.println("\t#" + "has enemy" + "appeared" + "#\n");
				
				while (enemyHealth > 0) {
					
					System.out.println("\t" + enemy + "s HP:" + enemyHealth);
					System.out.println("\tPlayers HP:" + health);
					System.out.println("\n\tWhat would you like to do");

					System.out.println("\t1. Attack and Collect HealthPodsTreasure");
					System.out.println("\t2. Run!");

					String input = in.nextLine();

					if (input.equals("1")) {
						int DamageDealt = randnum.nextInt(enemyAttackDamage);
						int DamageTaken = randnum.nextInt(attackDamage);

						enemyHealth -= DamageDealt;
						health -= DamageTaken;

						System.out.println("\t> You tackeled the" + " " + enemy + " " + "for" + " " + DamageDealt + " " + "damage");
						System.out.println("\t>You received"  + " " + DamageTaken  + " " + "in revenge");

						if (health < 1) {
							System.out.println("\tYou have Taken too much Damage");
							break;
						}
					} else if (input.equals("2")) {
						System.out.println("\t> You run away from"  + " " + enemy + "!");
						continue;

					} else {
						System.out.println("\t Invalid command");

						if (health < 1) {
							System.out.println("barely made it out");
						if (maxenemyHealth > 1) {
							System.out.println(enemy + "defeated" + "Collect HealthPodTreasure");

						}

					}
				}
				}
				}

			}

	private static String enemies(double nextInt) {
		// TODO Auto-generated method stub
		return null;
	}

	
			
		
	}

