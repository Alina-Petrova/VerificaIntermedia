/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacce;

import java.util.Objects;

/**
 *
 * @author utente
 */
public class Computer implements Ordinabile<Computer>, Comparable<Computer>{

    @Override
    public int compareTo(Computer o) {
        return confronta(o);
    }
    private final String marca;
    private final int ram;

    public Computer(String marca, int ram) {
        this.marca = marca;
        this.ram = ram;
    }

    @Override
    public int confronta(Computer c) {
        return this.ram-c.getRam();
    }
    
    public String getMarca() {
        return marca;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computer{" + "marca=" + marca + ", ram=" + ram + '}'+"\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.marca);
        hash = 31 * hash + this.ram;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Computer other = (Computer) obj;
        if (this.ram != other.ram) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }
    

}
