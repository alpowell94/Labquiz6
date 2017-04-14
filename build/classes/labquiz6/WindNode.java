
package labquiz6;



public class WindNode {
    
    protected String county;
    protected int turbines;
    protected Float revenue;
    protected int population;
    protected WindNode next;
    
    
    
    public WindNode(String county,int turbines, Float revenue, int population){
        
        this.county = county;
        this.turbines = turbines;
        this.revenue = revenue;
        this.population = population;
        this.next = null;
        
        
        
    }
    public String getCounty(){
        
        return county;
        
    }
    
    public void setCounty(String county){
        
        this.county = county;
        
        
    }
    
     public int getTurbines(){
        
        return turbines;
        
    }
    
    public void setTurbines(int turbines){
        
        this.turbines = turbines;
        
        
    }
     public Float getRevenue(){
        
        return revenue;
        
    }
    
    public void setRevenue(Float revenue){
        
        this.revenue = revenue;
        
        
    }
     public int getPopulation(){
        
        return population;
        
    }
    
    public void setPopulation(int population){
        
        this.population = population;
        
        
    }
     public WindNode getNext(){
        
        return next;
        
    }
    
    public void setNext(WindNode next){
        
        this.next = next;
        
        
    }
    
    
    
    
 
}   
