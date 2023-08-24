package EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
@Stateless
@LocalBean
public class Calculator implements CalculatorRemote {
	public int add(int a, int b)
	{
		return a + b;
	}
	public int sub(int a, int b)
	{
		return a-b ;
	}

    public Calculator() {
        // TODO Auto-generated constructor stub
    }

}


