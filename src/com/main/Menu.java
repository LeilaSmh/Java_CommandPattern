/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.command.Command;
import com.command.TurnOffDevice;
import com.command.TurnOnDevice;
import com.command.TurnVolumeDown;
import com.command.TurnVolumeUp;
import com.invoker.DeviceButton;
import com.invoker.Remote;
import com.receiver.ElectronicDevice;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Menu {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        Scanner scanner;
        int choice;
        ElectronicDevice device;

        do {
            System.out.println("-------------Choose a device--------------\n"
                    + "\t1 -> Phone\n"
                    + "\t2 -> TV\n"
                    + "\t3 -> Computer\n"
                    + "\t0 -> Exit\n");

            do {
                scanner = new Scanner(System.in);
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter a number between 0 and 3");
                    scanner = new Scanner(System.in);
                }
                choice = scanner.nextInt();
                if (choice > 3 || choice < 0) {
                    System.out.println("Please enter a number between 0 and 3");
                }
            } while (choice > 3 || choice < 0);

            //Creating the receiver object
            device = Remote.getDevice(choice);

            if (choice == 0) {
                break;
            }

            int command = 0;

            do {
                System.out.println("\t-------------Choose a command--------------\n"
                        + "\t\t1 -> Turn ON the device\n"
                        + "\t\t2 -> Turn the volume UP\n"
                        + "\t\t3 -> Turn the volume DOWN\n"
                        + "\t\t4 -> Turn OFF the device\n"
                        + "\t\t0 -> Exit\n");

                do {
                    scanner = new Scanner(System.in);
                    while (!scanner.hasNextInt()) {
                        System.out.println("Please enter a number between 0 and 4");
                        scanner = new Scanner(System.in);
                    }
                    command = scanner.nextInt();
                    if (command > 4 || command < 0) {
                        System.out.println("Please enter a number between 0 and 4");
                    }
                } while (command > 4 || command < 0);

                Command cmd = null;

                //Creating command and associating with receiver
                switch (command) {
                    case 1:
                        cmd = new TurnOnDevice(device);
                        break;
                    case 2:
                        cmd = new TurnVolumeUp(device);
                        break;
                    case 3:
                        cmd = new TurnVolumeDown(device);
                        break;
                    case 4:
                        cmd = new TurnOffDevice(device);
                        break;
                    case 0:
                        continue;
                }

                //Creating invoker and associating with Command 
                DeviceButton btn = new DeviceButton(cmd);

                //Perform action on invoker object
                btn.press();
            } while (command != 0);
        } while (choice != 0);

        scanner.close();
    }

}
