/**
 * Calculator class with addition, subtraction, multiplication, and division functions.
 *
 * @author Yun Hui Xu (1212530629)
 * @version 2/24/2019
 */

package cse360assign2;

public class Calculator {

    private int total;

    /**
     * Constructor for Calculator class
     * 
     * @return void
     */
    public Calculator() {
        this.total = 0; // not needed - included for clarity
    }

    /**
     * Gets the total after any calculations done with the calculator
     * 
     * @return void
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Adds the provided value with the total variable
     * 
     * @param value an integer to add in the calculator
     * @return void
     */
    public void add(int value) {
        this.total += value;
    }

    /**
     * Subtracts the provided value with the total variable
     * 
     * @param value an integer to subtract in the calculator
     * @return void
     */
    public void subtract(int value) {
        this.total -= value;
    }

    /**
     * Multiplies the provided value with the total variable
     * 
     * @param value an integer to multiply in the calculator
     * @return void
     */
    public void multiply(int value) {
        this.total *= value;
    }

    /**
     * Divides the total by the parameter, does integer division and if provided
     * value is zero, the total after division will be set to 0. No exceptions will
     * be raised.
     * 
     * @param value an integer to divide in the calculator
     * @return void
     */
    public void divide(int value) {
        if (value == 0) {
            this.total = 0;
        } else {
            this.total /= value;
        }
    }

    /**
     * Prints the history of actions done in the calculator
     * 
     * @return void
     */
    public String getHistory() {
        return "";
    }
}