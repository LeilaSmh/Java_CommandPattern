/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invoker;

import com.command.Command;
import com.command.TurnOnDevice;
import com.receiver.Computer;
import com.receiver.ElectronicDevice;
import com.receiver.Phone;
import com.receiver.TV;

/**
 *
 * @author Dell
 */
public class Remote {
    
    public static ElectronicDevice getDevice(int device){
        switch (device){
            case 1: 
                return new Phone();
            case 2:
                return new TV();
            case 3:
                return new Computer();
            default:
                return null;
        }
    }
}
