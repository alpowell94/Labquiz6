
package labquiz6;


public class WindLinkedList {
    
    private WindNode head;
    
    public WindLinkedList(){
    }
    
    public WindNode getHead(){
        
        return head;
        
    }
    
    
    public void setHead(WindNode head){
        
        this.head = head;
        
        
    }
    
    
    public boolean isEmpty(){
        
        if(head == null){
            return true;
            
        }else {
            return false;
        }
    }
    
    public void add(String county,int turbines, Float revenue, int population){
        if(isEmpty()){
            head = new WindNode(county, turbines, revenue, population);
        } else{
            WindNode current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new WindNode(county, turbines, revenue, population));
            
        }
        
        
    }
    
            public void sortAscending () {
WindNode p0, p1, p2;
for (int i=1; i<size(); i++) {
p0 = head;
p1 = head;
p2 = p1.getNext();
for (int k=1; k<size(); k++) {
if (p1.getTurbines().compareTo(p2.getTurbines()) {
swap(p0, p1, p2); // actual link changes done here
}
if (k == 1) p0 = head;
else p0 = p0.getNext();
p1 = p0.getNext();
p2 = p1.getNext();
}
}
}

            public void sortAscending2 () {
WindNode p0, p1, p2;
for (int i=1; i<size(); i++) {
p0 = head;
p1 = head;
p2 = p1.getNext();
for (int k=1; k<size(); k++) {
if (p1.getCounty() > (p2.getCounty()) {
swap(p0, p1, p2); // actual link changes done here
}
if (k == 1) p0 = head;
else p0 = p0.getNext();
p1 = p0.getNext();
p2 = p1.getNext();
}
}
}
            
            public void swap(WindNode p0, WindNode p1, WindNode p2) {
WindNode p3;
p3 = p2.getNext(); // this processes a new head node
if (head == p1) {
head = p2;
p2.setNext(p1);
p1.setNext(p3);
return;
}
p0.setNext(p2); // this processes a swap anywhere else
p2.setNext(p1);
p1.setNext(p3);
            }
    
    public Integer size(){
        Integer size = 0;
        WindNode current = head;
        while (current != null){
            size++;
            current = current.getNext();
            
            
        }
        
        return size;
        
        
    }
    
}
