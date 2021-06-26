package net.inull.register;

/**
 * Created by Aiden on 2016/2/18.
 */
public class Person
{
  private String strName; // 编程语言的名字
  private int intImageId; // 编程语言的图像id
  private String strJson;

  public Person(String strName, int intImageId, String strJson)
  {
    this.strName = strName;
    this.intImageId = intImageId;
    this.strJson = strJson;
  }

  public String getName()
  {
    return strName;
  }

  public void setName(String strName)
  {
    this.strName = strName;
  }

  public int getImageId()
  {
    return intImageId;
  }

  public void setImageId(int intImageId)
  {
    this.intImageId = intImageId;
  }

  public void setJson(String strJson)
  {
    this.strJson = strJson;
  }

  public String getJson()
  {
    return strJson;
  }
}

