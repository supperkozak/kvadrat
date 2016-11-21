package kvadrat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	/*   ax^2 + bx + c = 0   */
			
	@Column
	private int a;
	@Column
	private int b;
	@Column
	private int c;
	@Column
	private int x1;
	@Column
	private int x2;
	
	public Data() {
		
	}
	
	public Data(int a, int b, int c, int x1, int x2) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.x1 = x1;
		this.x2 = x2;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
