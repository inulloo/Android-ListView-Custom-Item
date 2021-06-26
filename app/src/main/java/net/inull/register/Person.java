package net.inull.register;

public class Person
{
  // 名字
  private String strName = null;
  // 图片 id
  private Integer intImageId = null;
  // 其它数据
  private String strJson = null;

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

  public String getJson()
  {
    return strJson;
  }

  public void setJson(String strJson)
  {
    this.strJson = strJson;
  }

}

