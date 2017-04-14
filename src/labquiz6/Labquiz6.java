
package labquiz6;


public class Labquiz6 {

 
    public static void main(String[] args) {
        
        WindLinkedList list = new WindLinkedList();
        list.add("Buena Vista", 262, 1.2f, 20493);
        list.add("Carroll", 133, 1.4f, 20498);
        list.add("Franklin", 300, 2.6f, 10295);
        list.add("Pottawattamie", 102, 2.0f, 93671);
        
        
        System.out.println("Number of Counties: "+list.size());
        System.out.printf("%s%18s\t%s%16s\t%s%n", "County", "Turbines", "Tax Revenue", "Population", "Revenue Per Person");
        
        
        list.sortCounty();
        WindNode nodeptr = list.getHead();
       
        for (int i = 0; i < list.size(); i++){
      
                System.out.printf("%s:\t%d\t\t%.1f Million\t%6d\t%n", nodeptr.getCounty(), nodeptr.getTurbines(), nodeptr.getRevenue(),  nodeptr.getPopulation());
            
            nodeptr = nodeptr.getNext();
        }
        
        
        System.out.println("Number of Counties: "+list.size());
        System.out.printf("%s%18s\t%s%16s\t%s%n", "County", "Turbines", "Tax Revenue", "Population", "Revenue Per Person");
        
        
        list.sortAscending();
        nodeptr = list.getHead();
        for (int i = 0; i < list.size(); i++){
            
                System.out.printf("%s:\t%d\t\t%.1f Million\t%6d\t%n", nodeptr.getCounty(), nodeptr.getTurbines(), nodeptr.getRevenue(),  nodeptr.getPopulation(), nodeptr.getRevPerPerson());
            
            nodeptr = nodeptr.getNext();
        }
        
      
       
        
        
       
        
        
        
        
    }
    
}
