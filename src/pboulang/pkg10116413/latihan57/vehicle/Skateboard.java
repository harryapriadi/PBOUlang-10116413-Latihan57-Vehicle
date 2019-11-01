/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan57.vehicle;

/**
 *
 * @author Lenovo
 */
public class Skateboard extends Vehicle {

    private double myBoardLength;

    public Skateboard() {
        System.out.println("SkateBoard");
        super.setBrand("Ally Skate");
        System.out.println("Brand : " + super.getBrand());
        super.setModel("Rocket");
        System.out.println("Model : " + super.getModel());
        setBoardLength(54.5);
        System.out.println("Panjangnya Board : " + getBoardLength());
    }

    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }

}
