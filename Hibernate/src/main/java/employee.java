
public class employee {
private int empNo;
private String name;
public employee(int empNo, String name) {
	super();
	this.empNo = empNo;
	this.name = name;
}
@Override
public String toString() {
	return "employee [empNo=" + empNo + ", name=" + name + "]";
}
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
