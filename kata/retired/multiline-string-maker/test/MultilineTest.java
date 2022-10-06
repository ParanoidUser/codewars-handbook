import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MultilineTest {
  @Test
  void fixedTest1() {
    assertEquals("String catSound=\"meow\";", MultilineMaker.make("catSound", "meow"));
    assertEquals("String m=\"zmaZ\\\\\";", MultilineMaker.make("m", "zmaZ\\"));
    assertEquals("String greetings=\"Hello\\n\"+\n\"Goodbye\";", MultilineMaker.make("greetings", "Hello\nGoodbye"));
  }

  @Test
  void fixedTest2() {
    String c = "String a=\"public class Cake\\n\"+\n\"{\\n\"+\n\"	private double price;\\n\"+\n\"	private String color;\\n\"+\n\"	public Cake(double price, String color)\\n\"+\n\"	{\\n\"+\n\"		this.price=price;\\n\"+\n\"		this.color=color;\\n\"+\n\"	}\\n\"+\n\"	public double getPrice()\\n\"+\n\"	{\\n\"+\n\"		return price;\\n\"+\n\"	}\\n\"+\n\"	public void setPrice(double price)\\n\"+\n\"	{\\n\"+\n\"		this.price=price;\\n\"+\n\"	}\\n\"+\n\"	public String getColor()\\n\"+\n\"	{\\n\"+\n\"		return color;\\n\"+\n\"	}\\n\"+\n\"	public void setColor(String color)\\n\"+\n\"	{\\n\"+\n\"		this.color=color;\\n\"+\n\"	}\\n\"+\n\"	public String toString()\\n\"+\n\"	{\\n\"+\n\"		return \\\"Price: \\\"+price+\\\"\\\\n\\\"\\n\"+\n\"			+\\\"Color: \\\"+color;\\n\"+\n\"	}\\n\"+\n\"}\";";
    assertEquals(c, MultilineMaker.make("a", "public class Cake\n{\n	private double price;\n	private String color;\n	public Cake(double price, String color)\n	{\n		this.price=price;\n		this.color=color;\n	}\n	public double getPrice()\n	{\n		return price;\n	}\n	public void setPrice(double price)\n	{\n		this.price=price;\n	}\n	public String getColor()\n	{\n		return color;\n	}\n	public void setColor(String color)\n	{\n		this.color=color;\n	}\n	public String toString()\n	{\n		return \"Price: \"+price+\"\\n\"\n			+\"Color: \"+color;\n	}\n}"));
  }

  @Test
  void fixedTest3() {
    String c = "String a=\"public class ID\\n\"+\n\"{\\n\"+\n\"	private String name;\\n\"+\n\"	private int idNumber;\\n\"+\n\"	private boolean expired;\\n\"+\n\"	public ID(String name, int idNumber, boolean expired)\\n\"+\n\"	{\\n\"+\n\"		this.name=name;\\n\"+\n\"		this.idNumber=idNumber;\\n\"+\n\"		this.expired=expired;\\n\"+\n\"	}\\n\"+\n\"	public String getName()\\n\"+\n\"	{\\n\"+\n\"		return name;\\n\"+\n\"	}\\n\"+\n\"	public void setName(String name)\\n\"+\n\"	{\\n\"+\n\"		this.name=name;\\n\"+\n\"	}\\n\"+\n\"	public int getIdNumber()\\n\"+\n\"	{\\n\"+\n\"		return idNumber;\\n\"+\n\"	}\\n\"+\n\"	public void setIdNumber(int idNumber)\\n\"+\n\"	{\\n\"+\n\"		this.idNumber=idNumber;\\n\"+\n\"	}\\n\"+\n\"	public boolean getExpired()\\n\"+\n\"	{\\n\"+\n\"		return expired;\\n\"+\n\"	}\\n\"+\n\"	public void setExpired(boolean expired)\\n\"+\n\"	{\\n\"+\n\"		this.expired=expired;\\n\"+\n\"	}\\n\"+\n\"	public String toString()\\n\"+\n\"	{\\n\"+\n\"		return \\\"Name: \\\"+name+\\\"\\\\n\\\"\\n\"+\n\"			+\\\"Id Number: \\\"+idNumber+\\\"\\\\n\\\"\\n\"+\n\"			+\\\"Expired: \\\"+expired;\\n\"+\n\"	}\\n\"+\n\"}\";";
    assertEquals(c, MultilineMaker.make("a", "public class ID\n{\n	private String name;\n	private int idNumber;\n	private boolean expired;\n	public ID(String name, int idNumber, boolean expired)\n	{\n		this.name=name;\n		this.idNumber=idNumber;\n		this.expired=expired;\n	}\n	public String getName()\n	{\n		return name;\n	}\n	public void setName(String name)\n	{\n		this.name=name;\n	}\n	public int getIdNumber()\n	{\n		return idNumber;\n	}\n	public void setIdNumber(int idNumber)\n	{\n		this.idNumber=idNumber;\n	}\n	public boolean getExpired()\n	{\n		return expired;\n	}\n	public void setExpired(boolean expired)\n	{\n		this.expired=expired;\n	}\n	public String toString()\n	{\n		return \"Name: \"+name+\"\\n\"\n			+\"Id Number: \"+idNumber+\"\\n\"\n			+\"Expired: \"+expired;\n	}\n}"));
  }
}