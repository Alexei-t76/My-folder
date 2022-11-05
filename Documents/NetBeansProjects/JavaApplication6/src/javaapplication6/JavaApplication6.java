
package javaapplication6;


public class JavaApplication6 {

    
    public static void main(String[] args) {
        
        FSServer server = new FSServer(".");
        server.addClient(new FSMonitor() {
            @Override
            public void event(String fName, int kind) {
                switch(kind) {
                    case FSMonitor.CREATE:
                        System.out.println("file created " + fName);
                        break;
                        
                    case FSMonitor.REMOVE:
                        System.out.println("file removed " + fName);
                        break;
                        
                    default: System.out.println("Eto Xyinya!");  
                }
            }
        });
        
        server.start();
        
    }
    
}
