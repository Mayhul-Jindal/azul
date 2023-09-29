package javaPractice.designPatterns;

// todo perplexity
/*
 * Factory method is a creational design pattern which solves the problem of 
 * creating product objects without specifying their concrete classes.
*/

interface Button {
    void render();
    void onClick();
}

class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! html Button says - 'Hello World!'");
    }
}

class WindowsButton implements Button {

    public void render() {
        System.out.println("<winbutton>Test Button</winbutton>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! win Button says - 'Hello World!'");
    }
}

abstract class Dialog {
    public void renderWindow() {
        // ...other code...
        Button okButton = createButton();
        okButton.render();
    }

    // this cas be decalred latter 
    abstract Button createButton();
}

class HtmlDialog extends Dialog {

    public Button createButton() {
        return new HtmlButton();
    }
}

class WindowsDialog extends Dialog {

    public Button createButton() {
        return new WindowsButton();
    }
}

// yeh khud se likhe feel karunga
public class FactoryExample {

    // public static void main(String[] args) {
        
    // }
}