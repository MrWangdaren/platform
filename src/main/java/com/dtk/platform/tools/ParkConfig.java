package com.dtk.platform.tools;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Element;

/**
 * 
 * @Description 分解XML文件
 * @author DL
 * @date 2017年6月15日 下午2:45:13
 */
public class ParkConfig {

	public static final String CONFIG_FILE = "ParkConfig.xml";
	public static final String ROOT = "ParkConfig";
	public static Element root = null;

	public static void initConfig() throws Exception {
		if (root == null)
			synchronized (ParkConfig.class) {
				root = XmlReadTools.parseXmlFile(CONFIG_FILE);
				if (!root.getName().equals(ROOT)) {
					root = null;
					throw new Exception(CONFIG_FILE + "根目录不是" + ROOT);
				}
			}
	}

	public static Map<String, String> getConfigItemsByKind(String kind) throws Exception {
		initConfig();
		Map<String, String> map = new HashMap<String, String>();
		List<?> kindElements = root.elements("ConfigKind");
		for (int i = 0; i < kindElements.size(); i++) {
			if (((Element) kindElements.get(i)).attributeValue("name").equals(kind)) {
				for (int j = 0; j < ((Element) kindElements.get(i)).elements().size(); j++) {
					Element itemElement = (Element) ((Element) kindElements.get(i)).elements().get(j);
					map.put(itemElement.attributeValue("name"), itemElement.getTextTrim());
				}
			}
		}
		return map;
	}

	public static String getConfigItem(String sConfKind, String pItemName) throws Exception {
		Map<String, String> map = getConfigItemsByKind(sConfKind);
		return (String) map.get(pItemName);
	}

	public static void main(String[] args) {
		try {
			String value = ParkConfig.getConfigItem("MinaConfig", "MinaIp");
			System.out.println(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
