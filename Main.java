public class Main {
    public static void main(String[] args) {       

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addToBeginning("Element 0");
        linkedList.addToEnd("Element 1"); 
        linkedList.addToEnd("Element 2");  
        
         System.out.println(linkedList.size()); // Выводит: 3
           
        System.out.println(linkedList.get(0)); // Выводит: Element 0
        System.out.println(linkedList.get(1)); // Выводит: Element 1 
        System.out.println(linkedList.get(2)); // Выводит: Element 2
                 
    }
}


