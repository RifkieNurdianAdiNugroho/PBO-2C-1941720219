
package praktikum;

public class InternshipEmployee extends Employee {
    private int length;
    
    public InternshipEmployee(String name,int length){
        this.length =length;
        this.name = name;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public String getEmployee(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as aintership employee for "+length+" month/s\n";
        return info;
    }
}
