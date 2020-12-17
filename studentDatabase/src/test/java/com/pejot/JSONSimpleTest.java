package com.pejot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

public class JSONSimpleTest {
  @Test
  public void toJsonTest() {

    JSONObject obj = new JSONObject();
    obj.put("name", "pejot.com");
    obj.put("age", 23);

    JSONArray list = new JSONArray();
    list.add("msg 1");
    list.add("msg 2");
    list.add("msg 3");

    obj.put("messages", list);
    String expObj = "{\"name\":\"pejot.com\",\"messages\":[\"msg 1\",\"msg 2\",\"msg 3\"],\"age\":23}";

    assertEquals(expObj, obj.toJSONString());
  }
}
