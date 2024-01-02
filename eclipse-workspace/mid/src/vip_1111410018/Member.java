package vip_1111410018;
import java.util.Date;
public class Member {
	private int VIP_No;
	private String VIP_EmpName;
	private String  VIP_Gender;
	private float  VIP_Height;
	private float  VIP_Weight;	
	private int VIP_Pwd;
	private Date VIP_Birth;
	private String VIP_Phone;
	private String VIP_Address;
	private double VIP_Bouns;
	
	
	public Member(int VIP_No,String VIP_EmpName,String VIP_Gender,float  VIP_Height,float  VIP_Weight,int VIP_Pwd,Date VIP_Birth,String VIP_Phone,String VIP_Address,double VIP_Bouns) {
		this.setVIP_No(VIP_No);
		this.setVIP_EmpName(VIP_EmpName);
		this.setVIP_Gender(VIP_Gender);
		this.setVIP_Height(VIP_Height);
		this.setVIP_Weight(VIP_Weight);
		this.setVIP_Pwd(VIP_Pwd);
		this.setVIP_Birth(VIP_Birth);
		this.setVIP_Phone(VIP_Phone);
		this.setVIP_Address(VIP_Address);
		this.setVIP_Bouns(VIP_Bouns);	
	}
	public Member() {}
	    public String toString() {
		    System.out.printf("會員編號:%d%n,會員姓名:%s%n會員性別:%s%n會員身高:%f%n會員體重:%f%n會員密碼:%s%n會員生日:%t%n會員電話:%s%n會員地址:%s%n會員點數:%d%n",this.getVIP_No(),this.getVIP_EmpName(),this.getVIP_Gender(),this.getVIP_Height(),this.getVIP_Weight(),this.getVIP_Pwd(),this.getVIP_Birth(),
				this.getVIP_Phone(),this.getVIP_Address(),this.getVIP_Bouns());
		    return "1";
	}
	
	public int getVIP_No() {
		return VIP_No;
	}
	public void setVIP_No(int vIP_No) {
		VIP_No = vIP_No;
	}
	public String getVIP_EmpName() {
		return VIP_EmpName;
	}
	public void setVIP_EmpName(String vIP_EmpName) {
		VIP_EmpName = vIP_EmpName;
	}
	public String getVIP_Gender() {
		return VIP_Gender;
	}
	public void setVIP_Gender(String vIP_Gender) {
		VIP_Gender = vIP_Gender;
	}
	public float getVIP_Height() {
		return VIP_Height;
	}
	public void setVIP_Height(float vIP_Height) {
		VIP_Height = vIP_Height;
	}
	public float getVIP_Weight() {
		return VIP_Weight;
	}
	public void setVIP_Weight(float vIP_Weight) {
		VIP_Weight = vIP_Weight;
	}
	public int getVIP_Pwd() {
		return VIP_Pwd;
	}
	public void setVIP_Pwd(int vIP_Pwd) {
		VIP_Pwd = vIP_Pwd;
	}
	public Date getVIP_Birth() {
		return VIP_Birth;
	}
	public void setVIP_Birth(Date vIP_Birth) {
		VIP_Birth = vIP_Birth;
	}
	public String getVIP_Phone() {
		return VIP_Phone;
	}
	public void setVIP_Phone(String vIP_Phone) {
		VIP_Phone = vIP_Phone;
	}
	public String getVIP_Address() {
		return VIP_Address;
	}
	public void setVIP_Address(String vIP_Address) {
		VIP_Address = vIP_Address;
	}
	public double getVIP_Bouns() {
		return VIP_Bouns;
	}
	public void setVIP_Bouns(double vIP_Bouns) {
		VIP_Bouns = vIP_Bouns;
	}
}