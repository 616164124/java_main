package zb.加密;

import com.alibaba.fastjson.JSONObject;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;


public class MemToken {
	
	private final Map<String, Map> MANAGED_TOKEN = new HashMap<String, Map>();
	private static  MemToken instance=null;
	
	private MemToken() {
		
	}

	public static MemToken getInstance() {
		if(instance==null) {
			instance=new MemToken();
		}
		return instance;
	}
	
	public void generateToken(String key,String value) {
		byte[] bytes=Base64.getDecoder().decode(key);
		String dekey=new String(bytes);
		JSONObject json=JSONObject.parseObject(dekey);
		String userid=json.getString("userid");
		String token=json.getString("token");
		HashMap map=new HashMap();
		map.put(token, value);
		MANAGED_TOKEN.put(userid, map);
	}
	
	public String getTokenValue(String key) {
		byte[] bytes=Base64.getDecoder().decode(key);
		String dekey=new String(bytes);
		JSONObject json=JSONObject.parseObject(dekey);
		String userid=json.getString("userid");
		String token=json.getString("token");
//		HashMap map=new HashMap();
//		map.put(token, value);
//		MANAGED_TOKEN.put(userid, map);
		
		Map map=MANAGED_TOKEN.get(userid);
		
		if(map==null)return "";
		String value=(String)map.get(token);
		
		if(value==null||"".equals(value))
			return "";
		
		long curtime=System.currentTimeMillis();
		long ltime=0;
		try {
			JSONObject tkjson=JSONObject.parseObject(value);
			String strtime=tkjson.getString("time");
			ltime=Long.parseLong(strtime);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("time:"+(curtime-ltime));
		if(curtime-ltime<7200*1000) {
			return value;
		}else {
			return "";
		}
	}
	
	public String getTokenId() {
		String id=java.util.UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println(id);
		return id;
	}
	
	public static void main(String[] args) {
		JSONObject keyjson=new JSONObject();
		keyjson.put("userid", "12141231313");
		keyjson.put("token", MemToken.getInstance().getTokenId());

		String str=keyjson.toJSONString();
		String key=Base64.getEncoder().encodeToString(str.getBytes());
		System.out.println("key:"+key);
		System.out.println("==================");
		JSONObject valuejson=new JSONObject();
		valuejson.put("clientid", "clientid");
		valuejson.put("userid", "12141231313");
		valuejson.put("clientsecret", "clientsecret");
		valuejson.put("username", "测试");
		valuejson.put("nsrsbh", "913344441");
		valuejson.put("nsrmc", "测试企业");
		valuejson.put("time", String.valueOf(System.currentTimeMillis()));
		MemToken.getInstance().generateToken(key, valuejson.toJSONString());

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("===>key=\t"+key);
		String ret=MemToken.getInstance().getTokenValue(key);
		System.out.println("ret:"+ret);
	}
}
