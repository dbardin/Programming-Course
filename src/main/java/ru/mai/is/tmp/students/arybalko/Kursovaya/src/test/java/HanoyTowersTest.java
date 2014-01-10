import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HanoyTowersTest {
    HanoyTowers x;

	@Before
	public void setUp() throws Exception {  //setUp() инициализирует экземпляр тестируемого класса
        x=new HanoyTowers();
	}


	@Test
	public void testHanoyTowers() {
		for(int i=1;i<4;i++){
		  assertTrue(x.hanoyTowers(i)==i); //assertTrue проверяет,является ли результат выражения верным

			assertTrue(x.column1==1);
			assertTrue(x.column2==2);
			assertTrue(x.column3==3);
			x.move();
			assertTrue(x.column1==1);
			assertTrue(x.column2==2);
			assertTrue(x.column3==3);
		}

		
	}

}
